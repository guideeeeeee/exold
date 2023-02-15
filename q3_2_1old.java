import java.util.Scanner;
public class q3_2_1old{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    double t=0,ran;
    int fs=0,sen=0,rand;
    System.out.print("Enter number of rows(m):");
    int m = sn.nextInt();
    System.out.print("Enter number of columns(n):");
    int n = sn.nextInt();
    for(int i=0;i<m;i++){
      for(int j = 0;j<n;j++){
        ran =((Math.random()*4000)-500);
        rand = (int)ran;
        System.out.printf("%d\t",rand);
        t+=ran;
        if(rand%4==0&&rand%7 == 0)
          fs+=1;
        else if(rand %7==0&&rand%9==0)
          sen+=1;
      }
      System.out.println();
    }
    System.out.printf("The sum of our numbers in the %dx%d is %.0f\n",m,n,t);
    System.out.printf("The total number of numbers divisible by both 4 and 7 is %d\n",fs);
    System.out.printf("The total number of numbers divisible by both 7 and 9 is %d\n",sen);
  }
}