//factorials
import java.lang.Math;
public class Factorial {
  private static int factorial(int n) {
    int a=1;
    if(n!=0) {
      a = (n*factorial(n-(n/Math.abs(n)))); // changed to allow for negative numbers
    }
    return a;
  }

  public static void main(String args[]) {
    int loopTo=10;
    int loopFrom=0;
    if(args!=null) {
      if(args.length>1) {
        loopFrom=Integer.parseInt(args[0]);
        loopTo=Integer.parseInt(args[1]);
      } else {
        loopTo=Integer.parseInt(args[0]);
      }
    }
    if(loopFrom<loopTo) {
      for(int i=loopFrom;i<=loopTo;i++) {
        int f = factorial(i);
        System.out.println("Factorial of "+i+": "+f+"\n");
      }
  } else {
    for(int i=loopFrom;i<=loopTo;i--) {
      int f = factorial(i);
      System.out.println("Factorial of "+i+": "+f+"\n");
    }
  }
  }
}
