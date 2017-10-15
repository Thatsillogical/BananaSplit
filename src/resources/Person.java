package resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Person {
	
	private int pId;
	private String name;
	private ArrayList<Debt> debts;
	
	public Person(int pId, String name) {
		this.pId = pId;
		this.name = name;
		this.debts = new ArrayList<Debt>();
	}
	
	public boolean acceptItemBought(Receipt owned, Item finished) {
		owned.flagForDeletion();
		return true;
	}
	
	public boolean optIn(Item i) {
		return true;
	}
	
	public int rateSatisfaction(int share, Item i) {
		//100 is perfectly satisfied, 0 is 'I should pay 100% less', 200 is 'I should pay 100% more')
		return (int)(80.0/100 * share);
	}
	
	public ArrayList<Debt> getDebts() {
		return this.debts;
	}
	
	public void addDebt(Debt d) {
		this.debts.add(d);
	}
	
	public String toString() {
		return this.name;
	}
	
	public boolean equals(Person other) {
		return this.pId == other.pId;
	}
}
