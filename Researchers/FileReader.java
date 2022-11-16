/**
 * This class reads a file creates nodes form the values in the file
 * creates a tree and populates it with the nodes just created
 * @author Anthony Mathenge
 */

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner;
public class FileReader{

    public static BST readResearcherProfiles(String filename){
        BST newTree = new BST();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.split(",");
                String dates = (values[2]);
                String [] dateArr = dates.split("-");
                int day = Integer.parseInt(dateArr[2]);
                int month = Integer.parseInt(dateArr[1]);
                int year = Integer.parseInt(dateArr[0]);
                ArrayList<String> research= new ArrayList<>();
                String interests = (values[4]);
                String [] interestArr = interests.split("/");
                String intr1 = interestArr[0];
                String intr2 = interestArr[1];
                String intr3 = interestArr[2];
                research.add(intr1);
                research.add(intr2);
                research.add(intr3);
                Profile newProfile = createProfile(values[1],values[0],day,month,year,values[3],research);
                newTree.insertResearcher(newProfile);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return newTree;
    }

    /**
     *this method takes attributes and creates a profile.
     * @return the created profile.
     */
    public static Profile createProfile(String givenNames, String familyNames, int yearPhD, int monthPhD, int dayPhD, String email, ArrayList<String> researchInts){
        Profile newProfile = new Profile(givenNames,familyNames, yearPhD, monthPhD, dayPhD,email,researchInts);
        return newProfile;
    }


}
