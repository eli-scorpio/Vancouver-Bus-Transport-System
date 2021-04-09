import java.util.ArrayList;

public class Pair <Type1,Type2>{
    ArrayList<Type1> type1;
    ArrayList<Type2> type2;

    Pair(ArrayList<Type1> type1s, ArrayList<Type2> type2s) {
        this.type1 = type1s;
        this.type2 = type2s;
    }

    public ArrayList<Type2> getKey() {
        return type2;
    }

    public ArrayList<Type1> getValue() {
        return type1;
    }
}
