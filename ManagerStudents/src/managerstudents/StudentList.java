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
    
    //phuong thuc Nhap du lieu: danh sach n sinh vien 
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
                
                System.out.print("\n+ Toan: ");
                oStudents[i].score_math = Float.parseFloat(oBufferedReader.readLine());
                
                System.out.print("\n+ Van: ");
                oStudents[i].score_literature = Float.parseFloat(oBufferedReader.readLine());
                
                System.out.print("\n+ Anh: ");
                oStudents[i].score_english = Float.parseFloat(oBufferedReader.readLine());
            }
            
            
        }catch(Exception e){
            System.out.println(e.toString());
        }               
    }
    
    public void DisplayStudent(Student[] oStudents, int n)
    {
        for(int i=0; i<n; i++)
        {           
            System.out.println(oStudents[i].getID());
            System.out.println(oStudents[i].getName());
            System.out.println(oStudents[i].getAge());
            System.out.println(oStudents[i].getGender());
            System.out.println(oStudents[i].getCountry());
            System.out.println("Toan: " + oStudents[i].getScore_math());
            System.out.println("Van: " + oStudents[i].getScore_literature());
            System.out.println("Anh: " + oStudents[i].score_english);
            System.out.println("===");
        }
    }
    
    //dinh nghia ham tinh tong diem
    float sumScore(float math, float literature, float english)
    {
        float sumScore;
        
        sumScore = math + literature + english;
        return sumScore;        
    }
    
    //dinh nghia phuong thuc tinh tong diem tung sinh vien
    public void sumScoreStudent(Student[] oStudents, int n)
    {
        float sumScore=0;
        
        for(int i=0; i<n ; i++)
        {
            sumScore = sumScore(oStudents[i].getScore_math(),
                                oStudents[i].getScore_literature(),
                                oStudents[i].getScore_english());
            System.out.println("+ Tong diem cua sinh vien co ma sinh vien " + oStudents[i].getID() + " la: " + sumScore);
        }
        
    }
    
    //dinh nghia ham tinh tong diem trung binh
    float averageScore(float math, float literature, float english)
    {
        float averageScore;
        
        averageScore = (math + literature + english)/3;
        return averageScore;        
    }
    
    //dinh nghia phuong tinh tinh tong diem trung binh cua tung sinh vien
    public void averageScoreStudent(Student[] oStudents, int n)
    {
        float averageScoreStudent;
        
        for(int i=0; i<n; i++)
        {
            averageScoreStudent = averageScore(oStudents[i].getScore_math(), 
                                               oStudents[i].getScore_literature(), 
                                               oStudents[i].getScore_english());
            System.out.println("+ Tong diem trung binh cong cua sinh vien co ma " + oStudents[i].getID() + " la: " + averageScoreStudent);
        }
    }
    
    //dinh nghia Swap method de doi cho
    /*void Swap(Student oStudentA, Student oStudentB)
    {
        Student templ;
        
        templ = oStudentA;
        oStudentA = oStudentB;
        oStudentB = templ;
    }*/
    
    public void BubbleSortStudent(Student[] oStudents, int n)
    {                       
        for(int j=0; j<n; j++)
        {            
            for(int i=n-1; i>j; i--)
            
                if(sumScore(oStudents[i].getScore_math(),
                            oStudents[i].getScore_literature(),
                            oStudents[i].getScore_english()) < sumScore(oStudents[i-1].getScore_math(),
                                                                oStudents[i-1].getScore_literature(),
                                                                oStudents[i-1].getScore_english()))
                    //Swap(oStudents[i], oStudents[i-1]);
                {    
                    Student temp = oStudents[i];
                    oStudents[i] = oStudents[i-1];
                    oStudents[i-1] = temp;
                };
        }
    }
    
    public float max_sumScoreStudent(Student[] oStudents, int n)
    {
        float maxScore = sumScore(oStudents[0].getScore_math(), 
                                  oStudents[0].getScore_literature(), 
                                  oStudents[0].getScore_english());
        
        for(int i=0; i<n; i++ )            
            if(maxScore<sumScore(oStudents[i].getScore_math(),
                                oStudents[i].getScore_literature(),
                                oStudents[i].getScore_english()))
                maxScore = sumScore(oStudents[i].getScore_math(), 
                                      oStudents[i].getScore_literature(), 
                                      oStudents[i].getScore_english());
        
        return maxScore;            
    }
    
    public float min_sumScoreStudent(Student[] oStudents, int n)
    {
        float minScore = sumScore(oStudents[0].getScore_math(), 
                                  oStudents[0].getScore_literature(), 
                                  oStudents[0].getScore_english());
        
        for(int i=0; i<n; i++ )            
            if(minScore>sumScore(oStudents[i].getScore_math(),
                                oStudents[i].getScore_literature(),
                                oStudents[i].getScore_english()))
                minScore = sumScore(oStudents[i].getScore_math(), 
                                      oStudents[i].getScore_literature(), 
                                      oStudents[i].getScore_english());
        
        return minScore;            
    }
}
