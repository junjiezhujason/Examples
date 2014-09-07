package com.mzlabs.count;


/**
 * count A x = b x integral >= 0
 * @author johnmount
 *
 */
public class CountingProblem {
	public final int[][] A;
	
	public CountingProblem(final int[][] A) {
		this.A = A;
	}
	
	public IntVec normalForm(final IntVec b) {
		return b;
	}
	
	/**
	 * 
	 * @param curVarSet set of current variables
	 * @return two arrays which partition the integers 0...curVarSet.length (i representing curVarSet[i]) in an efficient manner, neither set empty, can return null to avoid choosing
	 */
	public int[][] splitVarsByRef(final int[] curVarSet) {
		return null;
	}
}