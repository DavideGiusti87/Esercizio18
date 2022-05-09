/*
Variables Method Contructor - 02
Exercise: constructor-2

define a class called Teacher that has:
a string instance variable called teacherName
a constructor method that simply inform the user about the creation of a Teacher object
a method assignGrade() that
takes 2 params:
alum of type Student
a int finalGrade
assigns finalGrade to the Student's grade
 */
public class Teacher {
    String teacherName;

    public Teacher(){
        System.out.println("A new Teacher has been created");
    }

    public void assignGrade(Student alum, int finalGrade){
        alum.grade=finalGrade;

    }
}
