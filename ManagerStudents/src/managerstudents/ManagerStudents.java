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
public class ManagerStudents {         
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Student[] oStudents = new Student[100];
        int n; 
                        
        try{
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap thong tin sinh vien");
            System.out.print("\n+ n = ");
            n = Integer.parseInt(oBufferedReader.readLine());                        
            
            inputStudent(oStudents, n);
        }
                
        catch(Exception e){
            System.out.println(e.toString());
        }
                   
    }
    
    static void inputStudent(Student[] oStudents, int n)
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
            }
            
            
        }catch(Exception e){
            System.out.println(e.toString());
        }                
    }
}


