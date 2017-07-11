package Collections;

import java.util.*;


public class ArrayListDemo {

	public static void main(String[] args) {	
		//List allows duplicate values, stores values in the order given/added
		//Dynamic Arrays, can shrink or increase size dynamically unlike normal arrays
		/*ArrayList<String> atmp = new ArrayList<String>();
		atmp.add("hgdf");
		
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(atmp);
		al.add("BCD");
		al.add("A1");
		al.add("A2");
		al.add("A2");
		
		dArrayList("Original ArrayList: ", al);
		
		Collections.reverse(al);

		
		dArrayList("After Reversing: ",al);
		System.out.println("-------------------------");
	
		Collections.shuffle(al);
		
		dArrayList("After Shuffling ",al);*/
		ArrayList<Vehicle> vv  = new ArrayList<Vehicle>();
		vv.add(new Vehicle("A1", "car", 100000, 3000));
		vv.add(new Vehicle("A2", "bus", 1001010, 101001010));
		vv.add(new Vehicle("A3", "truck", 10010, 101));
		dArrayList("Original" , vv);
		Collections.reverse(vv);
		dArrayList("After Reversing ", vv);
		Collections.shuffle(vv);
		dArrayList("After Shuffling", vv);

	}
	
	static void dArrayList(String str, ArrayList<Vehicle> al)
	{
		System.out.println("------------------------------");
		System.out.println(str);
		Iterator<Vehicle> itr = al.iterator();
		//using Iterator, we can traverse only in forward direction
		for(;itr.hasNext();)
		{
			Object tStr = itr.next(); //returns Object
			System.out.println(tStr+"\n");
		}

	}

	/*static void dArrayList(String str, ArrayList<String> al)
	{
		System.out.println("------------------------------");
		System.out.println(str);
		Iterator<String> itr = al.iterator();
		//using Iterator, we can traverse only in forward direction
		for(;itr.hasNext();)
		{
			Object tStr = itr.next(); //returns Object
			System.out.println(tStr+"\n");
		}

	}*/
}

class Vehicle {
	String model;
	String name;
	long numberOfUnits;
	double price;
	private int sum;

	public Vehicle(String model, String name, long numberOfUnits, double price) {
		this.model = model;
		this.name = name;
		this.numberOfUnits = numberOfUnits;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.model+" "+this.name+" "+this.numberOfUnits+" "+this.price;
	}

	public int hashCode(){
		StringBuffer bf = new StringBuffer();
		bf.append(model);
		bf.append(name);
		bf.append(numberOfUnits);
		bf.append(price);
		int sum = 0;
		for(int i = 0; i < bf.length(); i++){
			sum += i*bf.charAt(i);
		}
		//System.out.println(model +" "+sum);
		this.sum = sum;
		return sum;

	}

	@Override
	public boolean equals(Object o){
		//System.out.println(this);
		return this.sum == ((Vehicle)o).sum;
	}

}
