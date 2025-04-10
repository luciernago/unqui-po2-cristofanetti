package ar.edu.unq.po2.tp3;

public class Multiplos {
	
	private int num1;
	private int num2;
	
	public Multiplos(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int multiploMayorDe() {
		int num = 1000;
		while (!esMultiplo(num,num1) || !esMultiplo(num, num2)) {
			num--;
		}
		return num;
	}
	
	private boolean esMultiplo(int x, int y) {
		return x % y == 0;
	}
	
	
}
