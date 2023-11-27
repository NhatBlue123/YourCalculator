package model;

public class MiniCalculatorModel {
	private double firtsValue;
	private double secondValue;
	private double answer;
	public MiniCalculatorModel() {
		this.firtsValue = 0;
		this.secondValue = 0;
		this.answer = 0;
	}
	public double getFirtsValue() {
		return firtsValue;
	}
	public void setFirtsValue(double firtsValue) {
		this.firtsValue = firtsValue;
	}
	public double getSecondValue() {
		return secondValue;
	}
	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}
	public double getAnswer() {
		return answer;
	}
	public void setAnswer(double answer) {
		this.answer = answer;
	}
	public double flus(double s1,double s2)
	{
		this.firtsValue = s1;
		this.secondValue = s2;
		this.answer = s1+s2;
		return this.answer ;
	}
	public double minus(double s1,double s2)
	{

		this.firtsValue = s1;
		this.secondValue = s2;
		this.answer = s1-s2;
		return this.answer ;
	}
	public double multiplication(double s1,double s2)
	{

		this.firtsValue = s1;
		this.secondValue = s2;
		this.answer = s1*s2;
		return this.answer ;
	}
	public double division(double s1,double s2)
	{

		this.firtsValue = s1;
		this.secondValue = s2;
		this.answer = s1/s2;
		return this.answer ;
	}
	public double pow(double s1,double s2)
	{

		this.firtsValue = s1;
		this.secondValue = s2;
		this.answer = Math.pow(s1, s2);
		return this.answer;
	}
	public double mod(double s1,double s2)
	{

		this.firtsValue = s1;
		this.secondValue = s2;
		this.answer = s1%s2;
		return this.answer ;
	}
}
