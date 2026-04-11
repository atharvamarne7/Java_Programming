// write a program to print all numbers 1 to N that are divisible by both 2 and 3

class Logic
{
    void CheckDivisible(int iNum)
    {
        int iCnt = 0, iFrequency = 0;
        
        System.out.println("Number is Divisible by both 2 and 3 are :");

        for(iCnt =1; iCnt<=iNum; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println("Number is : "+iCnt);
                iFrequency++;
            }
            
        }


    }
}

class Program105
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(30);
    }
}