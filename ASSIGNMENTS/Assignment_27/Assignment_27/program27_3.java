/* Accept two inputs from user and print the pattern

    Input : iRow = 4
            iCol = 5

    Output :  5     4     3    2   1
              5     4     3    2   1
              5     4     3    2   1
              5     4     3    2   1   

*/ 

import java.util.*;

class pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >= 1; j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

class program27_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        pattern pobj = new pattern();
        pobj.Display(iValue1,iValue2);

    }
}