package edu.msg.ro.model;

public class Multiply implements Operation {

	@Override
	public double execute(double in1, double in2) {
		return in1 * in2;
	}
}
