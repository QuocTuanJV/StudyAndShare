package com.copyConstructor;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hm = new Human("hm - TUAN", 18);
		
		Human cpHM = new Human(hm);
		
//		cpHM.setAge(20);
//		cpHM.setName("NAM");
		
		System.out.println("-------Human-------");
		System.out.println("Name: "+ hm.getName());
		System.out.println("Age : "+ hm.getAge());
		
		System.out.println("------CopyHuman-------");
		System.out.println("Name: "+ cpHM.getName());
		System.out.println("Age : "+ cpHM.getAge());
		
		

	}

}
