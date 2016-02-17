# ManageStudent
## Môi trường phát triển
+ Bộ công cụ Netbeans version 8.1

##Ôn tập
+ Tạo mảng sinh viên 
+ [Sử dụng kiến thức lập trình OOP](http://javae.net/object-va-class-trong-java-phan-2/)
+ Nhập và Hiển thị Danh sách Sinh viên từ bàn phím [(sử dụng 1 trong 3 cách: Scanner, BufferReader, JoptionPlane)](https://www.sites.google.com/site/ttkuzze/hoctap/java/nhap-xuat-trong-java)
+ Tạo phương thúc tính tổng điểm của từng sinh viên
+ Tìm điểm trung bình cộng trong danh sách sinh viên
+ Tạo phương thức sắp xếp tổng điểm danh sách sinh viên (theo thứ tự tăng dần và thứ tự giảm dần) 
+ Tìm tổng điểm cao nhất trong danh sách sinh viên
+ Tìm tổng điểm thấp nhất trong danh sách sinh viên

##Tính tổng điểm của từng Sinh viên
```
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
```

##Tính Trung bình cộng tổng điểm của từng sinh viên
```
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
```

