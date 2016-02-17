/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import java.util.Scanner;
package managerstudents;
/**
 *
 * @author TrungNT
 */
public class Student {
    int ID;
    String name;
    String country;
    int age;
    String gender;
    float score_math;
    float score_literature;
    float score_english;
    
    //dinh nghia ham khoi tao Contructor
    public void Student(){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.country = country;
        this.age = age;
        this.score_math = score_math;
        this.score_literature = score_literature;
        this.score_english = score_english;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }          

    public float getScore_math() {
        return score_math;
    }

    public float getScore_literature() {
        return score_literature;
    }

    public float getScore_english() {
        return score_english;
    }               
}
