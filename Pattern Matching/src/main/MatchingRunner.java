package main;

import algorithms.AlgorithmsInf;
import algorithms.BruteForceAlgorithm;
import algorithms.KMPAlgorithm;
import algorithms.RabinKarpAlgorithm;

public class MatchingRunner {

	public static void main(String[] args) {
		AlgorithmsInf kmp = new KMPAlgorithm();
		AlgorithmsInf bf = new BruteForceAlgorithm();
		AlgorithmsInf rk = new RabinKarpAlgorithm();
		long start,end,execution;
		String[] texts = {"This is a test text", "BESTINAAABAAAABTHEWORLD", "AAAAAAAAAAAAAAAAAB"};
		String[] patterns = {"test", "AAAAB", "AAAACB"};
		// #1 test case.
		for(int i = 0; i < 3; i++) {
			System.out.println("Test case #"+ (i+1) + ":");
			// get the start time
	    	start = System.nanoTime();
			System.out.println("Knuth-Morris-Pratt algorithm answer is " + kmp.solve(patterns[i], texts[i]));
			// get the end time
	    	end = System.nanoTime();
        	// execution time
	    	execution = end - start;
	    	System.out.println("Execution time of KMP algorithm: " + execution + " nanoseconds");
	    	start = System.nanoTime();
			System.out.println("Rabin-Karp algorithm answer is " + rk.solve(patterns[i], texts[i]));
			end = System.nanoTime();
			execution = end - start;
	    	System.out.println("Execution time of Rabin-Karp algorithm: " + execution + " nanoseconds");
	    	start = System.nanoTime();
			System.out.println("Brute Force algorithm answer is " + bf.solve(patterns[i], texts[i]));
			end = System.nanoTime();
			execution = end - start;
	    	System.out.println("Execution time of Brute force algorithm: " + execution + " nanoseconds");
	    	System.out.print("\n\n");
		}
		
	}

}
