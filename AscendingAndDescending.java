import java.util.*;

public class AscendingAndDescending {
  static List<Integer> sorted;
  private static void sortListAscending(List<Integer> nums, int index) {
    int smallest=index;
    if(index<nums.size()-1) {
      for(int i=index;i<nums.size();i++){
        if(nums.get(i)<nums.get(smallest)) {
          smallest=i;
        }
      }
      int temp = nums.get(index);
      nums.set(index,nums.get(smallest));
      nums.set(smallest,temp);
      sortListAscending(nums,index+1);
    } else {
      sorted = nums;
    }
  }
  public static void main(String[] args){
    List<Integer> numbers = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter numbers, enter go to start sorting:");
    int firstNumber = input.nextInt();
    numbers.add(firstNumber);
    while(input.hasNextInt() && (!(input.equals("go")))) {
      numbers.add(input.nextInt());
    }
    sortListAscending(numbers, 0);
    String asc = "Ascending: ";
    String des = "Descending: ";
    for(int i=0;i<sorted.size();i++) {
      asc += sorted.get(i)+" ";
    }
    for(int i=sorted.size()-1;i>=0;i--) {
      des+= sorted.get(i) + " ";
    }
    System.out.println(asc);
    System.out.println(des);
  }
}
