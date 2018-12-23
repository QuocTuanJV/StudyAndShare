package tuan.com.studyandshare;

public class Unit21 {

}

class Student{
	private String name;
	
	public void Study() {
		
	}
}

//Muc dich interface tao ra de cho cac lop khac implement
interface Humen{
	public final static String MY_COUNTRY = "VIET_NAM";// dac diem thuoc tinh trong interface
	
	public void move();
	
}

//abstract tao ra de phuong thuc khac extends
abstract class Robot{
	private String name;
	
	public abstract void work();
	
	public void run() {
		
	}
	
}