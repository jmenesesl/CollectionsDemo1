/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author iaw26068632
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("Alpha");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Echo");
		list.add("Delta");
		list.add("Zulu");
		
		list.remove("Charlie");
		
		Collections.sort(list);
		// Listar una lista
		
		for(String string: list) {
			System.out.println(string);
		}
		
	}

}
