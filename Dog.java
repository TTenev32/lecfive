package bg.thissome.newshit.lecfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dog {
	public static Scanner in = new Scanner(System.in);
	public String name;
	static List<Dog> dogs = new ArrayList<Dog>();
	public Dog(String name){
		this.name = name;
	}
	

	
	public String bark(){
		return "balo!";
	}
	
	public String status(String name){
		return name + " is barking very loud!";
	}
	
	public static void main(String[] args){
		


	int kk = in.nextInt();
	
	for (int i = 0; i <= kk; i++){
		dogs.add(new Dog("NewDog " + i));
		}
	
	for (int j = 0; j< dogs.size(); j ++){
		System.out.println(dogs.get(j).bark());
		System.out.println(dogs.get(j).status(dogs.get(j).name));

	}
	}
	
	
}
