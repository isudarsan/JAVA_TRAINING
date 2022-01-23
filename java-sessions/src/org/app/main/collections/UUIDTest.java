/**
 * 
 */
package org.app.main.collections;

import java.util.UUID;

/**
 * @author sudarsanpro
 *
 */
public class UUIDTest {

	
	public static void main(String args[]) {
		
		
	    String st = UUID.randomUUID().toString();
	    
	    UUID u = UUID.randomUUID();
	    
	    System.out.println(u.toString());
	    System.out.println(u.variant());
	    
	    
	    System.out.println(st);
	}
}
