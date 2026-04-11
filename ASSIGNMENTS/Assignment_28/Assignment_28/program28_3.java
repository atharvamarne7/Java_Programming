/* Accept two inputs from user and print the pattern

    Input : iRow = 3
            iCol = 3

    Output :  A     A      A
              B     B      B
              C     C      C
              

*/ 

import java.util.Scanner;

class pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0; 
        char ch = '\0';                     // default value of character

        for(i = 1,ch = 'A'; i <= iRow; i++,ch++)
        {   
            for(j = 1; j <= iCol; j++)
            {
                System.out.printf("%c\t",ch);     
            }
            System.out.println();
        }
    }
}

class program28_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns :");
        iValue2 = sobj.nextInt();

        pattern pobj = new pattern();
        pobj.Display(iValue1,iValue2);
    }   
}
