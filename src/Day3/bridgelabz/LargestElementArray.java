package Day3.bridgelabz;

public class LargestElementArray {

	public static void main(String[] args) {
		int arr[]= new int [] {85,67,90,456,23};
		int max = arr[0];
	for(int i=1; i< arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
		
    System.out.println("Largest Element in the array" + max);
	}

}
