package week10a;

public class Book extends Product {

	Person author;

	public Book(String title, Person person) {
		super(title, person);
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	@Override
	public long getInvestment() {
		return author.salary;
	}

	public String toString() {
		return "ID: " + id + "\n" + "Title: " + title + "\n" + "Person: " + person + "\n" + "Author: "
				+ author.firstName + " " + author.lastName + "\n" + "Investment: " + author.salary;
	}

}
