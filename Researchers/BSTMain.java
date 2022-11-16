import java.util.ArrayList;

public class BSTMain {
    public static void main(String[] args){
        ArrayList<String> reserch= new ArrayList<String>();
        Profile jame = new Profile("tim","bye",2013,12,10,"myemail",reserch);
        Profile kyri = new Profile("tilly","bye",2013,12,10,"myemail",reserch);
        Profile logan = new Profile("tony","bye",2013,12,10,"myemail",reserch);
        Profile nick = new Profile("tom","bye",2013,12,10,"myemail",reserch);

        BST tree1 = new BST();
        BSTNode head = new BSTNode(jame);

        tree1.root=head;
        tree1.insertResearcher(kyri);
        tree1.insertResearcher(nick);
        tree1.insertResearcher(logan);

        System.out.println(tree1.root.getResearcher());
        System.out.println(tree1.root.getR().getResearcher());
        System.out.println(tree1.root.getL().getResearcher());
        System.out.println(tree1.root.getR().getR());
        System.out.println(tree1.root.getR().getL());
        System.out.println(tree1.root.getL().getR());
        System.out.println(tree1.root.getL().getL());






    }
}
