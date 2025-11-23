/*  Accept the number from user and display the below pattern

    Input : 5
    Output : 5  #   4   #   3  #    2   #   1   #

*/

import java.util.*;

class pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        

        for(iCnt = iNo ; iCnt >= 1; iCnt--)
        {
            System.out.printf("%d\t#\t",iCnt);
        }
        System.out.println();
    }
}

class program26_2
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