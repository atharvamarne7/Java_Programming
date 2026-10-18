#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

// Insert node at beginning
void InsertFirst(PPNODE first, int no)
{
    PNODE newn = (PNODE)malloc(sizeof(NODE));
    newn->data = no;
    newn->next = NULL;

    if (*first == NULL)
        *first = newn;
    else
    {
        newn->next = *first;
        *first = newn;
    }
}

// Display linked list
void Display(PNODE first)
{
    while (first != NULL)
    {
        printf("| %d | -> ", first->data);
        first = first->next;
    }
    printf("NULL\n");
}

// Count total nodes
int Count(PNODE first)
{
    int iCount = 0;
    while (first != NULL)
    {
        iCount++;
        first = first->next;
    }
    return iCount;
}

// Displays all elements greater than the average of the list
void DisplayGreaterThanAverage(PNODE first)
{
    PNODE temp = NULL;
    int iSum = 0;
    int iAverage = 0;
    int iSize = Count(first);

    temp = first;
    while(temp != NULL)
    {
        
        iSum = iSum + temp->data;
        
        temp = temp->next;
    }

    iAverage = (iSum/iSize);

    printf("Elements greater than average:\n");
    temp = first;

    while(temp != NULL)
    {
        if(temp->data > iAverage)
        {
            printf("%d\t",temp->data);
        }
        temp = temp->next;
    }
    printf("\n");
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    // Insert 
    InsertFirst(&head, 17);
    InsertFirst(&head, 8);
    InsertFirst(&head, -29);
    InsertFirst(&head, 42);
    InsertFirst(&head, 33);
    InsertFirst(&head, -14);
    InsertFirst(&head, 5);

    printf("Linked list before replacing even numbers:\n");
    Display(head);

    iRet = Count(head);
    printf("Number of nodes after InsertFirst are : %d\n", iRet);
    printf("-------------------------------------------------------------\n");

    DisplayGreaterThanAverage(head);
    

    
    return 0;
}
