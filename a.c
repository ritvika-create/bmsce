#include<stdio.h>
int main()
{
    int t=1;
    int a,b;
    printf("Enter two numbers: \n");
    scanf("%d %d",&a,&b);
    while(t!=0)
    {
        int i;
        printf("\nPress: 1 for Addition\n2 for Sub\n3 for Multiplication\n4 for division\n 5 to Compare\n 6 for modules\n Press 7 for remaninder\n Press -1 for exit\n");
        scanf("%d",&i);
        if(i==1)
            printf("%d",a+b);
        else if(i==2)
            printf("%d",a-b);
        else if(i==3)
            printf("%d",a*b);
        else if(i==4)
            printf("%d",a/b);
        else if(i==5)
        {
            if(a==b)
            {
                printf("Equal");
            }
            else
            {
                if(a>b)
                    printf("a is greater than b\n");
                else
                    printf("b is greater than a\n");
            }
        }
        else if(i==6)
            printf("%d",abs(a+b));
        else if(i==7)
            printf("%d",a%b);
        else if(i==-1)
        {
            printf("Thank you");
            t=0;
        }
        else
        {
            printf("Wrong Input plz try again......");
        }
    }

    return 0;
}
