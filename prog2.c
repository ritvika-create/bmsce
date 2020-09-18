#include<stdio.h>
int sumaver(int num1,int num2)
{
    int sum=num1+num2;
    int average=sum/2;
    printf("the sum is %d",sum);
    return(average);
}
int printeven(int num1 , int num2)
{
    if(num1%2==0)
    {
        printf("%d is even",num1);

    }
    if(num2%2==0)
    {
            printf("%d is even",num2);
    }
}
int main()
{
    int num1,num2,num3,average;
    printf("Enter any 3 nos. ");
    scanf("%d %d %d",&num1,&num2,&num3);
    if(num1>num2 && num1>num3)
    {
        if(num2>num3)
        {
            average=sumaver(num1,num2);

            printf("average is %d ",average);
            printeven(num1,num2);
        }
        else
        {
            average=sumaver(num1,num3);

            printf("average is %d ",average);
            printeven(num1,num3);
        }
    }
    else if(num2>num3 && num2>num1)
    {
        if(num3>num1)
        {
            average=sumaver(num2,num3);
            printf("average is %d",average);
            printeven(num2,num3);

        }
        else
        {
            averge=sumaver(num1,num2);
            printf("average is %d ",average);
            printeven(num1,num2);
        }

    }
    else
    {
        if(a>b)
        {
            avg=sumaver(num1,num3);
            printf("average is %d ",average);
            printeven(num1,num3);
        }
        else
        {
            averge=sumaver(num2,num3);
            printf("average is %d ",average);
            printeven(num2,num3);

        }
    }
    return 0;
}
