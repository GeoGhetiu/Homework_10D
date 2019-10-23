package acasa_23_10_19;

public class Patrulatere {
double a = 5,  b = 6, h = 4;   

public double Paralelogram() {
	double ar1 = a*h;
	return ar1;
	}

public double Dreptunghi() {
	double ar2 = a*b;
	return ar2;
	}

public double Patrat() {
	double ar3 = Math.pow(a, 2);
	return ar3;
	}

public double Trapez() {
	double ar4 = (a+b)*h/2;
	return ar4;
	}
}
