//SPECIAL PYTHAGOREAN TRIPLET
#include<stdio.h>
void main()
{
    for(int i=1;i<=1000;i++)
    {
         for (int j=i+1; j<=1000; j++)
          {
               int k=1000-i-j;
               if (i*i+j*j==k*k)
                    {
                         printf("\nRESULT=%d",i*j*k);
                    }
          }
     }
}
