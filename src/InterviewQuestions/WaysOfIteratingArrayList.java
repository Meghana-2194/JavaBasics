package InterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class WaysOfIteratingArrayList {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of thrones");
		tvSeries.add("Bad Boys");
		tvSeries.add("Wolf");
		tvSeries.add("Hello");

		// using java 8 with for loop and lambda
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});

		System.out.println("_____________");
		// using Iterator

		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

	}

}
