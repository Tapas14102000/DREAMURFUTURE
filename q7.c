//10001ST PRIME
#include<stdio.h>
void main()
{
     int i,c;
          for(i=2,c=1;c<=10001;i++)
          {
                int flag=0;
          for(int j=2;j<i;j++)
          {
               if(i%j==0)
               {
                    flag=1;
                    break;
               }
          }
          if(flag==0)
               c++;
          }
     printf("%d is the 10001 st prime number.",i-1);
}

