/*  Accept the number from user and display the below pattern

    Input : 5
    Output : 1  #   2   #   3  #    4   #   5   #

*/

import java.util.*;

class pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        

        for(iCnt = 1 ; iCnt <= iNo; iCnt++)
        {
            System.out.printf("%d\t#\t",iCnt);
        }
        System.out.println();
    }
}

class program26_3
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