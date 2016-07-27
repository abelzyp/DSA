package Sorting;
/**
 * {24, 69, 80, 57, 13}
 * @author zhangzhang
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13};
		printArray(arr);
		selectSort(arr);
		printArray(arr);
	}

	public static void selectSort(int[] arr){
		for(int i = 0;i<arr.length-1;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int i = 0;i<arr.length;i++){
			if(i == arr.length-1){
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+", ");
			}
		}
		System.out.println("]");
	}
}
