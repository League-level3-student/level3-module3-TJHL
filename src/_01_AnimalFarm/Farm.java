package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		Cow cow_1 = new Cow();
		Cow cow_2 = new Cow();
		Chicken little = new Chicken();
		Chicken chicken_2 = new Chicken();
		Pig pig_1 = new Pig();
		Human retired_navy_SEAL = new Human();
		
		ArrayList <Animal>farm = new ArrayList() ;
		farm.add(cow_1);
		farm.add(little);
		farm.add(pig_1);
		farm.add(cow_2);
		farm.add(chicken_2);
		farm.add(retired_navy_SEAL);
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).interact();
		}
	}
}
