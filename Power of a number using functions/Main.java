import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int b=s.nextInt();
    int e=s.nextInt();
    sum(b,e);
  }
  public static void sum(int x,int y){
    int su=1;
    for(int i=0;i<y;i++)
      su*=x;
    System.out.println(su);
  }
}