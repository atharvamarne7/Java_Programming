// Accept a number from user and display the pattern
import java.util.*;

class pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; iCnt++,ch++)
        {
            System.out.print(ch+"\t");
        }
        System.out.println();
    }
}

class program26_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        pattern pobj = new pattern();
        pobj.Display(iValue);
    }
}