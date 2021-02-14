package com.kmd.program;

import java.util.ArrayList;

public class StringFilter {

	public static void main(String[] args) {
		String[] str = { "22kmd1", "101", "k", "Giridhar", "25015", "m", "Z", "Ketan", "5", "3515" };
		StringFilterTest sft = new StringFilterTest();
		sft.filterdList(str);
		System.out.println("Char List: " + sft.getCharList());
		System.out.println("Integer List: " + sft.getIntList());
		System.out.println("String List: " + sft.getStrList());
	}

}

class StringFilterTest {

	private ArrayList<String> charList = new ArrayList<>();
	private ArrayList<String> intList = new ArrayList<>();
	private ArrayList<String> strList = new ArrayList<>();

	public ArrayList<String> getCharList() {
		return charList;
	}

	public void setCharList(ArrayList<String> charList) {
		this.charList = charList;
	}

	public ArrayList<String> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<String> intList) {
		this.intList = intList;
	}

	public ArrayList<String> getStrList() {
		return strList;
	}

	public void setStrList(ArrayList<String> strList) {
		this.strList = strList;
	}

	public void filterdList(String[] str) {
		for (String s : str) {
			if (s.length() == 1 && (int) s.charAt(0) >= 65 && (int) s.charAt(0) <= 123) {
				charList.add(s);
			} else {
				int count = 0, len = s.length();
				for (int i = 0; i < len; i++) {
					if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 123) {
						count++;
					}
				}
				if (count == 0) {
					intList.add(s);
				} else {
					strList.add(s);
				}
			}
		}
	}
}
