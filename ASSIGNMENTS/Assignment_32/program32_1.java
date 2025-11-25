/*
    Input : iRow = 4
            iCol = 4

    Output : *  *   *   #        
             *  *   #   *
             *  #   *   *
             #  *   *   *
*/

import java.util.Scanner;

class pattern
{
    // Filter for square matrix
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0; 
        if(iRow != iCol)
            {
                System.out.println("Inavlid input");
                System.out.println("Row number and column numnber should be same");
                return;
            }            
        for(i = 1; i <= iRow; i++)
        {            
            for(j = 1; j <= iCol; j++)
            {
                if(i + j == iCol + 1)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
                
            }
            System.out.println();
        }
    }
}

class program32_1
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
