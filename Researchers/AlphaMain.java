import java.util.ArrayList;

public class AlphaMain {
    public static void main(String[] args) {
        ArrayList<String> reserch = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();

        Profile jame = new Profile("dim", "bye", 2013, 12, 10, "myemail", reserch);
        Profile kyri = new Profile("ailly", "bye", 2013, 12, 10, "myemail", reserch);
        Profile logan = new Profile("zony", "bye", 2013, 12, 10, "myemail", reserch);
        BST tree1 = new BST();
        BSTNode head = new BSTNode(jame);
        tree1.root=head;
        tree1.insertResearcher(kyri);
        tree1.insertResearcher(logan);
        System.out.println(tree1.printAlphabetical());

    }
}
