package tuan.com.studyandshare;

public class Student {
	
	private String name;
	private int age;
	private static int sum;
	
	public void show() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public int sumNumber(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	

}
