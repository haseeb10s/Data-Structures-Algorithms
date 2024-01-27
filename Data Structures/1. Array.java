// Insert, Get, Delete, Update in Array
import java.util.*;
class Student{
    private String name;
    private int id;
    private String section;
    public Student(String name, int id, String section){
        this.name=name;
        this.id=id;
        this.section=section;
    }
    //Getter&Setter
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getSection(){
        return section;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSection(String section){
        this.section=section;
    }
}
public class Main {
    public static void main(String [] args){
        Student[] students = new Student[6];
        students[0] = new Student("John", 11, "A");
        students[1] = new Student("Julie", 22, "A");
        students[2] = new Student("David", 33, "B");
        students[3] = new Student("Mills", 44, "B");
        students[4] = new Student("Smith", 55, "C");
        displayStudent(students);
        insertStudent(students, new Student("Adam", 77 , "D"));
        updateStudent(students, 1, new Student("Stone", 22, "A"));
        deleteStudent(students, 2);
        displayStudent(students);
    }
    public static void displayStudent(Student [] students){
        System.out.println("details: ");
        for (Student student: students){
            if (student != null){
                System.out.println("Name : " + student.getName() + " id: " + student.getName() + " Section: " + student.getSection());
            }
        }
        System.out.println(" ");
    }
    public static void insertStudent(Student [] students, Student newStudent){
        for (int i = 0; i < students.length; i ++){
            if (students[i] == null){
                students[i] = newStudent;
                break;
            }
        }

    }
    public static void updateStudent(Student [] students, int index, Student updateStudent){
        if (index > 0 && index < students.length){
            students[index] = updateStudent;
        }
    }
    private static void deleteStudent(Student [] students, int index){
        if (index > 0 && index < students.length){
            students[index] = null;
        }

    }
}

