package array;

public class ArrayEx4 {
	public static void main(String[] args) {
		Student[] studentArr = new Student[5];
		studentArr[0] = new Student("s001", "홍길동", 15);
		studentArr[1] = new Student("s002", "김자바", 24);
		studentArr[2] = new Student("s003", "펭수", 10);
		studentArr[3] = new Student("s004", "고라니", 70);
		studentArr[4] = new Student("s005", "이순신", 80);

		displayStudentList(studentArr, "<< 학생 목록 >>");
		
		sortByName(studentArr);
		
		displayStudentList(studentArr, "<< 이름 순 학생 목록 >>");
		
		sortByAgeDesc(studentArr);
		
		displayStudentList(studentArr, "<< 나이 많은 순 학생 목록 >>");
		
		
	}
	
	static void displayStudentList(Student[] arr, String title) {
		System.out.println(title);
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].displayInfo();
		}
	}
	
	static void sortByName(Student[] arr) { //이름순 compareTo는 문자크기비교
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[i].getName().compareTo(arr[j].getName()) > 0)  {
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	static void sortByAgeDesc(Student[] arr) { //나이 많은 순
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[i].getAge() < (arr[j].getAge()))  {
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

class Student {
	private String StudentNo;
	private String name;
	private int age;
	
	public Student() {
	}

	public Student(String studentNo, String name, int age) {
		StudentNo = studentNo;
		this.name = name;
		this.age = age;
	}

	public String getStudentNo() {
		return StudentNo;
	}

	public void setStudentNo(String studentNo) {
		StudentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("학번: " + StudentNo);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("---------------------------");
		
	}
	
	
}
