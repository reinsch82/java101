/*
    Aufgabe 1) Methoden rufen Methoden auf und überladen von Methoden
*/
public class Aufgabe1 {
    
    public static void main(String[] args) {
        
    }
    
    private static int calcProduct(int a, int b) {
		return a*b;
	}

    private static double calcProduct(double a, double b) {
		return a*b;
	}

    public static int multNew(int m, int n) {
        int result = 0;
        while (n > 0) {
            result += m;
            n--;
        }
        return result;
    }
    public static int mult(int m, int n) {
        int result = 0;
        while (n > 0) {
            result += m;
            n--;
        }
        return result;
    }
}
