// Write a program to find the sum of even and odd digits seperately

class Logic
{
    void SumEvenOdd(int iNum)
    {
        int iSumE = 0, iSumO = 0, iDigit = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            
            if((iDigit % 2)==0)
            {
                iSumE = iSumE + iDigit;
            }
            else
            {
                iSumO = iSumO + iDigit;
            }

            iNum = iNum/10;

        }

        System.out.println("Sum of even digits is :"+iSumE);
        System.out.println("Sum of Odd digits is :"+iSumO);

    }
}

class Program89
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenOdd(123456);
    }

}