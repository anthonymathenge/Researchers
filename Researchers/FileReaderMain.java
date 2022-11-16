import java.util.ArrayList;

public class FileReaderMain {
    public static void main(String[] args) {
        FileReader researchers = new FileReader();
        BST tree1= new BST();
        tree1=researchers.readResearcherProfiles("researchers-1.txt");
        System.out.println(tree1.root.getResearcher());
        System.out.println(tree1.root.getL().getResearcher());
        System.out.println(tree1.root.getL().getR().getResearcher());




    }
}
