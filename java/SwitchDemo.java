import java.util.Scanner;

class SwitchDemo
{
    public static void main(String A[])
    {
       Scanner sobj=new Scanner(System.in);
       int istd=0;
       
       System.out.println("Enter your standard:");       
       istd=sobj.nextInt();

       switch(istd)
       {
        case 1:
            System.out.println("Exam at 9 AM");
            break;


        case 2:
            System.out.println("Exam at 10 AM");
            break;

        case 3:
            System.out.println("Exam at 11 AM");
            break;

        case 4:
            System.out.println("Exam at 12 NOON");
            break;

        default:
            System.out.println("Invalid standard");
       }
    
       
    
    }
}