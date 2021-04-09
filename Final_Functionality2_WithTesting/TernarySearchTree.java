import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


//Define Node
class Node {
    //Store for string
    char storeChar;
    //whether finished reading character
    boolean isComplete;

    Node leftChild,centerChild,rightChild;

    //constructor
    public Node(char storeChar,boolean isComplete) {
        this.storeChar = storeChar;
        this.isComplete = isComplete;
    }
}


public class TernarySearchTree {
    //root node
    public Node root;

    //store result
    HashSet<String> result = new HashSet<String>();

    //recursively construct the tree
    public Node insert(String word,Node node,Integer index) {
        if(word == null || "".equals(word))
            return null;


        char[] charArray = word.toCharArray();

        //Recursive termination condition, when no characters are changed, a new node is created
        if(node == null) {
            node = new Node(charArray[index],false);
        }

        if(charArray[index] < node.storeChar) {
            node.leftChild = this.insert(word, node.leftChild,index);
        } else if(charArray[index] > node.storeChar) {
            node.rightChild = this.insert(word, node.rightChild,index);
        } else {

//If it is the last character of word, then set it as the end of the word, if it is the last character, you must enter this step

            if(index + 1 == charArray.length) {
                node.isComplete = true;
            } else {
                node.centerChild = this.insert(word, node.centerChild,++index);
            }
        }

        return node;
    }

    //Encapsulation
    public void insert(String word) {
        root = this.insert(word,root,0);
    }


    public String toString()
    {
        traverse(root, "");
        return "\nTernary Search Tree : "+ result;
    }
    /*
    　//Iterative
     */
    private void traverse(Node node, String str)
    {
        if (node != null)
        {
            traverse(node.leftChild, str);

            str = str + node.storeChar;
            if (node.isComplete)
                result.add(str);

            traverse(node.centerChild, str);
            str = str.substring(0, str.length() - 1);

            traverse(node.rightChild, str);
        }
    }

    public boolean search(String word)
    {
        return search(root, word.toCharArray(), 0);
    }

    private boolean search(Node node, char[] word, int index)
    {
        if (node == null)
            return false;

        if (word[index] < node.storeChar)
            return search(node.leftChild, word, index);
        else if (word[index] > node.storeChar)
            return search(node.rightChild, word, index);
        else
        {
            if (node.isComplete && index == word.length - 1)
                return true;
            else if (index == word.length - 1)
                return false;
            else
                return search(node.centerChild, word, index + 1);
        }
    }

    public Node findNode(String prefix) {
        return findNode(root,prefix.toCharArray(),0);
    }

    public Node findNode(Node node, char[] word, int index) {
        if (node == null)
            return null;

        if (word[index] < node.storeChar)
            return findNode(node.leftChild, word, index);
        else if (word[index] > node.storeChar)
            return findNode(node.rightChild, word, index);
        else
        {
            if (index == word.length - 1)
                return node.centerChild;
            else
                return findNode(node.centerChild, word, index + 1);
        }
    }

    //Find words with the same prefix
    public HashSet<String> prefixSearch(String prefix,Node node) {
        if(node != null) {
            if(node.isComplete) {
                result.add(prefix + node.storeChar);
            }

            prefixSearch(prefix,node.leftChild);
            prefixSearch(prefix + node.storeChar,node.centerChild);
            prefixSearch(prefix,node.rightChild);
        }

        if(search(prefix))
            result.add(prefix);

        return result;
    }

    public HashSet<String> prefixSearch(String prefix) {
        Node node = findNode(prefix);
        return prefixSearch(prefix,node);
    }

    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = "stops.txt";
        Input input = new Input(inputFile);
        int toalRow = 8757;
        TernarySearchTree t = new TernarySearchTree();

        ArrayList<String>dataPreprossingForRawData = new ArrayList<>();

        ArrayList<FullInformationNode>dataProssingForNode = new ArrayList<>();
        String titleInformation = input.next();

        for(int i = 1;i<=toalRow;i++)
        {
            String data = input.nextLine();
            String []arr = data.split(",");
            // System.out.println(data);
            dataPreprossingForRawData.add(arr[2]);
        }
        for(int i = 0 ;i<dataPreprossingForRawData.size();i++)
        {
            String temp = dataPreprossingForRawData.get(i);
            t.insert(temp);
        }
        String matchtext = "WB";
        HashSet<String> a = t.prefixSearch(matchtext);
        System.out.println("The size of matching is"+a.size());
        for(String s : a) {
            System.out.println(s);
        }
        System.out.println("The size of matching is"+a.size());
       // System.out.println(t);

/*
        HashMap<String,String>informationList = new HashMap<>();
        TernarySearchTree t = new TernarySearchTree();
        for(int )
        t.insert("152 ST FS 18 AVE,152 ST @ 18 AVE,49.035149,-122.801054");
        t.insert("152 ST FS 19 AVE,152 ST @ 19 AVE,49.036828,-122.801046");
        t.insert("152 ST FS 20 AVE,152 ST @ 20 AVE,49.038752,-122.801057,ZN");
        t.insert("152 ST AT 22 AVE,152 ST @ 22 AVE,49.041836,-122.801076");
        t.insert("152 ST FS 24 AVE,152 ST @ 24 AVE,49.046065,-122.801068");
        System.out.println(t);
        String matchtext = "152 ST ";

        System.out.println("result for saifity prefix ="+matchtext+":");
        HashSet<String> a = t.prefixSearch(matchtext);
        for(String s : a) {
            System.out.println(s);
        }

       // System.out.println(t);

 */
    }
}