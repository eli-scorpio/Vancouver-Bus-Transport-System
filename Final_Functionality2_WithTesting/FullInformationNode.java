import java.util.ArrayList;

/*
Data structure for functionality 2
only name is useful information,other information is Redundancy
We need to construct a HashMap<String,String>
First variable for Name,Second string for full information
 */
public class FullInformationNode {
    private String fullInformation;
    private String busName;
    public FullInformationNode(String fullInformation)
    {
        this.fullInformation = fullInformation;
        String[] arr = this.fullInformation.split(",");
        String tempName = arr[2];
        tempName = dealingwithName(tempName);
        this.busName = tempName;
    }

    public String getBusName() {
        return busName;
    }

    public String getFullInformation() {
        return fullInformation;
    }

    String dealingwithName(String name)
    {
        /*
        In order for this to provide meaningful search functionality
        please move keywords flagstop, wb, nb, sb, eb
        from start of the names to the end of the names of the stops when reading the file into a TST
        (eg “WB HASTINGS ST FS HOLDOM AVE” becomes “HASTINGS ST FS HOLDOM AVE WB”)


         */
        String origianlString = name;


        StringBuilder myStringbuilderFianlArray = new StringBuilder();


        ArrayList<String>stringlistnmae = new ArrayList<>();
        String arryProcess[] = name.split(" ");//split by blank
        for(int i = 0 ;i<arryProcess.length;i++)
        {
            //myStringbuilderStroage.append(arryProcess[i]);
            stringlistnmae.add(arryProcess[i]);
        }
        /*

        In order for this to provide meaningful search functionality please move keywords
         flagstop, wb, nb, sb, eb from start of the names to
         the end of the names of the stops
         */
        String firstString = stringlistnmae.get(0);
        if(
                firstString.equalsIgnoreCase("flagstop")||
                firstString.equalsIgnoreCase("wb")||
                        firstString.equalsIgnoreCase("nb")
                        ||firstString.equalsIgnoreCase("eb")||
                        firstString.equalsIgnoreCase("sb")


        )
        {
            stringlistnmae.remove(0);
            int sizeOfNewString = stringlistnmae.size();
            for(int i =0 ;i<sizeOfNewString;i++)
            {
                String temp = stringlistnmae.get(i);
                myStringbuilderFianlArray.append(temp);
                String blank = " ";
                myStringbuilderFianlArray.append(blank);
            }
            myStringbuilderFianlArray.append(firstString);
            return myStringbuilderFianlArray.toString();
        }
        else
        {
            return origianlString;
        }



    }

}
