package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {

		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	
ConnectDB connectDB = new ConnectDB();
ArrayList<Object> groceries = new ArrayList<>();

groceries.add("tomatoes");
groceries.add("onion");
groceries.add("avacado");
groceries.add("lemon");
groceries.add("limes");
groceries.add("salt");

int numOfgroceries = groceries.size();
groceries.remove("salt");
boolean containsAvacado = groceries.contains("avacado");

for(Object s : groceries){
	System.out.println(s);
	connectDB.InsertDataFromArrayListToMySql(groceries, "Grocery List", "Groceries");
}

//to do Iteration
		Iterator<Object> it = groceries.iterator();
		while(it.hasNext()){
			System.out.println(it.hasNext());
		}
	}
}
