package utility;
/*
A hash map class which instead of rewriting the contents of a value concatenates the old value and new value
 */
import java.util.*;
public class MyHashMap extends HashMap<String,String> {


    /**
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public String put(String key, String value) {
        String newV = value;
        if (containsKey(key)) {
            String oldV = get(key);
            newV = oldV + "-" + newV;
        }
        return super.put(key, newV);
    }
}