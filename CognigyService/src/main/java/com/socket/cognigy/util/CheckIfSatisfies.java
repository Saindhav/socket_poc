package com.socket.cognigy.util;

public class CheckIfSatisfies {

	public static void main(String[] args) {
		System.out.println(checkIfSatisfiesCondition(32, 14));
		System.out.println(checkIfSatisfiesCondition(48, 14));
		System.out.println(checkIfSatisfiesCondition(64, 14));
		System.out.println(checkIfSatisfiesCondition(75, 14));
		System.out.println(checkIfSatisfiesCondition(51, 14));
		System.out.println(checkIfSatisfiesCondition(38, 17));

	}
	
	static boolean checkIfSatisfiesCondition(int inputToBeChecked, int conditionToBeChecked) {
		if(checkIFAdditionConditionSatisfies(inputToBeChecked, conditionToBeChecked)
				&& checkIFSubstractionConditionSatisfies(inputToBeChecked, conditionToBeChecked)) {
			return true;
		}else {
			return false;
		}
	}
	
	static boolean checkIFAdditionConditionSatisfies(int inputToBeChecked, int conditionToBeChecked) {
		
		for (int i = 0; i <= inputToBeChecked; i++) {
			if(checkIfPrime(i)) {
				if(inputToBeChecked % (i+conditionToBeChecked) == 0) {
					int divisor = inputToBeChecked/(i+conditionToBeChecked);
					if(checkIfPrime(divisor) && divisor == i) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	static boolean checkIFSubstractionConditionSatisfies(int inputToBeChecked, int conditionToBeChecked) {
		
		for (int i = 0; i <= inputToBeChecked; i++) {
			if(checkIfPrime(i)) {
				if(i != conditionToBeChecked && inputToBeChecked % (i-conditionToBeChecked) == 0) {
					int divisor = inputToBeChecked/(i-conditionToBeChecked);
					if(checkIfPrime(divisor) && divisor == i) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
	
	static boolean checkIfPrime(int n) {
		if(n <= 1)
			return false;
		
		for(int i=2; i < n; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}

}
