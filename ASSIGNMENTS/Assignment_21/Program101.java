// Write a program to calculate product of each digit of a number

class Logic
{
    void ProductOfDigits(int iNo)
    {
        int iDigit = 0, iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iProduct = iProduct * iDigit;
            iNo = iNo / 10;
        }
        System.out.println("Product of Digits : "+iProduct);
    }
}

class Program101
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.ProductOfDigits(234);
    }
}

