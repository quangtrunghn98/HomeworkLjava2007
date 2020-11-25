package buoi12;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NumberLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> numberList = new LinkedList<>();
		creatList(numberList);
		sortList(numberList);
		System.out.println("Gia tri trung binh cua list: " + avgList(numberList));
	}
	
	public static void creatList(LinkedList<Integer> list) {
		Random rd = new Random();
		for ( int i =0; i < 25; i++ ) {
			list.add(rd.nextInt(101));
		}
		System.out.println("Linkedlist duoc tao " + list);
	}
	
	public static void sortList(LinkedList<Integer> list) {
		Collections.sort(list);
		System.out.println("Linkedlist duoc sap xep " + list);
	}
	
	public static double avgList(LinkedList<Integer> list) {
		
		int sum = 0;
		for ( int i = 0; i < list.size(); i++) {
			sum+= list.get(i);
		}

		return (double)sum/list.size();
	}
	
}
