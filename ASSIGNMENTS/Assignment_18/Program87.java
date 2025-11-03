// Write a program to print all even numbers till N

class Logic
{
    void PrintEvenNumber(int iNum)
    {
        int iCnt = 0;
         
        System.out.println("Even Numbers : ");
        
        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.println(+iCnt);
            }
        }
    }       
}

class Program87
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumber(20
        );
    }
}