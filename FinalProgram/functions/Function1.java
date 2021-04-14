package functions;

import utility.Graph;

/*
author: Pavel Petrukhin

Class which implements function 1, shortest path between two stops
 */
public class Function1
{
    Graph graph;

    public Function1()
    {
        try {
            Graph graph = new Graph();
        }
        catch (Exception e)
        {
            System.err.println(e);
            System.err.println("ERROR");
        }

    }


    public String findShortestPathById(int from_id, int to_id)
    {
        return "";
    }
}
