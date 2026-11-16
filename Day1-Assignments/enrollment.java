import java.util.*;
public class enrollment{
    public static void main(String args[]){
        ArrayDeque<String> e = new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("1-Enroll");
            System.out.println("2-Undo");
            System.out.println("3-Show");
            System.out.println("4-Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
              case 1:
                System.out.print("Enter student name:");
                String name = sc.nextLine();
                e.push(name);
                System.out.println(name + " enrolled successfully.");
                break;
              case 2:
                 if (e.isEmpty())
                        System.out.println("Nothing to undo here");
                    else
                        System.out.println("Undone: " + e.pop());
                    break;
                case 3:
                    if (e.isEmpty())
                        System.out.println("No enrollment");
                    else
                        System.out.println("Last: " + e.peek());
                    break;
                 case 4:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 4);
        sc.close();
    }
}