/* Accept two inputs from user and print the pattern

    Input : iRow = 4
            iCol = 4

    Output :     1    2    3    4
                -1   -2   -3   -4
                 1    2    3    4
                -1   -2   -3   -4
*/ 

import java.util.*;

class pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i % 2) == 0 )
                {
                    System.out.print(-j+"\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
            
            System.out.println();
        }
    }
}

class program29_4
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