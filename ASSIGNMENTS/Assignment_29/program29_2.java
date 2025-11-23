/* Accept two inputs from user and print the pattern

    Input : iRow = 4
            iCol = 4

    Output :    2   4   6   8
                1   3   5   7
                2   4   6   8
                1   3   5   7  
*/ 

import java.util.*;

class pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, iStart = 0;

        for(i = 1; i <= iRow; i++)
        {
                if((i % 2) != 0 )
                {
                    iStart = 2;
                }
                else
                {
                    iStart = 1;
                }

                for(j = 1; j <= iCol; j++)
                {
                System.out.print("\t"+iStart);
                iStart += 2;
                }

            
            System.out.println();
        }
    }
}

class program29_2
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