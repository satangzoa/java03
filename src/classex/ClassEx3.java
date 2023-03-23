package classex;

public class ClassEx3 {
	public static void main(String[] args) {
		
		은행계좌 a1 = new 은행계좌("123-456-789", "홍길동", "1234",  0);
		a1.계좌정보출력();
//		a1.잔액 += 100000;
		a1.입금(100000);
		a1.출금(50000);
		a1.출금(100000000);
		a1.계좌정보출력();
		
	}
}


class 은행계좌 { //1번
	//멤버변수 필드field
	String 계좌번호;
	String 예금주;
	String 비밀번호;
	private long 잔액;

	은행계좌() {}
	은행계좌(String 계좌번호,String 예금주, String 비밀번호,long 잔액) {
		this.계좌번호 = 계좌번호;
		this.예금주 = 예금주;
		this.비밀번호 = 비밀번호;
		this.잔액 = 잔액;
	}
	
	void 계좌정보출력() {
		System.out.println("계좌정보: " + 계좌번호 + "(" + "예금주" + ")");
		System.out.println("잔 액:" + 잔액 + "원");		
	}
	
	public void 입금(long 입금액) {
		잔액 += 입금액;
	}
	
	public void 출금(long 출금액) {
		if (잔액 - 출금액 >= 0)
		잔액 -= 출금액;
		else
			System.out.println("잔액이 부족합니다!!!");
	}
	
}



