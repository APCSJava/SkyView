
public class SkyView {

	/** A rectangular array that holds the data representing
	 * a rectangular area of the sky.
	 */
	private double[][] view;
	
	/** Constructs a SkyView object from a 1-dimensional array of scan data.
	 * 
	 * @param numRows the number of rows represented in the view
	 * 		Precondition: numRows > 0
	 * @param numCols the number of columns represented in the view
	 * 		Precondition: numCols > 0
	 * @param scanned scan data received from the telescope, in telescope order
	 * 		Precondition: scanned.length == numRows * numCols
	 * Postcondition: views has been created as a rectangular two dimensional
	 * 		array with numRows rows and numCols columns and the values in
	 * 		scanned have been copied to view and ordered as in the original sky
	 */
	public SkyView(int numRows, int numCols, double[] scanned) {
		//TODO initialize "view" using the parameters such that it passes the test
	}
	
	/** Returns the average of the values in a rectangular section of view
	 * 
	 * @param startRow first row index of the section
	 * @param endRow last row index of the section
	 * @param startCol first column index of the section
	 * @param endCol last column index of the section
	 * Precondition: 0<=startRow<=endRow< view.length
	 * Precondition: 0<=startCol<=endCol< view[0].length
	 * @return the average of the values in the specified section of view
	 */
	public double getAverage(int startRow, int endRow, int startCol, int endCol){
		// TODO return a double that passes the test
		return 0.0;
	}

	public double[][] getView() {
		return view;
	}

	public void setView(double[][] view) {
		this.view = view;
	}
}
