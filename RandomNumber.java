package CoreJava;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		Random rand = new Random();
		Integer lowest = null;
		for (int i = 0; i < 500; i++) {

			Integer current = rand.nextInt(50000);
			System.out.println("Current value is " + current);
			if (lowest == null || current < lowest) {
				lowest = current;
				System.out.println("Lowest value is " + current);
			}
		}

		System.out.println("The final lowest value is " + lowest);

	}

}
