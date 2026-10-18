// 1 & last (32) bit ON or OFF
import java.util.*;

class program64_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iNo = 0, iResult = 0;
        long iMask =  0;
        boolean bFlag = false;

        System.out.println("Enter the number : ");

        iNo = sobj.nextLong();

        iMask = 0x80000001L;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            bFlag = true;
        }

        if(bFlag )
        {
            System.out.println("1st, 32th bit are ON");
        }
        else
        {
            System.out.println("1st, 32th bit are OFF");
        }


    }
}