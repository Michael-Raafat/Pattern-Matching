package algorithms;

public class KMPAlgorithm implements AlgorithmsInf {

	@Override
	public boolean solve(String pattern, String text) {
		int m = pattern.length();
        int n = text.length();
  
        // create f[] that will hold the longest prefix values for pattern
        int f[] = nextFunction(pattern);
        
        // index for pattern
        int j = 0; 
        // index for text
        int i = 0; 
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                if( j == m - 1) {
                	return true;
                } else {
                	j++;
                    i++;
                } 
            } else if (j > 0) {
            	j = f[j - 1];
            } else {
                i++;
            }
        }
		return false;
	}
	
	private int[] nextFunction(String pattern) {
		int m = pattern.length();
        int f[] = new int[m];
        // length of the previous longest prefix suffix
        int j = 0;
        int i = 1;
  
        // the loop calculates f[i] for i = 1 to m-1
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                f[i] = j + 1;
                i++;
                j++;
            } else if (j != 0) {
                j = f[j - 1];
            } else {
            	f[i] = j;
            	i++;
            }
        }
        return f;
    }
	
}
