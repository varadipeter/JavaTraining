package edu.msg.ro.model;

@FunctionalInterface
public interface Operation {

	double execute(double in1, double in2);

	//double apply(double in1, double in2);
}
