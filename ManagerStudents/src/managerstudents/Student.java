/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerstudents;

import java.util.Scanner;

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
    
    public void inputStudent(){
        //khoi tao doi tuong Scanner
            Scanner oScanner = new Scanner(System.in);
            ID = 0;
            name = "";
            country = "";
            
        try{
            System.out.println("Nhap thong tinh Sinh vien");                       
            
            System.out.print("\n+ Ma sinh vien: ");
            ID = oScanner.nextInt();
            
            System.out.print("\n+ Ho va ten: ");            
            name = oScanner.nextLine();
            
            System.out.print("\n+ Gioi tinh: ");
            gender = oScanner.nextLine();
            
            System.out.print("\n+ Tuoi: ");
            age = oScanner.nextInt();
                                               
            System.out.print("\n+ Que quan: ");
            country = oScanner.nextLine();
            
        }
        catch(Exception e){
            System.out.println("Error!");
        };
    }
}
