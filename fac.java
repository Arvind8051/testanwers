import java.util.Scanner;

public class fac {
  public static void main(String[] args) {
      int i; int p=1;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter your number");
      i =sc.nextInt();
      sc.close();
      for (int j = i; j >0; j--) {
        if(j==0)
        System.out.println(1);
        else
          p = j*p;
      }
      System.out.println("Factorial of "+ i + " 4is = " + p );
      
  }  
}
