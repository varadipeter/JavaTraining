package edu.msg.ro.business;

import java.util.function.BinaryOperator;

import edu.msg.ro.model.Operation;

public class Calculator {

	public static void main(String[] args) {

		BinaryOperator<Double> binaryOperation=(x1,x2)-> x1+x2;
		
		Operation add = (x1, x2) -> x1 + x2;
		Operation multiply = (x1, x2) -> x1 * x2;

		Operation addAndMultiply = (x1, x2) -> {
			if (x1 == 0) {
				return 2 * x2;
			}

			return x1 + x2 + x1 * x2;
		};

		//print(1.0, 2.0, add);
		//print(1.0, 2.0, multiply);
		//print(0, 2.0, addAndMultiply);
		print(0, 2.0, binaryOperation);

	}

	/*public static void print(double in1, double in2, Operation op) {
		System.out.println(op.execute(in1, in2));

	}
	*/
	
	public static void print(double in1, double in2, BinaryOperator binaryOperation) {
		System.out.println(binaryOperation.apply(in1, in2));

	}


}
