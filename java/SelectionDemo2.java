import java.util.Scanner;
class SelectionDemo2
{
    public static void main(String A[])
    {
       Scanner sobj=new Scanner(System.in);
       int istd=0;
       
       System.out.println("Enter your standard:");       //ask what is threshold value of age
       istd=sobj.nextInt();
    
       if(istd==1)                              //if else if ladder
       {
        System.out.println("Exam at 9 AM");
       }
       else if(istd==2)
       {
        System.out.println("Exam at 10 AM");
       }
       else if(istd==3)
       {
        System.out.println("Exam at 11 AM");
       }
       else if(istd==4)
       {
        System.out.println("Exam at 12 pm");
       }
       else
       {
        System.out.println("Invalid standard ");
       }



                                   
    }
}