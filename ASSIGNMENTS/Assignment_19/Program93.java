// write a program to check weather a number is divisible by 5 or 11 or not

class Logic
{
    void CheckDivisible(int iNum)
    {
        if((iNum % 5 == 0) && (iNum % 11 == 0))
        {
            System.out.println(iNum + " is divisible by both 5 and 11");
        }
        else
        {
            System.out.println(iNum + " is not divisible by both 5 and 11");
        }
        
    }
}

class Program93
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}
