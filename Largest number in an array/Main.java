#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],c;
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);

  }
  c=a[0];
  for(int i=0;i<n;i++){
    if(a[i]>c)
      c=a[i];
  }
  printf("%d",c);
  //fill the code
  return 0;
}