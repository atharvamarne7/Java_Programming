// calculate number of digits in given number


class Logic
{
    void CountDigits(int iNo)
    {
        int iDigit = 0, iFrequency = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iFrequency++;
            iNo = iNo/10;
        }

        System.out.println("Number of digits are :"+iFrequency);
    }
}

class Program5_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountDigits(7865);
    }
}