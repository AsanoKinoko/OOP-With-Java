package model;

import utils.Validator;

import java.util.List;

public class Student implements Comparable<Student> {

    private String id;
    private String studentName;
    private String semester;
    private String courseName;

    public Student() {
    }
    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Override
    public int compareTo(Student t) {
        return this.studentName.compareTo(t.studentName);
    }
    
    public void hahah(List<Student> student){
        boolean checkIdExisted = false;
        
        id = Validator.getString("Enter id:", "Invalid", "[A-Za-z0-9]+");
        
       for(int i = 0 ; i < student.size(); i++){
           if(student.get(i).getId().equalsIgnoreCase(id)){
               studentName = student.get(i).getStudentName();
               System.out.println("Name Student: " + studentName);
               checkIdExisted = true;
               break;   
           }
       }
    }
    
    public void input(List<Student> students) {
        boolean checkIDExisted = false;
        
        id = Validator.getString("Enter id:", "Invalid!",
                "[A-Za-z0-9]+");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equalsIgnoreCase(id)) {
                studentName = students.get(i).getStudentName();
                System.out.println("Name Student: " + studentName);
                checkIDExisted = true;
                break;
            }
        }
        if (!checkIDExisted) {
            studentName = Validator.getString("Enter Name:", "Invalid!",
                    "[A-Za-z\\s]+");
        }
        int chooseSemester = Validator.getInt("Only three semester:\n"
                        + "\t1-Spring\n"
                        + "\t2-Summer\n"
                        + "\t3-Fall\n"
                        + "Enter your choice:",
                "Please enter number 1->3", "Invalid!", 1, 3);
        switch (chooseSemester) {
            case 1:
                semester = "Spring";
                break;
            case 2:
                semester = "Summer";
                break;
            case 3:
                semester = "Fall";
                break;
        }
        int year = Validator.getInt("Enter year Semerter: ",
                "Please enter year >= 2000", "Invalid!", 2000, 2050);
        semester = semester + year;
        int choose = Validator.getInt("Only three courses:\n"
                        + "\t1-Java\n"
                        + "\t2-.Net\n"
                        + "\t3-C/C++\n"
                        + "Enter your choice:",
                "Please enter number 1->3", "Invalid", 1, 3);
        switch (choose) {
            case 1:
                courseName = "Java";
                break;
            case 2:
                courseName = ".NET";
                break;
            case 3:
                courseName = "C/C++";
                break;
        }
    }
}
