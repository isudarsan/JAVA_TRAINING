package com.java.training.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSVBeanMapping {

	public static void main(String[] args) {
		File file = new File("oscar_age_female.csv");
		CSVReader csvReader = null;

		try {
			FileReader fileReader = new FileReader(file);

			csvReader = new CSVReader(fileReader);

			// Inorder to convert the CSV line to a bean we need to use BeanMapping
			
			CsvToBeanBuilder<Oscar> beanBuilder = new CsvToBeanBuilder<Oscar>(csvReader);
			beanBuilder.withSkipLines(1);
			beanBuilder.withType(Oscar.class);

			CsvToBean<Oscar> bean = beanBuilder.build();

			List<Oscar> list = bean.parse();

			for (Oscar oscar : list) {
				System.out.println(oscar);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} finally {
			if (null != csvReader) {
				try {
					csvReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
