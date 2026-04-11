/*
    Input : 8
    Output : 2  4   6   8   10  12  14  16

*/

import java.util.*;

class pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        

        for(iCnt = 1 ; iCnt <= iNo; iCnt++)
        {
               System.out.print(iCnt*2+"\t");
        }
        System.out.println();
    }
}

class program26_5
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