package com.group8.services.QuestionPaperGen.Entity;

import lombok.Data;

@Data
public class Domain{
	private int math;
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChem() {
		return chem;
	}
	public void setChem(int chem) {
		this.chem = chem;
	}
	private int phy;
	private int chem;
}