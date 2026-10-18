#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0x00000240;   //  7th & 10th bit mask 

    iNo = iNo ^ iMask;     //toggle 7th & 10th  bit

    return iNo;
}

int main()
{
    UINT iNo = 0;
    UINT iRet = 0;

    printf("Enter the number : \n");
    scanf("%u",&iNo);

    iRet = ToggleBit(iNo);

    printf("Modified number: %u", iRet);
    return 0;
}