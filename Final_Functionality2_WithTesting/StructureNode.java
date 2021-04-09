/*
For print information structurally
 */
public class StructureNode {
    private String preinforation;
    private String stop_id;
    private String stop_code;
    private String stop_name;
    private String stop_desc;
    private String top_lat;
    private String stop_lon;
    private String zone_id;
    private String stop_url;
    private String location_type;
    private String parent_station;
    StructureNode(String preinforation)
    {
        this.preinforation = preinforation;
        String[] arr = this.preinforation.split(",");
        stop_id = arr[0];

        stop_code = arr[1];
        stop_name= arr[2];
        stop_desc= arr[3];
        top_lat= arr[4];
        stop_lon= arr[5];
        zone_id= arr[6];

        //7
        stop_url= "null";
        //8
        location_type= "0";
        //9
        parent_station= "null";

    }
    public String getCurrentFullInformation()
    {
        String fullInformation =  "			------------------------------------"+"\n\n"+
                "			Stop Name: " + stop_name + "\n" +
                "			Description: " + stop_desc + "\n" +
                "			Id: " + stop_id + "\n" +
                "			Code: " + stop_code + "\n" +
                "			Location: " + location_type +"\n" +
                "			Latitude: " + top_lat + "\n" +
                "			Longitude: " + stop_lon + "\n" +
                "			Zone: " + zone_id + "\n" +
                "			URL: " + stop_url + "\n" +
                "			Parent(String) location: " + parent_station + "\n" +
                "\n";
        return fullInformation;
    }

    @Override
    public String toString() {
        return
                "			------------------------------------"+"\n"+
                "			Stop Name: " + stop_name + "\n" +
                "			Description: " + stop_desc + "\n" +
                "			Id: " + stop_id + "\n" +
                "			Code: " + stop_code + "\n" +
                "			Location: " + location_type +"\n" +
                "			Latitude: " + top_lat + "\n" +
                "			Longitude: " + stop_lon + "\n" +
                "			Zone: " + zone_id + "\n" +
                "			URL: " + stop_url + "\n" +
                "			Parent(String) location: " + parent_station + "\n" +
                "\n";
    }
}
