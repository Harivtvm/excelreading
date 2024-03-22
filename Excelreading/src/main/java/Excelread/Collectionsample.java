package Excelread;

import java.util.ArrayList;
import java.util.Iterator;

public class Collectionsample {

	public static void main(String[] args) {
		ArrayList<String> fruit=new ArrayList<String>(); 
fruit.add("orange");
fruit.add("apple");
fruit.add("mango");
System.out.println(fruit);
Iterator a=fruit.iterator();
while(a.hasNext()) {                                       
	System.out.println(a.next());}
	}

}
