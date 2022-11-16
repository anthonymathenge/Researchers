import java.util.ArrayList; // import the ArrayList class

public class BSTNodeMain {
    public static void main(String[] args){
        ArrayList<String> reserch= new ArrayList<String>();
        Profile jame = new Profile("tim","bye",2013,12,10,"myemail",reserch);
        Profile kyri = new Profile("tim","bye",2013,12,10,"myemail",reserch);
        Profile logan = new Profile("tim","bye",2013,12,10,"myemail",reserch);
        BSTNode head = new BSTNode(jame);
        BSTNode left= new BSTNode(kyri);
        BSTNode right = new BSTNode(logan);
        head.setL(left);
        left.setR(right);
        System.out.println(head.getResearcher());


    }
}
