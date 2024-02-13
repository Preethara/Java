package com.codetodevop.javaoopsconcept;
class CalculatorC {
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public int sub(int n1, int n2) {
		return n1 - n2;
	}
}

class AdvCalc extends CalculatorC // single inheritance
{
	public int multi(int n1, int n2) {
		return n1 * n2;
	}

	public int div(int n1, int n2) {
		return n1 / n2;
	}
}

class VeryAdvCalc extends AdvCalc // multi-level inheritance
{
	public double power(int n1, int n2) {
		return Math.pow(n1, n2);
	}
}

public class Inheritance {
	public static void main(String[] args) {
//		CalculatorC calc = new CalculatorC();
//		AdvCalc Calc = new AdvCalc();
		VeryAdvCalc calc = new VeryAdvCalc();
		double r1 = calc.power(9, 8);
		double r2 = calc.add(5, 8);
		System.out.println(r1 + "\n" + r2);
	}
}
