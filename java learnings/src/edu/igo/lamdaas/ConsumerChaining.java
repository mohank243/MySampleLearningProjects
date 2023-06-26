package edu.igo.lamdaas;

import java.util.function.Consumer;

class Movie{
	
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
	
}
public class ConsumerChaining {
	public static void main(String[] args) {
		Consumer<Movie> c = m->System.out.println("Movie is releasing toNight "+m.name);
		Consumer<Movie> c1 = m->System.out.println("Movie is running succesfully "+m.name);
		Consumer<Movie> c3 = m->System.out.println("Movie details is soored in database");
		Movie m = new Movie("Fast X");
		c.andThen(c1).andThen(c3).accept(m);
	}
}
