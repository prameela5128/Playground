#include <stdio.h> 
#include<math.h>
int main() 
{ 
    int n, s = 0, t, r, d = 0; 
    scanf("%d", &n);  
    t= n; 
    while (t != 0) 
    { 
        d++; 
        t = t / 10; 
    } 
    t= n; 
 
    while (t != 0) 
    { 
        r = t % 10; 
        s= s + pow(r, d); 
        t = t/ 10; 
    }  
    if (n == s) 
        printf("Armstrong Number"); 
    else 
        printf("Not an Armstrong Number");  
    return 0; 
}
