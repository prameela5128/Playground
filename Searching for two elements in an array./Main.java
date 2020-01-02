#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){ 
  scanf("%d",&a[i]);
  }
  int s1,s2,c=0,d=0;
  scanf("%d\n%d",&s1,&s2);
  for(int i=0;i<n;i++){
    if(s1==a[i])
      printf("%d\n",i);
    else
      c++;
  }
  if(c==n)
    printf("-1");
 
  for(int i=0;i<n;i++){
    if(s2==a[i])
      printf("%d",i);
    else 
      d++;
  }
    if(d==n)
    printf("-1");

  //Type your code here
  return 0;
}