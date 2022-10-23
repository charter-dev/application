package com.backend.dtsrea4b.fin.application.service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.backend.dtsrea4b.fin.application.model.UserEntity;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

@Service
public class UserService {

	
public static final String CSV_FILE_PATH = "/src/main/resources/user";
	
	public void addDataToCSV(UserEntity userEntity) throws Exception {

		
		// create a List which contains String array
		List<String[]> data = new ArrayList<String[]>();
			data.add(new String[] { LabelHelper.formatString(userEntity.getId()),
					LabelHelper.formatString(userEntity.getUsername()),
					LabelHelper.formatString(userEntity.getPassword()),
					LabelHelper.formatString(userEntity.getCreatedby()),
					LabelHelper.formatString(new Date())
					});
		CSVWriter csvWriter = createfile(CSV_FILE_PATH, "Testing.csv", true);

		csvWriter.writeAll(data);

		// closing writer connection
		csvWriter.close();

	}
	
	public List<UserEntity> readDataFromCSV() throws Exception {

		List<UserEntity> list = new ArrayList<UserEntity>();

		/*
		 * List<List<String>> records = new ArrayList<List<String>>(); try (CSVReader
		 * csvReader = new CSVReader(new
		 * FileReader("/src/main/resources/otherTesting.csv"));) { String[] values =
		 * null; while ((values = csvReader.readNext()) != null) {
		 * System.err.println(values); records.add(Arrays.asList(values));
		 * System.err.println(records); } }
		 */

		try {
			// Create an object of file reader class with CSV file as a parameter.
			FileReader filereader = new FileReader(CSV_FILE_PATH+"Testing.csv");

			// create csvParser object with
			// custom separator semi-colon
			CSVParser parser = new CSVParserBuilder().withSeparator(',').build();

			// create csvReader object with parameter
			// filereader and parser
			CSVReader csvReader = new CSVReaderBuilder(filereader).withCSVParser(parser).build();

			// Read all data at once
			List<String[]> allData = csvReader.readAll();

			// Print Data.
			for (String[] row : allData) {

				list.add(new UserEntity(row[0], row[1], row[2], row[3]));

			}

			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public static CSVWriter createfile(String folder, String name, Boolean isCreate) {

		// first create file object for file placed at location
		// specified by filepath
		cekFolder(folder);
		File file = new File(folder + name);
		Scanner sc = new Scanner(System.in);
		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file, isCreate);
			// create CSVWriter with ',' as separator
			CSVWriter writer = new CSVWriter(outputfile, ',', CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);

			return writer;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void cekFolder(String filePath) {
		try {
			File dirPath = new File(filePath);
			dirPath.mkdirs();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Folder already exist");
		}
	}
	
}

