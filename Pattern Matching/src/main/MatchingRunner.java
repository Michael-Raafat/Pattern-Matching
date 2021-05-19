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
		
		// #1 test case.
		System.out.println("Test case #1:");
		String text = "This is a test text";
		String pattern = "test";
		System.out.println("Knuth-Morris-Pratt algorithm answer is " + kmp.solve(pattern, text));
		System.out.println("Rabin-Karp algorithm answer is " + rk.solve(pattern, text));
		System.out.println("Brute Force algorithm answer is " + bf.solve(pattern, text));
		
		// #2 test case.
		System.out.println("Test case #2:");
		text = "AAAAAAAAAAAAAAAAAB";
		pattern = "AAAAB";
		System.out.println("Knuth-Morris-Pratt algorithm answer is " + kmp.solve(pattern, text));
		System.out.println("Rabin-Karp algorithm answer is " + rk.solve(pattern, text));
		System.out.println("Brute Force algorithm answer is " + bf.solve(pattern, text));
		
		// #3 test case.
		System.out.println("Test case #3:");
		text = "AAAAAAAAAAAAAAAAAB";
		pattern = "AAAACB";
		System.out.println("Knuth-Morris-Pratt algorithm answer is " + kmp.solve(pattern, text));
		System.out.println("Rabin-Karp algorithm answer is " + rk.solve(pattern, text));
		System.out.println("Brute Force algorithm answer is " + bf.solve(pattern, text));
		
		
	}

}
