// 7, 15, 21,28 bit ON or OFF
import java.util.*;

class program64_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iMask =  0, iResult = 0;
        boolean bFlag = false;

        System.out.println("Enter the number : ");

        iNo = sobj.nextInt();

        iMask = 0x08104040;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            bFlag = true;
        }

        if(bFlag )
        {
            System.out.println(" 7th, 15th, 21st, 28th bit are ON");
        }
        else
        {
            System.out.println(" 7th, 15th, 21st, 28th bit are OFF");
        }


    }
}