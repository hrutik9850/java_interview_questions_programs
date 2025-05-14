package colleacation_Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassRoom {

    public static void main(String[] args){
        Student student1 = new Student("Alice", 20, "S001");
        Student student2 = new Student("Hrutik ", 22, "S002");
        Student student3 = new Student("Bushan", 23, "S003");
        Student student4 = new Student("Aniket", 20, "S004");
        Student student6 = new Student("pratik", 32, "S006");
        

        List<Student> students= new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(new Student("John", 21, "S005"));
        students.forEach(student -> {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Student ID: " + student.getStudentId());
        });
        System.out.println("===================================");
        System.out.println("Total number of students: " + students.size());
        System.out.println("===================================");
        System.out.println("students.contains(Student2):" +students.contains(student2));
        
        System.out.println("====================================");
        System.out.println("student.remove(student6)"+students.remove(student6));
        System.out.println("====================================");
        System.out.println("student. remove(student2):" +students.remove(student2));    
        System.out.println("====================================");
        Iterator<Student> s1 = students.iterator();
        while(s1.hasNext()){
            Student student= s1.next();
            System.out.println("Name:"+student.getName()+
            ", Age:"+student.getAge()+", Student Id :"+ student.getStudentId());

        }
        System.out.println("====================================");
        Student[] studentArry = students.toArray(new Student[students.size()]);
        for (Student student : studentArry){
           System.out.println(student.getName());
        }
       
    
    }

}
    
        
