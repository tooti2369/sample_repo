package codebase;


public class Sol {

	/**
	 *This method is used to add all of the numbers that are multiples of 3 and 5 in the given number
	 *@param number The number to be process.
	 *@return int
	 */
	public static int solution(int number) {

      		int sum = 0;
     	 	for (int i = 1; i < number; i++) {
        			if (i % 3 == 0 || i % 5 == 0) {
            				sum += i;
          			}
      		} return sum;
}

	/**
	 *This method returns the score for any positive number n.
	 *@param n The number to be process.
	 *@return long
	 */

  public static long getScore(long n) {
    if (n > 1) {
      long temp = 50;
      for (long i = 2; i <= n; i++) {
        temp = (i * 50) + temp;
      }
      return temp;
    }
    return 50;
  }



	/**
	 *This method writes a function that takes an (unsigned) integer as input, 
	 *and returns the number of bits that are equal to one in the binary representation of that number.
	 *@param n The number to be process.
	 *@return int
	 */

	public static int countBits(int n){
		String bin = Integer.toBinaryString(n);
    int count = 0;
    for (int i = 0; i < bin.length(); i++) {
      if(bin.charAt(i)=='1'){
        count++;
      }
    }
    return count;
	}


	/**
	 *This method is used to find the int that appears an odd number of times.
	 *@param A Array to be process.
	 *@return int
	 */

	public static int findIt(int[] A){
		int o = 0;
		for(int i = 0; i< A.length; i++){
			o = o^A[i];
		}
		return o;
	}

	/**
	 *This method is used to build the decrypt string.
	 *@param text a string.
	 *@param n integer.
	 *@return String
	 */


 public static String encrypt(final String text, final int n) {
    if (text == null) {
        return null;
    }
    String encrypted = text;
    if (!encrypted.isEmpty() || n > 0) {
        for (int i = 0; i < n; i++) {
            String first = "";
            String second = "";
            for (int j = 0; j < encrypted.length(); j++) {
                if (j % 2 == 0) {
                    first = first + encrypted.charAt(j);
                } else {
                    second = second + encrypted.charAt(j);
                }
            }
            encrypted = second + first;
        }
    }

    return encrypted;
  }

	/**
	 *This method is used to build the encrypted string.
	 *@param encryptedText a string.
	 *@param n integer.
	 *@return String
	 */
	 
  public static String decrypt(final String encryptedText, final int n) {
    if (encryptedText == null) {
        return null;
    }
    String decrypted = encryptedText;
    if (!decrypted.isEmpty() || n > 0) {
        for (int i = 0; i < n; i++) {
            String first = decrypted.substring(0, decrypted.length()/2);
            String second = decrypted.substring(decrypted.length()/2);
            decrypted = "";
            for (int j = 0; j < second.length(); j++) {
                decrypted = decrypted + second.charAt(j);
                if (first.length() != j) {
                    decrypted = decrypted + first.charAt(j);
                }
            }
        }
    }
    return decrypted;
  }

	/**
	 *This method is used to cook for alien restaurant at a distant planet called Kahumo 
	 *@param food as number of served mouths must correspond to the number of mouths your client.
	 *@param flavour as multiply flavour for client ordered.
	 *@param mouths as the amount of mouths of your client.
	 *@return double[]
	 */

public static double[] serve(double food, double flavour, int mouths) {

    double[] servings_per_mouth = new double[mouths];  //array for serving per mouth

    double serves = 0;
    double str = 0;

    for (int i = 0; i < mouths; i++) {
        serves = (double)Math.pow(flavour,i);
        str = serves + str;
    }

    serves = food/str;  // get first item for array servings_per_mouth
    servings_per_mouth[0] = serves;  // push first item in the array

    for (int i = 0 ; i < mouths -1 ; i++) {
        double temp = flavour * servings_per_mouth[i];  // multiply flavour based on the array index
        servings_per_mouth[i+1]= temp;  // push value of temp
    }

    return servings_per_mouth;
}

	/**
	 *This method is used to accepts an array of 10 integers (between 0 and 9), that returns 
	 *a string of those numbers in the form of a phone number
	 *@param numbers Integer arrays to be process. 
	 *@return String
	 */

  public static String createPhoneNumber(int[] numbers) {
    return "(" + numbers[0] + numbers[1] + numbers[2] + ") " 
    	+ numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] 
    		+ numbers[7] + numbers[8] + numbers[9];
  }

}


