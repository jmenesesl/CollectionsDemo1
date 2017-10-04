/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author iaw26068632
 *
 */
public class Main {

	public static List<String> subLlista(List<String> list, String expressio) {
		List<String> result = new LinkedList();
		
		/*
		 * for (String string: list) {
		 * 	if (string.indexOf(expressio) != -1) {   // SI SE ENCUENTRA LA EXPRESION EN EL STRING
		 * 	result.add(string);
		 * 	}
		 * }
		 * 
		 * Otra: string.startsWith(expressio)
		 */
		for (String string: list) {			
			if (string.substring(0, expressio.length()).equals(expressio)) {
				result.add(string);
			}
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
//		List<String> list = new ArrayList();
		List<String> list = new LinkedList<>();
		
		list.add("Alpha");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Echo");
		list.add("Delta");
		list.add("Zulus");
		list.add("Albacete");
		list.add("Alava");
		
		list.remove("Charlie");
		
		// Ordenar una lista		
		Collections.sort(list);
		
		
		// Listar una lista
		
		for(String string: list) {
			System.out.println(string);
		}
		
		List<String> result = subLlista(list, "Al");
		
		System.out.println("\n\nSUBLLISTA\n******************\n");
		for(String string: result) {
			System.out.println(string);
		}
	}

}
