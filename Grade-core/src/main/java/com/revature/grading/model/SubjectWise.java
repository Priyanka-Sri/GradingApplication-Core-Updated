package com.revature.grading.model;

public class SubjectWise {
	private int MARKS1;
	public int getMARKS1() {
		return MARKS1;
	}
	public void setMARKS1(int mARKS1) {
		MARKS1 = mARKS1;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public int getREGNO() {
		return REGNO;
	}
	public void setREGNO(int rEGNO) {
		REGNO = rEGNO;
	}
	public String getSUBID() {
		return SUBID;
	}
	public void setSUBID(String sUBID) {
		SUBID = sUBID;
	}
	public String getSUBNAME() {
		return SUBNAME;
	}
	public void setSUBNAME(String sUBNAME) {
		SUBNAME = sUBNAME;
	}
	private String Sname;
	private String Grade;
	private int REGNO;
	private String SUBID;
	private String SUBNAME;
	private String SUB;
	private int MARKS;
public int getMARKS() {
		return MARKS;
	}
	public void setMARKS(int mARKS) {
		MARKS = mARKS;
	}
public String getSUB() {
		return SUB;
	}
	public void setSUB(String sUB) {
		SUB = sUB;
	}
	@Override
	public String toString() {
		return "SubjectWise [MARKS1=" + MARKS1 + ", Sname=" + Sname + ", Grade=" + Grade + ", REGNO=" + REGNO
				+ ", SUBID=" + SUBID + ", SUBNAME=" + SUBNAME + ", SUB=" + SUB + ", MARKS=" + MARKS + "]";
	}
	}
