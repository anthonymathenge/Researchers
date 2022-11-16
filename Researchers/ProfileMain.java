import java.util.ArrayList; // import the ArrayList class

public class ProfileMain {
    public static void main(String[] args) {

        ArrayList<String> reserch= new ArrayList<String>();
        Profile jame = new Profile("tim","bye",2013,12,07,"myemail",reserch);
        jame.setFamilyNames("kyle");
        System.out.println(jame);
        System.out.println("PhD Date: " + jame.getDateOfPhD());

    }
}
