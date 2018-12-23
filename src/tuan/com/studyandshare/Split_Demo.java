package tuan.com.studyandshare;

public class Split_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="tuan 123 456";
		
		String[] sp = str.split(" ");//split get sring
		for(int i = 0; i < sp.length; i++) {
		System.out.println(sp[i]);
		}

	}

}
