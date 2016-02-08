package week10a;

public abstract class Product {
	String id;
	String title;
	Person person;

	public abstract long getInvestment();

	public Product(String title, Person person) {
		this.id = IdGenerator.generator(this);
		this.title = title;
		this.person = person;
	}

	public String getTitle() {
		return title;
	}

	public Person getPerson() {
		return person;
	}
}
