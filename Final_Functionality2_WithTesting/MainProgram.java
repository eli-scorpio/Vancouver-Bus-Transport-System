import java.io.FileNotFoundException;
import java.util.*;
/*
Weclome page:
We assume we are a Company in Canda
 */
/*
Weclome page:
We assume we are a Company in Canda
 */
/*
In order to add user experience
we need to add a progress bar(optional)
sicne some query need waiting time (assumption)
just catering for impatient user (which is important in the
real world)
And firsting I think we need to construct
Starting machine like this
It is similar like progress bar
-
--
----
we could use this time to read data from file
And might use LRU algorithm to recorded user query history
in order to query fast
 */

public class MainProgram {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = "stops.txt";
        TernarySearchTree myTeneraySearchTree = new TernarySearchTree();
        Input input = new Input(inputFile);
        int toalRow = 8757;
        MyHashMap dictionary = new MyHashMap();
        ArrayList<String>dataPreprossingForRawData = new ArrayList<>();

        ArrayList<FullInformationNode>dataProssingForNode = new ArrayList<>();
        String titleInformation = input.next();
     //   System.out.println(titleInformation);
        //reading file;
        for(int i = 1;i<=toalRow;i++)
        {
            String data = input.nextLine();
           // System.out.println(data);
            dataPreprossingForRawData.add(data);
        }
        for(int i = 0 ;i<dataPreprossingForRawData.size();i++)
        {
            String temp =dataPreprossingForRawData.get(i);
            FullInformationNode tempNode = new FullInformationNode(temp);
            dataProssingForNode.add(tempNode);
        }
        System.out.println("The size of"+dataProssingForNode.size());
        /*
         String nameRow1 = dataProssingForNode.get(8756).getBusName();
        System.out.println(nameRow1);
        Testing successufly for dealing with data
         */
        for(int i = 0 ;i<dataProssingForNode.size();i++)
        {
            FullInformationNode tempNode = dataProssingForNode.get(i);
            String tempShopName = tempNode.getBusName();
            String finalShopName= new String(tempShopName);
            String tempFullInformation = tempNode.getFullInformation();
            dictionary.put(finalShopName,tempFullInformation);
        }



       // System.out.println("tHE size of dic" +dictionary.size());
        /*
        Iterating the Hashmap to construct Teneray search tree
         */
        for(Map.Entry<String,String> entry : dictionary.entrySet()){
            String tempBusName = entry.getKey();
         //  System.out.println(tempBusName);
            myTeneraySearchTree.insert(tempBusName);

         //   System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue())
        }
      //  System.out.println(myTeneraySearchTree);
        String userInput = "144";
        HashSet<String>matchingSet = myTeneraySearchTree.prefixSearch(userInput);

        for(String s : matchingSet) {
            System.out.println(s);
        }
        System.out.println("The size of matching is"+matchingSet.size());



        ArrayList<String>informationPrint = new ArrayList<>();
        for (String s:matchingSet) {
            //System.out.println(s);
            if(dictionary.containsKey(s))
            {
                String fullInformation = dictionary.get(s);

                StructureNode tempStructureNode = new StructureNode(fullInformation);
                String printingInformation = tempStructureNode.getCurrentFullInformation();

                informationPrint.add(printingInformation);
            }
        }







    }
}
