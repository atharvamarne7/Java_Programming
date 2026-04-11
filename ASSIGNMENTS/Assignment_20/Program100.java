// write a program to find smallest digit from the given number

class Logic
{
    void FindSmallestDigit(int iNum)
    {
        int iDigit = 0;
        int iSmallest = 9;

        if(iNum < 0)
        {
            iNum = -iNum;  // Handle negative numbers
        }

        if(iNum == 0)
        {
            System.out.println("Smallest digit is: 0");
            return;
        }

        while(iNum != 0)
        {
            iDigit = iNum % 10;    // Get last digit

            if(iDigit < iSmallest)
            {
                iSmallest = iDigit; // update if smaller digit found
            }

            iNum = iNum / 10;      // Remove last digit
        }

        System.out.println("Smallest digit is: " + iSmallest);
    }
}

class Program100
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindSmallestDigit(45872);
    }
}
