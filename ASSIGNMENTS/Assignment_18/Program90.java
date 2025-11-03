// Write a program to check weather a number is positive , negative or zero

class Logic
{
    void CheckSign(int iNum)
    {
        if(iNum > 0)
        {
            System.out.println(iNum + " is Positive");
        }
        else if(iNum == 0)
        {
            System.out.println(iNum + " is Zero");
        }
        else
        {
            System.out.println(iNum + " is Negative");
        }
    }       
}

class Program90
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckSign(-8);
    }
}
