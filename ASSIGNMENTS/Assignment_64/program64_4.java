// 7,8,9 bit ON or OFF
import java.util.*;

class program64_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iMask =  0, iResult = 0;
        boolean bFlag = false;

        System.out.println("Enter the number : ");

        iNo = sobj.nextInt();

        iMask = 0x000001C0;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            bFlag = true;
        }

        if(bFlag )
        {
            System.out.println("7th, 8th, 9th bit are ON");
        }
        else
        {
            System.out.println(" 7th, 8th, 9th bit are OFF");
        }


    }
}