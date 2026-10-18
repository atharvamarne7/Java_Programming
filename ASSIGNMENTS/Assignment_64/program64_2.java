// 5th & 18th bit ON or OFF
import java.util.*;

class program64_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iMask =  0, iResult = 0;
        boolean bFlag = false;

        System.out.println("Enter the number : ");

        iNo = sobj.nextInt();

        iMask = 0x00020010;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            bFlag = true;
        }

        if(bFlag )
        {
            System.out.println(" 5 & 18th bit is ON");
        }
        else
        {
            System.out.println("5th & 18th bit is OFF");
        }


    }
}