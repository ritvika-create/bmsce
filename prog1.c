#include<stdio.h>
void main()
{
   int n,m,x=1,i;
    
    printf("Enter two nos.: \n");
    scanf("%d %d",&n,&m);
    while(x!=0)
    {
        
        printf("enter: 1 for Addition \n 2 for Sub \n 3 for Multiplication \n 4 for division\n 5 to Compare\n 6 for modules\n Press 7 for remaninder\n Press -1 for exit\n");
        scanf("%d",&i);
        if(i==1)
            printf("result is %d",m+n);
        else if(i==2)
            printf("result is %d",m-n);
        else if(i==3)
            printf("result is %d",m*n);
        else if(i==4)
            printf("result is %d",m/n);
        else if(i==5)
        {
            if(n==m)
            {
                printf("the nos are equal");
            }
            else
            {
                if(n>m)
                    printf("n is greater than m");
                else
                    printf("m is greater than n");
            }
        }
        else if(i==6)
            printf("%d",abs(m,n));
        else if(i==7)
            printf("%d",m%n);
        else if(i==-1)
        {
            printf("end of process");
            z=0;
        }
        else
        {
            printf("incorrect input");
        }
    }

    
}
