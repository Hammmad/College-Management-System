import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Ibne.e.Rasheed
 * Date: 6/17/16
 * Time: 6:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public  static  void main(String[] args){
        College clg=new College();
       Teacher[] teachers = new Teacher[clg.size];
        Student[] students = new Student[clg.size];

        mainmenu(clg,teachers,students);
    }

    private static void mainmenu(College clg, Teacher[] tt, Student[] ss) {
        System.out.println("\t\t\t\t\t MAIN MENU\n1.  Add\n2. View List\n3.   Search");
        Teacher teacher = new Teacher();
        Student student = new Student();


        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println("1,  Add Student\n2. Add Teacher");

                  choice = input.nextInt();

                    switch(choice){
                    case 1:
                        ss = clg.add(student);
                        mainmenu(clg,tt,ss);
                        break;
                    case 2:
                        tt = clg.add(teacher);
                        mainmenu(clg,tt,ss);
                        break;
                    default:
                        System.out.println("Selected  invalid option.");
                        break;
                }
                break;
            case 2:
                System.out.println("1,  View Student\n2. View Teacher");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        clg.view(ss);
                        mainmenu(clg,tt,ss);
                        break;
                    case 2:
                        clg.view(tt);
                        mainmenu(clg,tt,ss);
                        break;
                    default:
                        System.out.println("Selected  invalid option.");
                        break;
                }
                break;
            case 3:
                System.out.println("1,  Search Student\n2. Search Teacher");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        clg.search(ss);
                        mainmenu(clg,tt,ss);
                        break;
                    case 2:
                        clg.search(tt);
                        mainmenu(clg,tt,ss);
                        break;
                    default:
                        System.out.println("Selected  invalid option.");
                        break;
                }
                break;
            default:
                System.out.println("Selected  invalid option.");
                break;
        }
    }
}
