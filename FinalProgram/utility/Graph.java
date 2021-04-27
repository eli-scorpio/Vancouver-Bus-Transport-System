package utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/*
A simple graph class used for Function1 it used because
 */


import java.util.ArrayList;
import java.util.HashMap;

/*
A simple graph class used for Function1 it used because
 */


public class Graph {
    public HashMap<Integer, ArrayList<BusStopEdge>> adjacencyList = new HashMap<>();
    public HashMap<Integer, String> busNames;

    public Set<Integer> vertices;

    public  int V;

    private void getAllStops() throws IOException {
        busNames = new HashMap<>();
        Input input = new Input(System.getProperty("user.dir")+"/FinalProgram/stops.txt");

        String currentLine = input.nextLine();
        currentLine = input.nextLine();

        while (currentLine != null) {
            String[] tokens = currentLine.split(",");
            int id = Integer.parseInt(tokens[0]);
            String name = tokens[2];
            busNames.put(id, name);
            adjacencyList.put(id, new ArrayList<>());
            currentLine = input.nextLine();
        }
        input.close();
    }

    private void getDataFromStopTimesTxt() throws IOException {
        Input input = new Input(System.getProperty("user.dir")+"/FinalProgram/stop_times.txt");

        String currentLine = input.nextLine();
        currentLine = input.nextLine();

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
                BusStopEdge bse =new BusStopEdge(1, previousStopId, stopId);
                if(!current.contains(bse))
                {
                    current.add(bse);
                }
            }
            previousStopId = stopId;
            previousTripId = tripId;
            currentLine = input.nextLine();
        }

        if (tripId == previousTripId) {
            if (adjacencyList.get(previousStopId) == null) {
                adjacencyList.put(previousStopId, new ArrayList<>());
            }
            current = adjacencyList.get(previousStopId);
            BusStopEdge bse =new BusStopEdge(1, previousStopId, stopId);
            if(!current.contains(bse))
            {
                current.add(bse);
            }
        }

        input.close();
    }

    private void getDataFromTransfersTxt() throws IOException {
        Input input = new Input(System.getProperty("user.dir")+"/FinalProgram/transfers.txt");

        String currentLine = input.nextLine();
        currentLine = input.nextLine();

        ArrayList<BusStopEdge> current;

        while (currentLine != null) {
            String tokens[] = currentLine.split(",");
            int from_id = Integer.parseInt(tokens[0]);
            int to_id = Integer.parseInt(tokens[1]);
            int transfer_type = Integer.parseInt(tokens[2]);

            if (transfer_type == 0)
            {
                if (adjacencyList.get(from_id) == null) {
                    adjacencyList.put(from_id, new ArrayList<>());
                }

                current = adjacencyList.get(from_id);
                current.add(new BusStopEdge(1, from_id, to_id));

                if (adjacencyList.get(to_id) == null) {
                    adjacencyList.put(to_id, new ArrayList<>());
                }

                current = adjacencyList.get(to_id);
                current.add(new BusStopEdge(1, to_id, from_id));
            }
            else if(transfer_type == 2)
            {
                int min_transfer_time = Integer.parseInt(tokens[3]);
                double transferTime = min_transfer_time*1.0/100;
                if (adjacencyList.get(from_id) == null) {
                    adjacencyList.put(from_id, new ArrayList<>());
                }

                current = adjacencyList.get(from_id);
                current.add(new BusStopEdge(transferTime, from_id, to_id));

                if (adjacencyList.get(to_id) == null) {
                    adjacencyList.put(to_id, new ArrayList<>());
                }

                current = adjacencyList.get(to_id);
                current.add(new BusStopEdge(transferTime, to_id, from_id));
            }
            currentLine = input.nextLine();
        }
        input.close();
    }

    public Graph() throws IOException {
        getAllStops();
        getDataFromStopTimesTxt();
        getDataFromTransfersTxt();
        V = adjacencyList.size();
        vertices = adjacencyList.keySet();
    }
}
