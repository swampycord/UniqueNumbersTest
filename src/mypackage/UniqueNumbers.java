package mypackage;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumbers {

	public static void main(String[] args) {

		App myApp = new App();
		myApp.resultLoop();

	}
}

class App {

	private static HashSet<Integer> list = new HashSet<>();
	private static String myInput;
	private static Scanner input;
	private static int count;
	private static int tries;

	public void memory() {
		list.add(null);
		count = 0;
		tries = 0;
	}

	public String answer() {
		input = new Scanner(System.in);
		System.out.print("Enter number or type 'quit' to stop: ");
		myInput = input.next();
		return myInput;
	}

	public void resultLoop() {

		do {
			answer();
		} while (loop());
		if (list.size() == 0) {
			System.out.println("Your list is empty:" + list);
		} else {
			System.out.println(count + " unique number: " + list);
			System.out.println("You have tried to input in total " + (tries + 1) + " times");
		}
		input.close();
	}

	private boolean loop() {

		try {
			if (myInput.equals("quit")) {
				return false;
			} else {
				Integer myInputInteger = Integer.parseInt(myInput);
				if (list.contains(myInputInteger)) {
					System.err.println("Not unique");
				} else {
					list.add(myInputInteger);
					count++;
					return true;
				}
				tries++;
				return true;
			}
		} catch (Exception e) {
			System.err.println("Invalid");
			tries++;
			return true;
		}
	}
}
