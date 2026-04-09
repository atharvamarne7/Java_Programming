// Write a program to find maximum of two numbers


class Logic
{
    void FindMax(int iNo1,int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1+" Is Maximum Number");
        }
        else
        {
            System.out.println(iNo2+"Is Maximum Number");
        }
    }
}

class AssignmentProgram3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMax(20,15);
    }
}