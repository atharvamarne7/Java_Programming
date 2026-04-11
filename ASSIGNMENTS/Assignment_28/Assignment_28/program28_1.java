/* Accept two inputs from user and print the pattern

    Input : iRow = 4
            iCol = 3

    Output :  A     B      C
              A     B      C
              A     B      C
              A     B      C  

*/ 

import java.util.Scanner;

class pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0; 
        char ch = '\0';                     // default value of character

        for(i = 1; i <= iRow; i++)
        {
                              
            for(j = 1,ch = 'A'; j <= iCol; j++,ch++)
            {
                System.out.printf("%c\t",ch);
                          
            }
            System.out.println();
        }
    }
}

class program28_1
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
