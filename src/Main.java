//Try to solve on paper the following boolean algebra operations:
//
//        [A]: 2 <= 2 && !true
//        [B]: !false && 3 > 2
//        [C]: considering that t=false and f=true: !(!t || f)
//        [D]: 6 > 6 ^ !(true && true)
//
//Then compare your solutions with a Java program that tests the validity of your assumptions.

public class Main {
    public static void main(String[] args) {

        if(2 <= 2 && !true) {
            System.out.println("Il risultato è true");
        } else {
            System.out.println("La mia soluzione è false");
        }

        if(!false && 3 > 2) {
            System.out.println("La mia soluzione è true");

        } else {
            System.out.println("Il risultato è false");
        }

        boolean t = true;
        boolean f = false;

        if(!(!t || f)) {
            System.out.println("La mia soluzione è true");
        } else {
            System.out.println("Il risultato è false");
        }

        if(6 > 6 ^ !(true && true)) {
            System.out.println("il risultato è true");
        } else {
            System.out.println("La mia soluzione è false");
        }
    }
}