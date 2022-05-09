/*
Variables Method Contructor - 02
Exercise: constructor-2

define a class called Student that has:
a string instance variable name
a int instance variable grade
a constructor method that
informs the user about the object creation
takes a studentName parameter and assign it to the object's instance variable name
a method getStudentDetails() that prints a student name and grade
 */
public class Student {
    String name;
    int grade;

    public Student(String studentName){
        System.out.println("A new Student has been created");
        this.name=studentName;
    }

    public void getStudentDetails(){
        System.out.printf("Student's name: %s, Student's grade: %d%n",name,grade);
    }
}
