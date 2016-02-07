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
           
            StudentList oStudentList = new StudentList();
            oStudentList.inputStudent(oStudents, n);                        
            
            System.out.println("=============================");
            oStudentList.DisplayStudent(oStudents, n);
            
            System.out.println("=============================");
            oStudentList.sumScoreStudent(oStudents, n);
            
            System.out.println("=============================");
            oStudentList.averageScoreStudent(oStudents, n);
            
            System.out.println("=============================");
            oStudentList.BubbleSortStudent(oStudents, n);
            oStudentList.sumScoreStudent(oStudents, n);
            
            System.out.println("=============================");
            System.out.print("\nSinh vien co tong diem cao nhat la: " + oStudentList.max_sumScoreStudent(oStudents, n));
            System.out.println();
            
            System.out.println("=============================");
            System.out.print("\nSinh vien co tong diem nho nhat la: " + oStudentList.min_sumScoreStudent(oStudents, n));
            System.out.println();
        }                
        catch(Exception e){
            System.out.println(e.toString());
        }
                   
    }
    
    
}


