package efg;

public class SumOfArray {
	 public static void main(String args[]){
	      int[] array = {10, 60, 30, 70, 50, 10};
	      int sum = 0;
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array elements is:"+sum);
	   }
}


