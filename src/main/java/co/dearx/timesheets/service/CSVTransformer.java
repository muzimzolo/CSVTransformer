package co.dearx.timesheets.service;

import java.util.List;

public interface CSVTransformer {
	
	List<String> readCSV(String csvFilePath);
	void transformCSV(List<String[]> rows);
    void writeCSV(List<String[]> rows, String csvFilePath);
}
