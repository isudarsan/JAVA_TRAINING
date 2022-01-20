package org.app.main.collections;

import java.util.Collection;

public interface ItemService {

	
	void create(Item item);
	
	Collection<Item> getAll();
	
	Item findBy(int itemId);
	
	void update(Item item);
	
	void delete(int itemId);
}
