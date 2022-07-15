public class PromineoTechWeek3 {

	//Variables used in methods to showcase usage
	
	//Step 1 variables
	int numbers[] = {3, 9, 23, 64, 2, 8, 28, 93};
	//Used in step 1.a
	int dynamicNumbers[] = {3, 9, 23, 64, 2, 8, 28, 93, 18};
	
	//Step 2 variables
	String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	//Step 5 variables
	int nameLengths[];

	/**Step 1
	 * This method will return the difference of first and last number in array
	 * 
	 * @return - an int number for the difference
	 */
	public int subFirstLast() {
		if(numbers.length > 0) {
			return numbers[numbers.length-1]-numbers[0];
		}else {
			return 0;
		}
		
	}

	
	
	/**Step 1, ensuring it is dynamic, calculates from an array of a different size
	 * This method will return the difference of first and last number in array
	 * 
	 * @return - an int number for the difference
	 */
	public int subFirstLastDynamic() {
		if(dynamicNumbers.length > 0) {
			return dynamicNumbers[dynamicNumbers.length-1]-dynamicNumbers[0];
		}else {
			return 0;
		}
		
	}
	
	
	/**Step 1.c, use a loop to find the average age.
	 * This method will iterate through an array to find the average of an array
	 * 
	 * @return - a float for the average age of the array
	 */
	public float arrayAverage() {
		float sum = 0;
		//Check for no numbers case
		if(numbers.length > 0) {
			for(int i : numbers) {
				sum += i;
			}
			return sum/numbers.length;
		}else {
			return 0;
		}
	}
	

	/**Step 2.a
	 * Use a loop to iterate and count characters of elements in the array
	 * 
	 * @return - a float number for the average amount of characters
	 */
	public float avgNameLength() {
		float sumChars = 0;
		for(String s : names) {
			sumChars += s.length();
		}
		return sumChars/names.length;
	}
	

	/**Step 2.b
	 * This method with iterate through an array of strings and return it concatenated
	 * 
	 * @return myStr - a pre-formatted string for the concatenated names
	 */
	public String printConcatNames() {
		String myStr = "";
		for(String s : names) {
			myStr += s;
			myStr += " ";
		}
		return myStr;
	}
	

	/**Step 5 
	 * modifies the value of the int array, 'nameLengths'. 
	 */
	public void nameLengthArray() {
		int tempArray[] = new int[names.length];
		for(int i = 0; i < names.length ; i++) {
			tempArray[i] = names[i].length();
		}
		nameLengths = tempArray;
	}
	

	/**Method used for printing an int array
	 * 
	 * @param myArray - an integer array to print
	 */
	public void printArray(int[] myArray) {
		String formatPrintArray = "[";
		for(int i = 0; i < myArray.length-1; i++) {
			formatPrintArray += myArray[i];
			formatPrintArray += ", ";
		}
		formatPrintArray += myArray[myArray.length-1] + "]";
		System.out.println(formatPrintArray);
	}
	

	/**Step 6
	 * This method iterates over an int array and prints the sum value
	 * @param myArray - an integer array
	 * @return sum - the sum of values in myArray
	 */
	public int countArraySum(int[] myArray) {
		int sum = 0;
		for(int i: myArray) {
			sum += i;
		}
		return sum;
	}
	

	/**Step 7
	 * This method takes two parameters for a string and an int, and repeats the string int many times
	 * 
	 * @param word - A string to repeat
	 * @param n - number of times to repeat
	 * @return outputString - the resulting repeated string
	 */
	public String wordCopier(String word, int n) {
		String outputString = "";
		for(int i = 0; i<n; i++) {
			outputString += word;
		}
		return outputString;
	}
	
	/**Step 8
	 * This method takes two string parameters and returns a concatenated String
	 * 
	 * @param firstName - a string parameter for the first name
	 * @param lastName	- a string paramater for the last name
	 * @return - a String combination of the first and last name
	 */
	public String nameConcat(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	
	/**Step 9
	 * This method takes myNum, an int array as a parameter and checks the sum of elements to be greater than 100
	 * 
	 * @param myNum - an integer array for be summed then compared
	 * @return - a boolean value true if the value is greater than 100, otherwise false
	 */
	public boolean greaterThanHundred(int[] myNum) {
		int sum = 0;
		for(int i : myNum) {
			sum += i;
		}
		if(sum > 100) {
			return true;
		}else {
			return false;
		}
	}
	
	/**Step 10
	 * This method takes doubleArray, a double array as a parameter and returns the average value of its elements
	 * 
	 * @param doubleArray - the array to find the average of
	 * @return - the average value of doubleArray elements
	 */
	public double doublesAvg(double doubleArray[]) {
		double doubleAverage = 0;
		for(double d : doubleArray) {
			doubleAverage += d;
		}
		//Divide by zero prevention
		if(doubleArray.length > 0) {
			return doubleAverage/doubleArray.length;
		}else {
			return 0;
		}
		
	}
	
	
	/**Step 11
	 * This method takes two double arrays and returns true if the average of the first array is greater than the second
	 *
	 * 
	 * @param firstArray - the first array in the comparison. returns true if larger second
	 * @param secondArray - the second array in the comparison. returns false if larger than first
	 * @return -  a boolean true if the average of the first array is greater than the second, otherwise returns false
	 */
	public boolean doubleArrayCompare(double firstArray[], double secondArray[]) {
		if(this.doublesAvg(firstArray) > this.doublesAvg(secondArray)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	/**Step 12
	 * This method takes two parameters isHotOutside and moneyInPocket and 
	 * 
	 * @param isHotOutside - a boolean value of true if it is hot outside, false if not
	 * @param moneyInPocket - a double value of money in pocket
	 * @return - a boolean true if isHotOutside is true, and moneyInPocket is greater than 10.50, else false
	 */
	public boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(moneyInPocket > 10.50 && isHotOutside) {
			return true;
		}else {
			return false;
		}
	}
	
	/**Step 13
	 * A method to convert fahrenheit units into celcius units
	 * takes in a fahrenheit temperature and returns its celcius conversion
	 * 
	 * @param temperature - the double value of fahrenheit temperature
	 * @return - the double value of its temperature in celcius
	 */
	public double fahrenheitConvert(double temperature) {
		return (temperature - 32) * 5 / 9;
	}
	
	public static void main(String[] args) {
		PromineoTechWeek3 myObj = new PromineoTechWeek3();
		//Step 1
		System.out.println(myObj.subFirstLast());
		
		//Step 1.b
		System.out.println(myObj.subFirstLastDynamic());
		
		//Step 1.c
		System.out.println(myObj.arrayAverage());
		
		//Step 2.a
		System.out.println(myObj.avgNameLength());
		
		//Step 2.b
		System.out.println(myObj.printConcatNames());
		
		//Step 5
		myObj.nameLengthArray();
		//Prints step 5
		myObj.printArray(myObj.nameLengths);
		
		//Step 6
		System.out.println(myObj.countArraySum(myObj.nameLengths));
		
		//Step 7
		System.out.println(myObj.wordCopier("Hello", 3));
		
		//Step 9
		System.out.println(myObj.nameConcat("John", "Smith"));
		
		//Step 9
		System.out.println(myObj.greaterThanHundred(myObj.nameLengths));
		
		//Step 10
		double stepTenArray[] = {1.2, 2.3, 3.4, 100.34};
		System.out.println(myObj.doublesAvg(stepTenArray));
		
		//Step 11
		double stepElevenArray[] = {23.5, 234.1, 123.3};
		System.out.println(myObj.doubleArrayCompare(stepElevenArray, stepTenArray));
		System.out.println(myObj.doubleArrayCompare(stepTenArray, stepElevenArray));		
		
		//Step 12
		boolean hotDay = true;
		double pocketChange = 20;
		System.out.println(myObj.willBuyDrink(hotDay, pocketChange));
		
		//Step 13
		double fahrenheitTemp = 350;
		System.out.println(myObj.fahrenheitConvert(fahrenheitTemp));
		
	}
	
	

}
