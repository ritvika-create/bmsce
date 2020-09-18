#include<stdio.h>
int sumaver(int a,int b)
{
    int sum=a+b;
    int avg=sum/2;
    printf("Sum is %d\n",sum);
    return avg;
}
int printeven(int a , int b)
{
    if(a%2==0)
    {
        printf("\n%d is even",a);

    }
    if(b%2==0)
    {
            printf("\n%d is even",b);
    }
}
int main()
{
    int a,b,c,avg;
    printf("Enter three numbers: ");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b && a>c)
    {
        if(b>c)
        {
            avg=sumaver(a,b);

            printf("%d is the avg\n",avg);
            printeven(a,b);
        }
        else
        {
            avg=sumaver(a,c);

            printf("%d is the avg\n",avg);
            printeven(a,c);
        }
    }
    else if(b>c && b>a)
    {
        if(c>a)
        {
            avg=sumaver(b,c);
            printf("%d is the avg",avg);
            printeven(b,c);

        }
        else
        {
            avg=sumaver(a,b);
            printf("%d is the avg\n",avg);
            printeven(a,b);
        }

    }
    else
    {
        if(a>b)
        {
            avg=sumaver(a,c);
            printf("%d is the avg\n",avg);
            printeven(a,c);
        }
        else
        {
            avg=sumaver(b,c);
            printf("%d is the avg\n",avg);
            printeven(b,c);

        }
    }
    return 0;
}
