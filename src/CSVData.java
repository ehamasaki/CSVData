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
	
	/***
	 * Get row index
	 * @param rowIndex
	 * @return row index
	 */
	public double[] getRow(int rowIndex) {
		return null;
	}
	
	/***
	 * Get column name
	 * @param ColumnName
	 * @return column name
	 */
	public double[] getColumn (String ColumnName){
		return null;
	}
	
	/***
	 * get multiple rows out of the array
	 * @param startingRowIndex
	 * @param endingRowIndex
	 * @return Values within multiple rows
	 */
	public double[][] getMultipleRows ( int startingRowIndex, int endingRowIndex){
		return null;
	}
	
//	public double [][] getRows (int[] rowIndexes ){
//		return null;
//	}
	
	/***
	 * get multiple columns
	 * @param startingColumnIndex
	 * @param endingRowIndex
	 * @return return values within multiple columns
	 */
	public double [][] getMultipleColumns (int startingColumnIndex, int endingRowIndex){
		return null;
	}
	
//	public double [][] getColumns (int[] rowIndexes ){
//	return null;
//}
	
//	public double [][] getColumns (String[] colNames ){
//	return null;
//}
	
	/*** 
	 * Sets new values within specific values within the array
	 * @param rowIndex
	 * @param columnIndex
	 * @param newValue
	 */
	public void setNewValue (int rowIndex, int columnIndex, double newValue) {
		
	}
	 /***
	  * Sets new values within a specific Row
	  * @param rowIndex
	  * @param newValue
	  */
	public void setNewRowValues(int rowIndex, double[] newValues){
		
	}
	
	/***
	 * Sets new values within a specific column
	 * @param columnName
	 * @param newValue
	 */
	public void setNewColumnValues (String columnName, double[] newValues){

	}
	
	/***
	 * gets the names of the Columns
	 * @param ColumnNames
	 * @return the names of the columns
	 */ 
	public String[] getColumnNames (){
		return null;
	}
	
	/***
	 * Saves the current state of the object back into a CSV file
	 * @param FileName
	 */
	public void saveToFile (String FileName){
		
	}
	
	
	
	

}
