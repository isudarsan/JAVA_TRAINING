package com.java.training.csv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BatchUtil {

	public static <T> List<List<T>> makeBatch(Collection<T> collection, int batchSize) {

		List<List<T>> totalArrayList = new ArrayList<>();
		List<T> subLists = new ArrayList<>();

		Iterator<T> it = collection.iterator();

		for (int i = 0; i < collection.size(); i++) {

			subLists.add(it.next());

			if ((i + 1) % batchSize == 0) {

				totalArrayList.add(subLists);
				subLists = new ArrayList<>();

			}

		}

		if (subLists.size() > 0) {
			totalArrayList.add(subLists);
		}

		return totalArrayList;

	}

}
