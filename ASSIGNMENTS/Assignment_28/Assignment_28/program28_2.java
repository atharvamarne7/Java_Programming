/* Accept two inputs from user and print the pattern

    Input : iRow = 4
            iCol = 3

    Output :  A     B      C
              a     b      c
              A     B      C
              a     b      c  

*/ 

import java.util.Scanner;

class pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0; 
        char ch1 = '\0';                     // default value of character
        char ch2 = '\0';

        for(i = 1; i <= iRow; i++)
        {
            ch1 = 'A';
            ch2 = 'a';
                              
            for(j = 1; j <= iCol; j++)
            {
                if((i % 2) == 1)
                {
                    System.out.printf("%c\t",ch1);
                    ch1++;
                }
                else
                {
                    System.out.printf("%c\t",ch2);
                    ch2++;
                }
                          
            }
            System.out.println();
        }
    }
}

class program28_2
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
