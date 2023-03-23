package array;

public class ArrayEx1 {
	public static void main(String[] args) {
		// 한번 만들어진 배열은 크기를 변경할 수 없다
		// 빠르게 특정 요소(방)을 접근 할 수 있다
		int[] arr1 = new int[10];

		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (i + 1) * 10;
		}
		
		//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[9] = 100;
		
		int sum = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		
		
		System.out.println("누적값: " + sum);
		System.out.println("평균값: " + sum  / arr1.length);
		
	}
}
