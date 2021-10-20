package functions;

import utility.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
/*
author: Mingwei Shi
Class which implements function 1, auto completed search 
 */

/*
Usage of functions.Function2UserInterface


 */
public class Function2 {
    private String userInputText;
    private TernarySearchTree myTeneraySearchTree = new TernarySearchTree();
    HashSet<String>matchingSet;
    private MyHashMap dictionary = new MyHashMap();
    public Function2(String userInputText) throws FileNotFoundException {


       this.userInputText = userInputText;
       construnctionTenerySearchTree();
        getAllMatchingPrefix();

   }
   //get full information
   public ArrayList<String>getFullInformation()
   {
       ArrayList<String>informationPrint = new ArrayList<>();
       for (String s:this.matchingSet) {
           //System.out.println(s);
           if(this.dictionary.containsKey(s))
           {
               String fullInformation = this.dictionary.get(s);

               StructureNode tempStructureNode = new StructureNode(fullInformation);
               String printingInformation = tempStructureNode.getCurrentFullInformation();

               informationPrint.add(printingInformation);
           }
       }
       return informationPrint;
   }
   private ArrayList<String> getAllMatchingPrefix()
   {
       matchingSet = this.myTeneraySearchTree.prefixSearch(this.userInputText);
       ArrayList<String>fullBusList = new ArrayList<>();

       for(String s:matchingSet)
       {
           fullBusList.add(s);
       }
       return fullBusList;
   }
   private void construnctionTenerySearchTree() throws FileNotFoundException {
       File newFile = new File("FinalProgram/out/production/FinalProgram/stops.txt");
       String inputFile = newFile.getPath();
       System.out.println(inputFile);

    //   utility.TernarySearchTree myTeneraySearchTree = new utility.TernarySearchTree();
       Input input = new Input(inputFile);
       int toalRow = 8757;

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
       //System.out.println("The size of"+dataProssingForNode.size());
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
           this.dictionary.put(finalShopName,tempFullInformation);
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
   }



}
