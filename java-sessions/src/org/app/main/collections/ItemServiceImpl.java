package org.app.main.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ItemServiceImpl implements ItemService {

	
	Map<Integer, Item> items = new HashMap<Integer, Item>();
	
	@Override
	public void create(Item item) {
		items.put(item.getId(), item);	
		
	}

	@Override
	public Collection<Item> getAll() {
		return items.values();
	}

	@Override
	public Item findBy(int itemId) {
		return items.get(itemId);
	}

	@Override
	public void update(Item item) {
		items.put(item.getId(), item);
		
	}

	@Override
	public void delete(int itemId) {
		items.remove(itemId);
		
	}

}
