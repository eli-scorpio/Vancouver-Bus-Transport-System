package utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/*
A simple graph class used for Function1 it used because
 */

class BusStopEdge {

    int from_id;
    int to_id;
    double w;

    public BusStopEdge(double w, int from_id, int to_id) {
        this.w = w;
        this.from_id = from_id;
        this.to_id = to_id;
    }
}

public class Graph {
    HashMap<Integer, ArrayList<BusStopEdge>> adjacencyList;
    HashMap<Integer, String> busNames;

    private void getAllStops() throws IOException {
        busNames = new HashMap<>();
        Input input = new Input("./stops.txt");

        String currentLine = input.nextLine();

        while (currentLine != null) {
            String[] tokens = currentLine.split(",");
            int id = Integer.parseInt(tokens[0]);
            String name = tokens[2];

            busNames.put(id, name);
        }
        input.close();
    }

    private void getDataFromStopTimesTxt() throws IOException {
        Input input = new Input("./stop_times.txt");
        String currentLine = input.nextLine();
        int previousTripId = -1;
        int previousStopId = -1;
        ArrayList<BusStopEdge> current = null;
        int tripId = 0;
        int stopId = 0;
        while (currentLine != null) {
            String[] tokens = currentLine.split(",");
            tripId = Integer.parseInt(tokens[0]);
            stopId = Integer.parseInt(tokens[3]);

            if (tripId == previousTripId) {
                if (adjacencyList.get(previousStopId) == null) {
                    adjacencyList.put(previousStopId, new ArrayList<>());
                }

                current = adjacencyList.get(previousStopId);
                current.add(new BusStopEdge(1, previousStopId, stopId));


            }


            previousStopId = stopId;
            previousTripId = tripId;
            input.nextLine();
        }

        if (tripId == previousTripId) {
            if (adjacencyList.get(previousStopId) == null) {
                adjacencyList.put(previousStopId, new ArrayList<>());
            }
            current = adjacencyList.get(previousStopId);
            current.add(new BusStopEdge(1, previousStopId, stopId));
        }

        input.close();
    }

    private void getDataFromTransfersTxt() throws IOException {
        Input input = new Input("./transfers.txt");

        String currentLine = input.nextLine();
        ArrayList<BusStopEdge> current;

        while (currentLine != null) {
            String tokens[] = currentLine.split(",");
            int from_id = Integer.parseInt(tokens[0]);
            int to_id = Integer.parseInt(tokens[1]);
            int transfer_type = Integer.parseInt(tokens[2]);
            int min_transfer_time = Integer.parseInt(tokens[3]);

            if (transfer_type == 0)
            {
                if (adjacencyList.get(from_id) == null) {
                    adjacencyList.put(from_id, new ArrayList<>());
                }

                current = adjacencyList.get(from_id);
                current.add(new BusStopEdge(1, from_id, to_id));
            }
            else if(transfer_type == 2)
            {
                double transferTime = min_transfer_time*1.0/100;
                if (adjacencyList.get(from_id) == null) {
                    adjacencyList.put(from_id, new ArrayList<>());
                }

                current = adjacencyList.get(from_id);
                current.add(new BusStopEdge(transferTime, from_id, to_id));
            }
        }
        input.close();
    }



    public Graph() throws IOException {
        getAllStops();

        adjacencyList = new HashMap<>();

        getDataFromStopTimesTxt();
        getDataFromTransfersTxt();
    }
}
