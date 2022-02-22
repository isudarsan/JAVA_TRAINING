package com.java.training.csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVWritingExample {

	public static void main(String[] args) {

		List<String[]> employeeData = new ArrayList<String[]>();

		employeeData.add(new String[] { "111", "AAA", "500", "12", "INDIA" });
		employeeData.add(new String[] { "222", "BBB", "4500", "13", "US" });
		employeeData.add(new String[] { "333", "CCC", "14500", "14", "UK" });

		File file = new File("emp1.csv");
		CSVWriter csvWriter = null;

		try {
			FileWriter fileWriter = new FileWriter(file);

			csvWriter = new CSVWriter(fileWriter, '|', csvWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER,
					CSVWriter.DEFAULT_LINE_END);

			csvWriter.writeAll(employeeData);
			

			System.out.println("File Written");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != csvWriter) {
				try {
					csvWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
