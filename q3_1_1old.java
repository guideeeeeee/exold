import java.util.Scanner;
public class q3_1_1old{
  public static void main (String[]args){
    Scanner sn = new Scanner(System.in);
    int num ;
    double t;
    System.out.print("Enter number:");
    num = sn.nextInt();
    for(int i=0;i<=num;i++){
      t=((double)i/(i+2));
    if(i%50==0)
      System.out.printf("T = %.3f\n",t);
    }
  }
}