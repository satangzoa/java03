package array;

public class ArrayEx3 {
	public static void main(String[] args) {
		String[] arr = { //문자열 크기 비교
				"I'll  be back",
				"Good morning!",
				"Hello",
				"Nice to meet you.",
				"Be good.",
				"좋은 아침이당",
				"건강하슈",
				"행복한 하루 되시오."
		};
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0)  {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] );
		}
		
	}
}
