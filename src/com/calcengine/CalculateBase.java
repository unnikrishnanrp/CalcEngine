package com.calcengine;

public abstract class CalculateBase {
	private double leftVal ;
	private double rightVal ;
	private double results ;
	
	public double getLeftVal() {
		return leftVal;
	}
	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}
	public double getRightVal() {
		return rightVal;
	}
	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}
	public double getResults() {
		return results;
	}
	public void setResults(double results) {
		this.results = results;
	}
	
	public CalculateBase(){}
	public CalculateBase(double leftVal, double rightVal){
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	public abstract void calculate();	

}
