/**
 * this class reads a file and sets the necessary
 * collaborations between researchers
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors


public class Graph {
    BST tree = new BST();

    /**
     *
     * @param filename the file containing collaborations
     * @param tree the tree with the collaboration profiles
     */
    public Graph(String filename,BST tree) {
        BSTNode newbstnode1;
        BSTNode newbstnode2;
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.toLowerCase().split(",");

                newbstnode1 = find(tree.root,values[0]);
                newbstnode2 = find(tree.root,values[1]);

                if (newbstnode1==null||newbstnode2==null){
                    System.out.println("thiserror");

                }else {
                    if(!newbstnode1.getResearcher().hasCollaboratedWith(newbstnode2.getResearcher())){
                        newbstnode1.getResearcher().collaborate(newbstnode2.getResearcher());
                    }
                    if (!newbstnode2.getResearcher().hasCollaboratedWith(newbstnode1.getResearcher())){
                        newbstnode2.getResearcher().collaborate(newbstnode1.getResearcher());
                    }
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param filename
     * @return
     */
    public String getInfluencer (String filename) {
        String word1 = "";
        String word2="";
        int maxCount = 0;
        ArrayList<String> words = new ArrayList<>();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] string = data.toLowerCase().split(",");
                for (String s : string) {
                    words.add(s);
                }
            }

            for (int i = 0; i < words.size(); i++) {
                int count = 1;
                for (int j = i + 1; j < words.size(); j++) {
                    if (words.get(i).equals(words.get(j))) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    word1 = words.get(i);
                    word2= words.get(i+1);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        if (Objects.equals(word1, word2)){
            return word1;
        }else{
            return null;
        }
    }
    String filename;
    Graph g;
    public Profile findInfluencer (String familyNames){
        String influencer = getInfluencer(g.filename);
        BSTNode newbstnode1;
        BSTNode newbstnode2;
        newbstnode1=find(g.tree.root,"familynames");
        newbstnode2=find(g.tree.root,influencer);
        boolean x=newbstnode1.getResearcher().hasCollaboratedWith(newbstnode2.getResearcher());
        boolean y=newbstnode2.getResearcher().hasCollaboratedWith(newbstnode1.getResearcher());
        if (influencer==null ||( !x && !y)){
               return find(tree.root,"familynames").getResearcher();
        }else{
            return newbstnode2.getResearcher();

        }

    }

    public static boolean flag = false;

    public BSTNode find(BSTNode q, String cont){
        if(q==null) return null;
        if(q.getResearcher().familyNames.equals(cont)) {
            flag=true;
            return q;
        }
        BSTNode result = null;
        if(!flag &&q.getL()!=null){
            result = find(q.getL(),cont);
        }
        if(!flag && q.getR()!=null) {
            result = find(q.getR(), cont);
        }
        return q;
    }
    }

