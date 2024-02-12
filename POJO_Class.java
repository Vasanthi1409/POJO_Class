package pojo.com;

public class POJO_Class {
	private int a=20, b=30, c=40, d=50;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public static void main(String[] args) {
		
		POJO_Class pc = new POJO_Class();
		pc.setA(200);
		pc.setB(300);
		pc.setC(400);
		pc.setD(500);
		System.out.println(pc.getA());
		System.out.println(pc.getB());
		System.out.println(pc.getC());
		System.out.println(pc.getD());
	}

}
