// Write a program to print each digit of a number seperately

class Logic
{
    void PrintDigits(int iNum)
    {
        int iDigit = 0;

        if(iNum < 0)
        {
            iNum = -iNum;   
        }

        System.out.println("Digits are : ");
        while(iNum != 0)
        {
            iDigit = iNum % 10;
            System.out.println(iDigit);
            iNum = iNum / 10;
        }
        
    }
}

class Program94
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintDigits(9876);
    }
}

