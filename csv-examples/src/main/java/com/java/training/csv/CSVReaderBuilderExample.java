package com.java.training.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.ICSVParser;
import com.opencsv.exceptions.CsvValidationException;

public class CSVReaderBuilderExample {

	public static void main(String[] args) {

		File file = new File("oscar_age_female.csv");
		CSVReader csvReader = null;

		try {
			FileReader fileReader = new FileReader(file);

			// CSV ParserBuilder is used to customize the separator like ";", "|"
			// CSVParserBuilder csvParserBuilder = new CSVParserBuilder();
			// csvParserBuilder.withSeparator(';');
			// ICSVParser icsvParser = csvParserBuilder.build();

			CSVReaderBuilder builder = new CSVReaderBuilder(fileReader);

			// skips number of lines before reading the CSV file
			builder.withSkipLines(89);
			// builder.withCSVParser(icsvParser);
			csvReader = builder.build();

			// csvReader = new CSVReader(fileReader);

			String[] nextRecord;

			while ((nextRecord = csvReader.readNext()) != null) {

				for (String record : nextRecord) {
					System.out.print(record);

				}

				System.out.println();

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvValidationException e) {
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
