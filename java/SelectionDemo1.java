import java.util.Scanner;
class SelectionDemo1
{
    public static void main(String A[])
    {
       Scanner sobj=new Scanner(System.in);
       int iNo=0;
       
       System.out.println("Enter your age:");       //ask what is threshold value of age
       iNo=sobj.nextInt();

       if(iNo>=18)                      //jar 
       {
        System.out.println("You can vote");

       }
       else                                //nahi tar
       {
        System.out.println("You cant vote");
       }
                                            

    
    }
}