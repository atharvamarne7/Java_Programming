//  Write a program to print all Odd numbers till N

class Logic
{
    void PrintOddNumber(int iNum)
    {
        int iCnt = 0;
         
        System.out.println("Odd Numbers : ");
        
        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                System.out.println(+iCnt);
            }
        }
    }       
}

class Program88
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintOddNumber(20
        );
    }
}