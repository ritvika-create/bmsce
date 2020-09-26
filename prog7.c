#include<stdio.h>
void main()
{
  int n,i,m,min,x,c1,c2,c3;
  struct student {
  int ec;
  char name[50];
   } a[50];
   printf("enter the number of students");
   scanf("%d",&n);
   for(i=0;i<n;i++)
   {
       printf("enter %d student name and course /n 1.IOT \n 2. Advanced Java \n 3. Advanced DS",i+1);
       scanf("%s %d",a[i].name,&a[i].ec);
       if(a[i].ec==1)
        c1++;
       if(a[i].ec==2)
        c2++;
        if(a[i].ec==3)
        c3++;
   }
   if(c1<=c2 && c1<c3)
    min=c1;
   if(c2<=c1 && c2<c3)
    min=c2;
    if(c3<=c1 && c3<c2)
    min=c3;
printf("enter the course number and names of students opting the course\n");
scanf("%d",&x);
printf("enter the names of students opting the course\n");
for(i=0;i<n;i++)
{ if(a[i].ec==x)
printf("%s \n",a[i].name);
}
printf("no. of students in course 1 : %d\n",c1);
printf("no. of students in course 2 : %d\n",c2);
printf("no. of students in course 3 : %d \n",c3);

if(c1<3 && c2>=3 && c3>=3)
{
    printf("course 1 won't be floated. select from other 2 options \n");
    m=1;
}
if(c1>=3 && c2<3 && c3>=3)
{
    printf("course 2 won't be floated. select from other 2 options \n");
    m=2;
}
if(c1>=3 && c2>=3 && c3<3)
{
    printf("course 3 won't be floated. select from other 2 options \n");
    m=3;
}
else
{
    if(min==1)
    {
        printf("select from course 2 and 3 \n");
        m=1;
    }
     else if(min==2)
    {
        printf("select from course 1 and 3 \n");
        m=2;
    }
     else if(min==1)
    {
        printf("select from course 2 and 1 \n");
        m=3;
    }
    if(m==1)
    {
        for(i=0;i<n;i++)
        {
            if(a[i].ec==1)
            {
                printf("enter the new course,name=%s \n",a[i].name);
                scanf("%d",&a[i].ec);
            }
        }
    }
    if(m==2)
        {
        for(i=0;i<n;i++)
        {
            if(a[i].ec==2)
            {
                printf("enter the new course,name=%s \n",a[i].name);
                scanf("%d",&a[i].ec);
            }
        }
    }
    if(m==3)
        {
        for(i=0;i<n;i++)
        {
            if(a[i].ec==3)
            {
                printf("enter the new course,name=%s \n",a[i].name);
                scanf("%d",&a[i].ec);
            }
        }
    }
    printf("students course 1:");
    for(i=0;i<n;i++)
    {
        if(a[i].ec==1)
            printf("%s \n",a[i].name);
    }
    printf("students course 2:");
    for(i=0;i<n;i++)
    {
        if(a[i].ec==2)
            printf("%s \n",a[i].name);
    }
    printf("students course 3:");
    for(i=0;i<n;i++)
    {
        if(a[i].ec==3)
            printf("%s \n",a[i].name);
    }
}}
