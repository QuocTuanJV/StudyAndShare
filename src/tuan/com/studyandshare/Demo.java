package tuan.com.studyandshare;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 5;
		int c = 3;
		
		if((a++ > 10) & (b-- < 5)) {
			System.out.println("a = " + a +" b= "+ b );
		}else {
			System.out.println("a = " + a +" b= "+ b );
		}
		
		if(c == 3) {
			System.out.println("true"+ c);
		}
		else
			System.out.println("false"+ c);
		
		if(++c == 3) {
			System.out.println("true"+ c);
		}
		else
			System.out.println("false"+ c);
		
		System.out.println(c);

	}

}
