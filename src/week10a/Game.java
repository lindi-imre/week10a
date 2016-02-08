package week10a;

import java.util.List;

public class Game extends Product implements Buyable {
	boolean preOrdered;
	List<Person> staff;
	int price;

	public Game(String title, Person person) {
		super(title, person);
	}

	public boolean isPreOrdered() {
		return preOrdered;
	}

	public void setPreOrdered(boolean preOrdered) {
		this.preOrdered = preOrdered;
	}

	public List<Person> getStaff() {
		return staff;
	}

	public void setStaff(List<Person> staff) {
		this.staff = staff;
	}

	@Override
	public int getPrice() {
		if (preOrdered) {
			return (int) (price * 0.8);
		}
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public long getInvestment() {
		int totalInvestment = 0;
		for (Person person : staff) {
			totalInvestment += person.salary;
		}
		return totalInvestment;
	}

	public String toString() {
		return "ID: " + id + "\nTitle: " + title + "\nPre-ordered: " + preOrdered + "\nStaff: " + staff + "\nPrice: "
				+ getPrice() + "\nInvestment: " + getInvestment();
	}

}
