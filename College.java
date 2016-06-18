import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Ibne.e.Rasheed
 * Date: 6/17/16
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class College {
    Student  student;
    int size;
    Teacher teacher;
    Student[]  students;;
    Scanner input = new Scanner(System.in);


    public void addStudent(){
        System.out.println("How many students you want to enroll?");
        size = input.nextInt();
        input.nextLine();
        students = new Student[size];

        for(int i = 0; i< students.length; i++){
            student = new Student();
            System.out.println("Enter Student's Name:   ");
            student.setName(input.nextLine());
            System.out.println("Enter Student's Age:   ");
            student.setAge(input.nextInt());
            System.out.println("Enter Student's Roll Number:   ");
            student.setRollno(input.nextInt());
            input.nextLine();

            students[i] = student;
            }
    }

    public void viewStudent(){
        System.out.println("Name\t\t\t\t"+"Age\t\t\t\t"+"Roll no,");
            for(int i = 0; i<students.length ; i++){
                System.out.println(students[i].getName()+"\t\t\t\t"+students[i].getAge()+"\t\t\t\t"+students[i].getRollno());
            }
    }
    public void searchStudent(){
        System.out.println("Enter the name of the Student.");
        String name = input.nextLine();

        Boolean isFound = false;
        for(int i = 0; i<students.length; i++){
            if(students[i].getName().equalsIgnoreCase(name)){
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println(name+" found in the list" );
        }
        else{
            System.out.println(name + " is not existed");
        }
    }


}



















