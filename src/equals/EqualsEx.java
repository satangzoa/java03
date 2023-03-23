package equals;

public class EqualsEx {
	public static void main(String[] args) {
		String s1 = new String("안녕?");
		String s2 = new String("안녕?");
		String s3 = new String("안녕??");
		
		System.out.println(s1 == s2); //위치가 달라서 false
		System.out.println(s1.equals(s2));//equals는 문자 비교
		System.out.println(s1.equals(s3));
	}
}
