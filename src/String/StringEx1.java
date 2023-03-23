package String;

public class StringEx1 {
	public static void main(String[] args) {//문자열을 가공하는 메소드
		String v = "I Love You!🤣 ";
		String s = "I Love You! ";
		System.out.println("문자열의 길이: " + s.length());
		System.out.println("특정 위치의 문자: " + s.charAt(2));
		System.out.println("특정 단어의 위치값: " + s.indexOf("Love"));
		System.out.println("특정 단어의 위치값: " + s.lastIndexOf("o"));
		System.out.println("특정 단어를 치환: " + s.replace("Love", "Hate🤣"));
		System.out.println("부분 문자열: " + s.substring(2,6));
		System.out.println("부분 문자열: " + s.substring(2));
		System.out.println("소문자 변환: " + s.toLowerCase());
		System.out.println("대문자 변환: " + s.toUpperCase());
		System.out.println("앞뒤 공백 제거: " + s.trim());

		String[] words = s.split(" ");
		
		for(String w: words) {
			System.out.println(w);
		}
		
	}
}
