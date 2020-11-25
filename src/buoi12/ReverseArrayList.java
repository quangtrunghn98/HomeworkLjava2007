package buoi12;

import java.util.ArrayList;
import java.util.Random;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<Character> arr1 = new ArrayList<>();
		creatArrayList(arr1);
		ArrayList<Character> arr2 = new ArrayList<>(reverse(arr1));
		System.out.println(arr2);
	}
	
	public static void creatArrayList(ArrayList<Character> list) {
		Random rd = new Random();
		for ( int i =0; i < 25; i++ ) {
			list.add((char) (rd.nextInt(126 - 32) + 32));
		}
		System.out.println("tao 10 ky tu " + list);
	}
	
	public static ArrayList reverse(ArrayList<Character> list) {
		   for(int i = 0, j = list.size() - 1; i < j; i++) {
		        list.add(i, list.remove(j));
		    }
		    return list;
	}
}
