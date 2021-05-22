package algorithms;

public class RabinKarpAlgorithm implements AlgorithmsInf {

	// prime number.
	private static int q = 97;
	// numbers of characters in the input alphabet.
	private static int d = 256;
	@Override
	public boolean solve(String pattern, String text) {
		int m = pattern.length();
        int n = text.length();
        int i, j;
        // hash value for pattern.
        int p = 0;
        // hash value for text.
        int t = 0; 
        int h = 1;
      
        // The value of h would be d^m-1 
        for (i = 0; i < m-1; i++)
            h = ( h * d ) % q;
      
        // calculating hash values for pattern and text.
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i) ) % q;
            t = (d * t + text.charAt(i) ) % q;
        }
      
        // Slide the pattern one by one
        for (i = 0; i <= n - m; i++) {
      
            // Checking the hash values of text and pattern. 
            
            if ( p == t ) {
            	boolean match = true;
            	for (j = 0; j < m; j++){
                    if (text.charAt(i+j) != pattern.charAt(j))
                        match = false;
                }
                
                if(match)
                	return true;
            }
      
            // Calculating hash value for next window of text.
            if ( i < n - m ) {
                t = ( d * ( t - text.charAt(i) * h ) + text.charAt(i + m) ) % q;
      
                // if we get negative t, make it positive.
                if (t < 0)
                	t = (t + q);
            }
        }
		return false;
	}

}
