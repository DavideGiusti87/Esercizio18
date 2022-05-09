/*
Variables Method Contructor - 02
Exercise: constructor-2

define a testing class where you:
create 2 students
create 1 teacher
assign a name to the teacher
assign grades to the 2 students
prints the students' details
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sara");
        Student student2 = new Student("Marco");
        Teacher teacher = new Teacher();
        teacher.teacherName="Carlo";
        teacher.assignGrade(student1,8);
        teacher.assignGrade(student2,7);
        student1.getStudentDetails();
        student2.getStudentDetails();

    }
}
