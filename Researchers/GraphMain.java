import java.io.IOException;
import java.util.ArrayList;

public class GraphMain {
    public static void main(String[] args) throws IOException {
        ArrayList<String> reserch= new ArrayList<String>();

        Profile jame = new Profile("dim", "bye", 2013, 12, 10, "myemail", reserch);
        Profile kyri = new Profile("ailly", "bye", 2013, 12, 10, "myemail", reserch);
        Profile logan = new Profile("tony", "bye", 2013, 12, 10, "myemail", reserch);
        Profile pie = new Profile("tim","bye",2013,12,10,"myemail",reserch);
        BST tree1 = new BST();
        BSTNode head = new BSTNode(jame);
        tree1.root=head;
        tree1.insertResearcher(kyri);
        tree1.insertResearcher(logan);
        tree1.insertResearcher(pie);
        logan.collaborate(kyri);
        Graph g1 = new Graph("Edge-1.txt",tree1);
        g1.findInfluencer("ailly");
        System.out.println(g1.getInfluencer("Edge-1.txt"));




    }
}
