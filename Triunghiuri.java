package acasa_23_10_19;

public class Triunghiuri {
int a = 5, cat1 = 3, cat2 = 4, h = 7;

public double Oarecare() {
	double ar5 = a*h/2;
	return ar5;
	}

public double Dreptunghic() {
	double ar6 = cat1*cat2/2;
	return ar6;
	}

public double Echilateral() {
	double ar7 = Math.pow(a, 2) * Math.sqrt(3) / 4;
	return ar7;
	}
}
