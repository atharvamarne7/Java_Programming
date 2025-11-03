// Write a program to find factorial of a number using a for loop

class Logic
{
    void FindFactorial(int iNum)
    {
        int iCnt = 0;
        int iFactorial = 1;

        for(iCnt = 1; iCnt<=iNum; iCnt++)
        {
           iFactorial = iFactorial * iCnt;
        }

        System.out.println("Factorial is : "+iFactorial);
    }
}


class Program3_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindFactorial(5);

    }
}