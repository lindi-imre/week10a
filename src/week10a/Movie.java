package week10a;

import java.util.List;

public class Movie extends Product implements Buyable {

	Genre genre;
	long duration;
	double rate;
	List<Person> cast;
	int price;

	public Movie(String title, Person person) {
		super(title, person);
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public List<Person> getCast() {
		return cast;
	}

	public void setCast(List<Person> cast) {
		this.cast = cast;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "ID: " + id + "\n" + "Title: " + title + "\n" + "Cast: " + cast + "\nPrice: " + price + "\nInvestment: "
				+ getInvestment();
	}

	@Override
	public long getInvestment() {
		int totalInvestment = 0;
		for (Person person : cast) {
			totalInvestment += person.salary;
		}

		return totalInvestment;
	}

}
