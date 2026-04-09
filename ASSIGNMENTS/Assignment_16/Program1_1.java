// Write a program to calculate the sum of First N natural numbers

class Logic
{
    void CalculateSum(int iNo)
    {
        int iSum = 0;

        iSum = iNo * (iNo -1)/2;
        System.out.println("Sum of first N natural numbers is :"+iSum);
    }
}


class Program1_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CalculateSum(10);
    }
}