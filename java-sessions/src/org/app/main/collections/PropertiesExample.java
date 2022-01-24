package org.app.main.collections;

import java.io.File;
import java.io.FileInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesExample {

	public static void main(String args[]) {

		try {

			Properties properties = new Properties();

			properties.load(new FileInputStream(new File("application.properties")));

			Set set = properties.keySet();

			Iterator it = set.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			
			
			
			Collection collection = properties.values();
			
			Iterator valIt = collection.iterator();
			
			while(valIt.hasNext()) {
				System.out.println(valIt.next());
			}
			
			
			
			System.out.println("The Value for Key is : "+properties.getProperty("databse"));
			System.out.println("The Value for Key is : "+properties.getProperty("url"));
			
			
			

		} catch (Exception e) {

		}
	}
}
