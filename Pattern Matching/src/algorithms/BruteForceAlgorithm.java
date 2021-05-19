package algorithms;

public class BruteForceAlgorithm implements AlgorithmsInf {

	@Override
	public boolean solve(String pattern, String text) {
		int m = pattern.length();
        int n = text.length();
 
        for (int i = 0; i <= n - m; i++) {
        	boolean match = true;
            /* For current index i, check for pattern match */
            for (int j = 0; j < m; j++)
                if (text.charAt(i + j) != pattern.charAt(j))
                    match = false;
            /* if there is no match, we continue incrementing i (Slide).  */
            if(match)
            	return true;
        }
        return false;
	}

}
