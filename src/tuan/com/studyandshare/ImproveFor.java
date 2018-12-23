package tuan.com.studyandshare;

import java.util.ArrayList;

public class ImproveFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] str = new int [10];
		
//		int [] str = {5, 6, 7};
		
		
		for(int i = 0; i < str.length; i += 3) {

			str[i] = i;
			
			System.out.println("gia tri i: "+i);
		}
		
		for(int i = 0; i < str.length; i++) {

			System.out.println("mang str["+i+"]: " + str[i]);
		}
		
		
		ArrayList <Integer> b = new ArrayList<Integer>();

		// GAN GIA TRI CHO ARRAYLIS TU MANG KHAC
		// GAN PHAN TU MANG str[i]cho ArrayList
		for(int i : str) {// i phai cung kieu du lieu ma mang str chua
			b.add(i);
		}
		System.out.println("--------------");
		System.out.println(b.size()+" SIZE OF ARRAYLIST");
		System.out.println("--------------");
//		
		for(int i = 0; i < b.size(); i++) {
		System.out.println("ArrayList[" + i + "] = " + b.get(i));// get element index i in ArrayList
		
		}
		
		
		System.out.println("-----------------------");
		
		System.out.println("---TRUC TIEP IN RA KET QUA KHONG CO KHAI NIEM INDEX");
		System.out.println("---IN RA PHAN TU THU i CUA ARRAYLIST b");
		b.set(0, 1); b.set(1, 2);//thay the phan tu co b.set(a,b) (index a bang gia tri b)
		for (int i : b) {
//			System.out.println("ArrayList["+ i + "] = "+ b.get(i));
			System.out.println(i);//in ra phan tu thu 1 cua ArrayList b
		}
//		
		System.out.println("---TRUC TIEP IN RA KET QUA KHONG CO KHAI NIEM INDEX");
		
		for (int i : b) {
			System.out.println("Array["+ i + "] = "+str[i]);
		}

	}

}
