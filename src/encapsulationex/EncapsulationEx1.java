package encapsulationex;

public class EncapsulationEx1 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCompany("현대");
		car1.setModelName("g90");
		car1.setProductYear(2023);
		car1.setPrice(90000000);
		
		//car1.price += 1000000;
		int price = car1.getPrice();//90000000이 담긴다
		price += 10000000;
		car1.setPrice(price);
		
		car1.setPrice(car1.getPrice() + 5000000);
		
		System.out.println("자동차 가격: " + car1.getPrice() );
		
	}
}


class Car {
	private String company;
	private String modelName;
	private int productYear;
	private int price;
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public int getProductYear() {
		return productYear;
	}
	
	public int getPrice() {
		return price;
	}
	
}

class PC {
	private String cpu;
	private int memorySize;
	private String videoCard;
	
	public PC() {}
	
	public PC(String cpu, int memorySize) {
		this.cpu = cpu;
		this.memorySize = memorySize;
	}
	
	public PC(String cpu, int memorySize, String videoCard) {
		this.cpu = cpu;
		this.memorySize = memorySize;
		this.videoCard = videoCard;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	public String getVideoCard() {
		return videoCard;
	}
	public void setVideoCard(String videoCard) {
		this.videoCard = videoCard;
	}
	
	
	
	
	
}


