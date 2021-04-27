package utility;

public class BusStopEdge  {

    public int from_id;
    public int to_id;
    public double w;

    public BusStopEdge(double w, int from_id, int to_id) {
        this.w = w;
        this.from_id = from_id;
        this.to_id = to_id;
    }

    @Override
    public boolean equals(Object other)
    {
        BusStopEdge b = (BusStopEdge)other;

        return b.from_id == b.from_id && b.to_id == b.to_id;
    }
}