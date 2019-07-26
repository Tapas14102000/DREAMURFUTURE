//LARGEST PALINDROME PRODUCT
#include<stdio.h>
int ispalindrome(int);
void main()
{
     int flag=1,i,j;
     for( i=999;i>=100;i--)
     {
          for( j=999;j>=100;j--)
          {
               int k=i*j;
               int ans=ispalindrome(k);
               if(ans==0)
               {flag=0;break;}
          }
          if(flag==0)
               break;
     }
     printf(" %d * %d = %d ,%d is the largest palindrome number.",i,j,i*j,i*j);

}
int ispalindrome(int a)
{
     int k=a,s=0;
     while(a!=0)
     {
          int r=a%10;
          s=s*10+r;
          a/=10;
     }
     if(k==s)
          return 0;
     else
          return 1;

}
