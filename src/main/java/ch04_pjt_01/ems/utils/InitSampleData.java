package ch04_pjt_01.ems.utils;

public class InitSampleData {
	private String[] sNums = {"hbs001", "hbs002", "hbs003", "hbs004", "hbs005"};
	private String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "tiger"};
	private String[] sPws = {"11111", "11111", "11111", "11111", "11111"};
	private String[] sNames = {"토끼", "하마", "너굴", "코끼리", "호랭이"};
	private int[] sAges = {19, 20, 21, 18, 15};
	private char[] sGenders = {'M', 'F', 'F', 'M', 'M'};
	private String[] sMajors = {"Math", "History", "English", "Philosophy", "Science"};
	public String[] getsNums() {
		return sNums;
	}
	public void setsNums(String[] sNums) {
		this.sNums = sNums;
	}
	public String[] getsIds() {
		return sIds;
	}
	public void setsIds(String[] sIds) {
		this.sIds = sIds;
	}
	public String[] getsPws() {
		return sPws;
	}
	public void setsPws(String[] sPws) {
		this.sPws = sPws;
	}
	public String[] getsNames() {
		return sNames;
	}
	public void setsNames(String[] sNames) {
		this.sNames = sNames;
	}
	public int[] getsAges() {
		return sAges;
	}
	public void setsAges(int[] sAges) {
		this.sAges = sAges;
	}
	public char[] getsGenders() {
		return sGenders;
	}
	public void setsGenders(char[] sGenders) {
		this.sGenders = sGenders;
	}
	public String[] getsMajors() {
		return sMajors;
	}
	public void setsMajors(String[] sMajors) {
		this.sMajors = sMajors;
	}
	
	
}
