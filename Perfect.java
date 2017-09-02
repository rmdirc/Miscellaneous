//Perfect numbers up to 1000 starting at 1
//Perfect number: all factors add up into it

import java.lang.Math;
import java.util.*;

public class Perfect {
  private static ArrayList<Integer> getFactors(int n) {
    ArrayList factors = new ArrayList<Integer>();
    factors.add(1);
    int middle = (int)Math.floor(Math.sqrt(n));
    for(int i=1; i<=middle;i++) {
      for(int e=middle;e<n;e++) {
        if (e*i==n) {
          factors.add(i);
          if(e!=i){
          factors.add(e);
        }}
      }
    }
      return factors;
  }

  public static void main(String args[]) {
    int PMIN=1;
    int PMAX=1000;
    ArrayList perfects = new ArrayList<Integer>();
    for(int i=PMIN;i<PMAX;i++) {
      ArrayList ifc = getFactors(i);
      int sum=0;
      for(int e=0;e<ifc.size();e++) {
        sum+=(int)ifc.get(e);
      }
      if(sum==i) {
        perfects.add(i);
      }
    }
    System.out.println("Perfect Numbers from "+PMIN+" to "+PMAX+":"+perfects.toString());
  }
}
