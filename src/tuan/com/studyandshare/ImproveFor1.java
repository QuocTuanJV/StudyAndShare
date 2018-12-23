package tuan.com.studyandshare;

import java.util.ArrayList;

public class ImproveFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] str = new int [3];
		
		//ad element for array int
		for(int i = 0; i < str.length; i++) {
			str[i] = i + 1;
		}
		
		//print array
		System.out.println("----------Array------------------");
		for (int i = 0; i < str.length; i++) {
			System.out.println("str["+ i +"] = "+ str[i]);
		}
		
		System.out.println("----------ArrayList---------------");
		
		
		ArrayList <Integer> b = new ArrayList <Integer>();
		
		ArrayList <Integer> c = new ArrayList<Integer>();
		
		//ad element for ArrayList from Array use Improve For
		
		for (int i : str) {//Element i of array
			b.add(i);
		}
		
		//ad element for ArrayList from ArrayList
		
		for (int i : b) {
			c.add(i);
		}
		
		//print Array List use improve for
		
		for(int i : c) {// element i of array list
			System.out.println(i);
			
		}
		System.out.println("-----Get(i) ArrayList---------------");
		System.out.println("ArrayList thu 2 la: "+ b.get(2));
		
		
	}

}
