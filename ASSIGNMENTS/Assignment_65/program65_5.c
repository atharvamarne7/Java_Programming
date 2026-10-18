#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo)
{
    UINT iMask = 0x00000000f;  

    iNo = iNo | iMask;    
         
    return iNo;
}

int main()
{
    UINT iNo = 0;
    UINT iRet = 0;

    printf("Enter the number : \n");
    scanf("%u",&iNo);

    iRet = OnBit(iNo);

    printf("Modified number: %u", iRet);
    return 0;
}