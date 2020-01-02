#include<stdio.h>
int square(int n){
  int s=n*n;
  return s;
}
int main() {
  int n;
  scanf("%d",&n);
  printf("%d",square(n));
   // Type your code here
   return 0;
}