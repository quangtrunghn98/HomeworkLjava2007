package buoi12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CoutCharTest {

	public static void main(String[] args) {
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		createMap(myMap);
		displayMap(myMap);
	}

	private static void createMap(Map<Character, Integer> map) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();

		char[] tokens = input.toCharArray();

		for (char c : tokens) {
			if ( c != ' ' ) {
				if (map.containsKey(c)) {
					int count = map.get(c);
					map.put(c, count + 1);
				} else {
					map.put(c, 1);
				}
			}
		}

	}

	private static void displayMap(Map<Character, Integer> map) {
		Set<Character> keys = map.keySet(); // get keys
		TreeSet<Character> sortedKeys = new TreeSet<Character>(keys);
		System.out.println("\nMap contains:\nKey\t\tValue");
		for (Character key : sortedKeys) {
			System.out.printf("%-10s%10s\n", key, map.get(key));
		}
	}
	
}




