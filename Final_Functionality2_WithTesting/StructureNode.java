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
        String fullInformation =  "------------------------------------"+"\n"+
                "Shop Id is" + stop_id + "\n" +
                "Shop code is'" + stop_code + "\n" +
                "Shope Name is'" + stop_name + "\n" +
                "Shop description'" + stop_desc + "\n" +
                "The latitude of Shop is  " + top_lat + "\n" +
                "The longitude of Shop is  " + stop_lon + "\n" +
                "The zone of shop is" + zone_id + "\n" +
                "The url of shop is" + stop_url + "\n" +
                "The location type is " + location_type +"\n" +
                "Parent(String) location is '" + parent_station + "\n" +
                "\n"+
                "------------------------------------";
        return fullInformation;
    }

    @Override
    public String toString() {
        return
                "------------------------------------"+"\n"+
                "Shop Id is" + stop_id + "\n" +
                "Shop code is'" + stop_code + "\n" +
                "Shope Name is'" + stop_name + "\n" +
                "Shop description'" + stop_desc + "\n" +
                "The latitude of Shop is  " + top_lat + "\n" +
                "The longitude of Shop is  " + stop_lon + "\n" +
                "The zone of shop is" + zone_id + "\n" +
                "The url of shop is" + stop_url + "\n" +
                "The location type is " + location_type +"\n" +
                "Parent(String) location is '" + parent_station + "\n" +
                "\n"+
        "------------------------------------";
    }
}
