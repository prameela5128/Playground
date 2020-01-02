import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int f=n/100;
      int m=n%100;
      int l=m%10;
      int sum=f+l;
      System.out.println(sum);
        
		// Type your code here
	}
}