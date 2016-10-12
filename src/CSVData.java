/***
 * a class to read/write numerical CSV files and allow easy access to data
 * 
 * @author Erin
 *
 */
public class CSVData {
	private double [][] data;
	private String[] columnNames;
	
	public static CSVData readCSVFile (String fileName, int numLinesToIgnore, String[] columnNames){
		return null;
	}
	
	/***
	 * Returns a new CSV Data object for a file ignoring lines at the top.
	 * It uses the first row as the column names. All other data is stored as doubles.
	 * @param fileName
	 * @param numLinesToIgnore number of lines that the top to ignore.
	 * @return a CSVData object for that file.
	 */
	public static CSVData readCSVFile (String fileName, int numLinesToIgnore){
		return null;
	}

}
