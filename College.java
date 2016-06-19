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

    int size;
    Scanner input = new Scanner(System.in);


    public Student[] add(Student student){
        System.out.println("How many students you want to enroll?");
        size = input.nextInt();
        input.nextLine();
        Student [] students = new Student[size];


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
        return students;
    }

    public Teacher[] add(Teacher teacher){
        System.out.println("How many Teachers you want to enroll?");
        size = input.nextInt();
        input.nextLine();
        Teacher[] teachers = new Teacher[size];

        for(int i = 0; i< teachers.length; i++){
            teacher = new Teacher();
            System.out.println("Enter Teacher's Name:   ");
            teacher.setName(input.nextLine());
            System.out.println("Enter Teacher's Age:   ");
            teacher.setAge(input.nextInt());
            input.nextLine();
            System.out.println("Enter Teacher's Subject:   ");
            teacher.setSubject(input.nextLine());


            teachers[i] = teacher;
        }
        return teachers;
    }

    public void view(Teacher[] teachers ){
        System.out.println("Name\t\t\t\t"+"Age\t\t\t\t"+"Roll no,");
        for(int i = 0; i<teachers.length ; i++){
            System.out.println(teachers[i].getName()+"\t\t\t\t"+teachers[i].getAge()+"\t\t\t\t"+teachers[i].getSubject());
        }
    }

    public void view(Student[] students){
        System.out.println("Name\t\t\t\t"+"Age\t\t\t\t"+"Subject");
        for(int i = 0; i<students.length ; i++){
            System.out.println(students[i].getName()+"\t\t\t\t"+students[i].getAge()+"\t\t\t\t"+students[i].getRollno());
        }
    }

    public void search(Person[] persons){
        System.out.println("Enter the name to be Search" );
        String name = input.nextLine();

        Boolean isFound = false;
        int i;
        for( i = 0; i<persons.length; i++){
            if(persons[i].getName().equalsIgnoreCase(name)){
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println(persons[i].getName()+" found in the list" );
        }
        else{
            i--;
            System.out.println(persons[i].getName()+ " is not existed");
        }
    }




}



















