package week10a;

import java.util.ArrayList;
import java.util.List;

public class RentManager {
	public static void main(String[] args) {

		// PERSONS
		Person john = new Person();
		john.setFirstName("John");
		john.setLastName("Fox");
		john.setGender(Gender.MALE);
		john.setSalary(1000);

		Person mary = new Person();
		mary.setFirstName("Mary");
		mary.setLastName("Black");
		mary.setGender(Gender.FEMALE);
		mary.setSalary(1100);

		List<Person> renter = new ArrayList<Person>();
		renter.add(john);
		renter.add(mary);

		// AUTHORS
		Person lawrence = new Person();
		lawrence.setFirstName("L.L");
		lawrence.setLastName("Lawrence");
		lawrence.setGender(Gender.MALE);
		lawrence.setSalary(1600);

		Person hunter = new Person();
		hunter.setFirstName("Thompson");
		hunter.setLastName("Hunter S.");
		hunter.setGender(Gender.MALE);
		hunter.setSalary(1800);

		// ACTORS
		Person johny = new Person();
		johny.setFirstName("Johny");
		johny.setLastName("Depp");
		johny.setGender(Gender.MALE);
		johny.setSalary(1100);

		Person diCaprio = new Person();
		diCaprio.setFirstName("Leonardo");
		diCaprio.setLastName("Dicaprio");
		diCaprio.setGender(Gender.MALE);
		diCaprio.setSalary(1200);

		// BOOKS
		Book hp = new Book("Harry Potter", john);

		Book lotr = new Book("Lord of the rings", john);

		hp.setAuthor(lawrence);
		lotr.setAuthor(hunter);

		// MOVIE
		Movie m1 = new Movie("Titanic", john);
		m1.setPrice(1200);

		Movie m2 = new Movie("Sample movie", john);
		m2.setPrice(1300);

		List<Person> cast = new ArrayList<Person>();
		cast.add(diCaprio);
		cast.add(johny);

		m1.setCast(cast);
		m2.setCast(cast);

		// GAMES
		Game meatBoy = new Game("Super Meat Boy", john);
		meatBoy.setPreOrdered(false);
		meatBoy.setPrice(100);

		Game mortal = new Game("Mortal Kombat", john);
		mortal.setPreOrdered(true);
		mortal.setPrice(100);

		List<Person> staff = new ArrayList<Person>();
		staff.add(john);
		staff.add(mary);

		meatBoy.setStaff(staff);
		mortal.setStaff(staff);

		List<Buyable> buy = new ArrayList<Buyable>();
		buy.add(m1);
		buy.add(m2);
		buy.add(meatBoy);
		buy.add(mortal);

		System.out.println(hp);
		System.out.println();
		System.out.println(lotr);
		System.out.println();
		System.out.println(m1);
		System.out.println();
		System.out.println(m2);
		System.out.println();
		System.out.println(meatBoy);
		System.out.println();
		System.out.println(mortal);
		System.out.println("Total income: " + buyableIncome(buy));

	}

	// return with the total income
	public static int buyableIncome(List<Buyable> buy) {
		int totalIncome = 0;
		for (Buyable buyable : buy) {
			totalIncome += buyable.getPrice();
		}
		return totalIncome;
	}

}
