#include<stdio.h>

typedef unsigned int UINT;

UINT offBit(UINT iNo)
{
    UINT iMask = 0x00000040;   // 7th bit mask  

    if((iNo & iMask) == iMask)
    {
        iNo = iNo ^ iMask;    // OFF 7th bit
    }

    return iNo;
}

int main()
{
    UINT iNo = 0;
    UINT iRet = 0;

    printf("Enter the number : \n");
    scanf("%u",&iNo);

    iRet = offBit(iNo);

    printf("%u",iRet);
    return 0;
}