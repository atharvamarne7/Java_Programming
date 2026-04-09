// Write a program to print numbers from N to 1 in reverese order

class Logic
{
    void PrintReverse(int iNum)
    {
        int iCnt = 0;

        System.out.println("Reverse Numbers : ");

        for(iCnt = iNum; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
                
    }
}

class Program97
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(10);
    }
}
