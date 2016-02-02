/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerstudents;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
    
    /*public void inputStudent(){
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
            
            //System.out.printLn("========================");
            
        }
        catch(Exception e){
            System.out.println("Error!");
        };
    }*/
    
    public void inputStudent(){
        BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ID = 0;
        name = "";
        country = "";                
        
        try{
            System.out.println("Nhap thong tin sinh vien");
            System.out.print("\n+ Ma sinh vien: ");
            ID = Integer.parseInt(oBufferedReader.readLine());
            
            System.out.print("\n + Ho va ten: ");
            name = oBufferedReader.readLine();
            
            System.out.print("\n + Gioi tinh: ");
            gender = oBufferedReader.readLine();
            
            System.out.print("\n+ Tuoi: ");
            age = Integer.parseInt(oBufferedReader.readLine());
            
            System.out.print("\n+ Que quan: ");
            country = oBufferedReader.readLine();
            
            System.out.print("\n========================\n");
        }
        catch(Exception e){
            System.out.println("Error!");
        }
    }
}
