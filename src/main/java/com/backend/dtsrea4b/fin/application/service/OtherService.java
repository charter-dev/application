package com.backend.dtsrea4b.fin.application.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.backend.dtsrea4b.fin.application.model.OtherEntity;
import com.opencsv.CSVWriter;


@Service
public class OtherService {


	public static final String CSV_FILE_PATH = "/src/main/resources/other";
	
	public void addDataToCSV(OtherEntity otherEntity) throws Exception {

		
		// create a List which contains String array
		List<String[]> data = new ArrayList<String[]>();
			data.add(new String[] { LabelHelper.formatString(otherEntity.getId()),
					LabelHelper.formatString(otherEntity.getJudul()),
					LabelHelper.formatString(otherEntity.getContent()),
					LabelHelper.formatString(otherEntity.getUrlgambar()),
					LabelHelper.formatString(otherEntity.getCreatedby()),
					LabelHelper.formatString(new Date())
					});
		CSVWriter csvWriter = createfile(CSV_FILE_PATH, "Testing.csv", true);

		csvWriter.writeAll(data);

		// closing writer connection
		csvWriter.close();

	}
	
	public void addDataToCSV(OtherEntity otherEntity) throws Exception {

		
		// create a List which contains String array
		List<String[]> data = new ArrayList<String[]>();
			data.add(new String[] { LabelHelper.formatString(otherEntity.getId()),
					LabelHelper.formatString(otherEntity.getJudul()),
					LabelHelper.formatString(otherEntity.getContent()),
					LabelHelper.formatString(otherEntity.getUrlgambar()),
					LabelHelper.formatString(otherEntity.getCreatedby()),
					LabelHelper.formatString(new Date())
					});
		CSVWriter csvWriter = createfile(CSV_FILE_PATH, "Testing.csv", true);

		csvWriter.writeAll(data);

		// closing writer connection
		csvWriter.close();

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
