package edu.msg.ro.test;

public class Test implements I1, I2 {

	public static void main(String[] args) {
		Test test1 = new Test();
		test1.calculate();

	}

	@Override
	public void calculate() {
		I1.super.calculate();
	}
}
