package Montecarlo;


import java.math.*;
public class Montecarlo {
 
	public double countPI(double n) {
		int i = 0;
		int count = 0;
		double pi = 0;
		double x = 0;
		double y = 0;
		while(i < n) {
			x = Math.random();
			y = Math.random();
			if ((x * x) + (y * y) < 1) {
				count++;
			}
			i++;
		}
		pi = 4 * (count / n);
		return pi;
	}
}