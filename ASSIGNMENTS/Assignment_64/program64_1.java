// 15th bit ON or OFF

import java.util.*;

class program64_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iMask =  0, iResult = 0;
        boolean bFlag = false;

        System.out.println("Enter the number : ");

        iNo = sobj.nextInt();

        iMask = 0x00004000;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            bFlag = true;
        }

        if(bFlag )
        {
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is OFF");
        }


    }
}