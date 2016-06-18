import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Ibne.e.Rasheed
 * Date: 6/17/16
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class College {
    Student  student=new Student();
    Teacher teacher;
    Student[]  students = new Student[1];
    Scanner input = new Scanner(System.in);


    public Student[] addStudent(){

        for(int i = 0; i< students.length; i++){



            System.out.println("Enter Student's Name:   ");

            student.setName(input.nextLine());
            System.out.println("Enter Student's Age:   ");
            student.setAge(input.nextInt());
            System.out.println("Enter Student's Roll Number:   ");
            student.setRollno(input.nextInt());
            input.nextLine();
            //System.out.println(student.getName()+student.getAge()+ student.getRollno());

            students[i] = student;
            //System.out.println(students[i].getName()+"\t\t\t\t\t"+students[i].getAge()+"\t\t\t\t\t"+students[i].getRollno());
        }
          return  students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void viewStudent(){

            System.out.println(students[0].getName());
    }
}
