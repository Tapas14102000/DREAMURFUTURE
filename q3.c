//LARGEST PRIME FACTOR
#include<stdio.h>
int isprime(int);
void main()
{
     int n,max=0;
     printf("\nEnter a number :");
     scanf("%d",&n);
     for(int i=1;i<=n/2;i++)
     {
          if(n%i==0)
               {
                   int y=isprime(i);
                   if(y==0)
                    max=i;
               }
     }
     printf("\nLARGEST PRIME FACTOR=%d",max);
}
int isprime(int a)
{
     int flag=0;
          for(int i=2;i<a;i++)
     {
          if(a%i==0)
          {
               flag=1;
               break;
          }
     }
     if(flag==1)
          return 1;
          else
               return 0;
}
