/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerstudents;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author TrungNT
 */
public class StudentList {
    void inputStudent(Student[] oStudents, int n)
    {
         try{
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for(int i = 0; i < n; i++)
            {    
                oStudents[i] = new Student();
                System.out.print("\n+ Ma sinh vien: ");
                oStudents[i].ID = Integer.parseInt(oBufferedReader.readLine());
                
                System.out.print("\n+ Ho va ten: "); 
                oStudents[i].name = oBufferedReader.readLine();
                
                System.out.print("\n+ Tuoi: ");
                oStudents[i].age = Integer.parseInt(oBufferedReader.readLine());
                
                System.out.print("\n+ Gioi tinh: ");
                oStudents[i].gender = oBufferedReader.readLine();
                
                System.out.print("\n+ Que quan: ");
                oStudents[i].country = oBufferedReader.readLine();
            }
            
            
        }catch(Exception e){
            System.out.println(e.toString());
        }               
    }
}
