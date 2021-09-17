package chap3;

public class prac7 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10 +1);
		}
		
		System.out.print("·£´ýÇÑ Á¤¼öµé");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("Æò±ÕÀº " + (double)sum/arr.length);
	}
}
