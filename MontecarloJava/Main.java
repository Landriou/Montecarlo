import Montecarlo.Montecarlo;


class Main {
  public static void main(String[] args) {
		Montecarlo monteCarlo = new Montecarlo();
		double pi = 0;
		pi = monteCarlo.countPI(100000);
		System.out.println("Monte Carlo calcula el valor de pi:" + pi);
  }
}