package com.plus.ramses;

public class ISBNFragment {
	
	private static final int _11 = 11;
	private String fragment;

	public ISBNFragment(String fragment) {
		this.fragment = fragment;
	}
	
	public String get10ISBN(){
		return fragment + generateChecksum();	
	}
	
	private String generateChecksum() {

		char[] digits = fragment.toCharArray();

		int i = 10;
		int sum = 0;
		for (char frag : digits) {
			int num = Character.getNumericValue(frag);
			sum += num * i;
			i--;
		}
		int rem = sum % _11;
		int checksum = (_11 - rem) % _11;
		return (checksum == 10 ? "X" : Integer.toString(checksum));

	}

}
