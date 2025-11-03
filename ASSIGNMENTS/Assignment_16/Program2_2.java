// check even odd

class Logic
{
    void CheckEvenOdd(int iNum)
    {
        if((iNum % 2)==0)
        {
            System.out.println(iNum+"Is Even");
        }
        else
        {
            System.out.println(iNum+"is Odd");
        }
    }
}


class Program2_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckEvenOdd(7);
    }
}
