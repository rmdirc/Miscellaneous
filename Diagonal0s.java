public class Diagonal0s {
public static void main(String args[]) {
  int count=10;
  if(args.length>0) {
    count = Integer.parseInt(args[0]);
  }
  for(int i=0; i<count; i++) {
    String output = "";
    for(int e=0;e<i;e++){
      output+=" ";
    }
    System.out.println(output+"0");
  }
}
}
