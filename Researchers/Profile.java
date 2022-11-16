/**
 *
 * A class that implements an individuals profile. It creates a profile by taking various
 * parameters which have their own getters and setter methods.
 * @author Anthony Mathenge
 */

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Profile {
    public String familyNames;
    public String givenNames;
    public int yearPhD;
    public int monthPhD;
    public int dayPhD;
    public String email;
    public ArrayList<String> researchInts;
    public ArrayList<Profile> collaborators = new ArrayList<>();

    /**
     *
     * creates an individuals profile
     * @param familyNames the researchers' family name.
     * @param givenNames the  researchers' given name .
     * @param yearPhD the year of received PhD.
     * @param monthPhD the month of received PhD.
     * @param dayPhD the day of received PhD.
     * @param email the  researchers' email.
     * @param researchInts the  researchers' interests.
     */
    public Profile(String familyNames,String givenNames ,int yearPhD,int monthPhD,int dayPhD,String email, ArrayList<String> researchInts){
        this.familyNames=familyNames;
        this.givenNames=givenNames;
        this.yearPhD=yearPhD;
        this.monthPhD=monthPhD;
        this.dayPhD=dayPhD;
        this.email=email;
        this.researchInts=researchInts;

    }

    /**
     * adds p to collaborators
     * @param P
     */
    public void collaborate(Profile P){
        collaborators.add(P);
    }

    /**
     * determines if p has collaborated with this
     * returns true or false
     * @param P
     * @return
     */
    public boolean hasCollaboratedWith(Profile P){
        if (this.collaborators.contains(P)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the size of this collaborators list
     */
    public int numOfCollabs(){
        return collaborators.size();
    }

    /**
     * @return the attributes of a single profile.
     */
    public String toString(){
        return familyNames+ " "+givenNames+" "+getDateOfPhD()+" "+email+ " "+researchInts+ " "+collaborators;
    }

    /**
     * @return the researchers' family name
     */
    public String getFamilyNames() {
        return familyNames;
    }

    /**
     *
     * @param familyNames Resets the family name
     */
    public void setFamilyNames(String familyNames) {
        this.familyNames = familyNames;
    }
    /**
     * @return the researchers' given name
     */
    public String getGivenNames() {
        return givenNames;
    }
    /**
     *
     * @param givenNames Resets the given name
     */
    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }
    /**
     * @return the day of received PhD.
     */
    public int getDayPhD() {
        return dayPhD;
    }
    /**
     * @return the month of received PhD.
     */
    public int getMonthPhD() {
        return monthPhD;
    }
    /**
     * @return the year of received PhD.
     */
    public int getYearPhD() {
        return yearPhD;
    }
    /**
     *
     * @param dayPhD Resets the day of received PhD.
     */
    public void setDayPhD(int dayPhD) {
        this.dayPhD = dayPhD;
    }
    /**
     *
     * @param monthPhD Resets month of received PhD.
     */
    public void setMonthPhD(int monthPhD) {
        this.monthPhD = monthPhD;
    }
    /**
     *
     * @param yearPhD Resets the year of received PhD.
     */
    public void setYearPhD(int yearPhD) {
        this.yearPhD = yearPhD;
    }
    /**
     * @return the researchers' email
     */
    public String getEmail() {
        return email;
    }
    /**
     *
     * @param email Resets the researchers' email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the researchers' interest
     */
    public ArrayList<String> getResearchInts() {
        return researchInts;
    }
    /**
     *
     * @param researchInts Resets the researchers' interest
     */
    public void setResearchInts(ArrayList<String> researchInts) {
        this.researchInts = researchInts;
    }

    /**
     * returns the converts and returns the date in YYYY-MM-DD format
     * @return
     */
    public String getDateOfPhD(){
        return yearPhD+"-"+new DecimalFormat("00").format(monthPhD)+"-"+new DecimalFormat("00").format(dayPhD);

    }

    }
