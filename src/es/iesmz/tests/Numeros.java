package es.iesmz.tests;

public class Numeros {
    public static int soniguales(int a, int b, int c) {
        if (a == b && a == c) {
            return 0;
        } else if (a == b || a == c || b == c) {
            return 1;
        } else {
            return 2;
        }
    }
}