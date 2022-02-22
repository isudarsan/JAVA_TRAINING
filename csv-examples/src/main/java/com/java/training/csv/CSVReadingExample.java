package com.java.training.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

/**
 * Hello world!
 *
 */
public class CSVReadingExample {
	public static void main(String[] args) {

		File file = new File("oscar_age_female.csv");
		CSVReader csvReader = null;

		try {
			FileReader fileReader = new FileReader(file);

			
			csvReader = new CSVReader(fileReader);

//			String[] nextRecord;
//
//			while ((nextRecord = csvReader.readNext()) != null) {
//
//				for (String record : nextRecord) {
//					System.out.print(record);
//				}
//				
//				System.out.println();
//
//			}
			
			
			// To read all the file content at once
			List<String[]> data = csvReader.readAll();
			
			for(String[] array : data) {
				for(String ele : array) {
					System.out.print(ele+"\t");
				}
				
				System.out.println();
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvValidationException e) {
			e.printStackTrace();
		} catch (CsvException e) {
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
