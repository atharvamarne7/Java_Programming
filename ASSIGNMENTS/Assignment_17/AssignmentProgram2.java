// Write a program to check weather a number is a palindrome or not

class Logic
{
    void CheckPalindrome(int iNum)
        {
            int iOriginal = iNum;
            int iDigit = 0, iReverse = 0;

            while(iNum != 0)
            {
                iDigit = iNum % 10;
                iReverse =(iReverse*10) + iDigit;
                iNum =iNum/10;

            }

            if(iReverse == iOriginal)
            {
                System.out.println(iReverse+"is palindrome number");
            }
            else
            {
                System.out.println(iReverse+"is not a palindrome number");
            }
        }
}


class AssignmentProgram2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrome(121);
    }
}