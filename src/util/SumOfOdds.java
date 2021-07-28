package util;

public class SumOfOdds {
	
	private int X;
	private int Y;
	private int sum;
	private int N;
	private int aux;
	
	public SumOfOdds() {
	}
	
	public SumOfOdds(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}
	
	public int getX() {
		return X;
	}
	
	public void setX(int X) {
		this.X = X;
	}
	
	public int getY() {
		return Y;
	}
	
	public void setY(int Y) {
		this.Y = Y;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum() { //metodo que reseta o atributo soma para ser reutilizado
		this.sum -= sum;
	}
	
	public int getN() {
		return N;
	}
	
	public void setN(int N) {
		this.N = N;
	}
	
	public int getAux() {
	   return aux;
	}
	
	public void setAux(int aux) {
		this.aux = aux;
	}
	
	public int sumOdd() { //metodo que faz a soma dos impares
		for (int j = X + 1; j < Y; j++) {
			if (j % 2 != 0) {
				sum += j;
			}
		}
		return sum;
	}
	
	public String toString() {
		return "Sum of odds is: " + sumOdd();
	}
}
