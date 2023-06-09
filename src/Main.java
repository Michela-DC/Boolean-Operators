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
            System.out.println("A: Il risultato è true");
        } else {
            System.out.println("A: La mia soluzione è false");
        }

        if(!false && 3 > 2) {
            System.out.println("B: La mia soluzione è true");
        } else {
            System.out.println("B: Il risultato è false");
        }

        boolean t = true;
        boolean f = false;

        if(!(!t || f)) {
            System.out.println("C: La mia soluzione è true");
        } else {
            System.out.println("C: Il risultato è false");
        }

        if(6 > 6 ^ !(true && true)) {
            System.out.println("D: Il risultato è true");
        } else {
            System.out.println("D: La mia soluzione è false");
        }

        //Oppure altro modo per controllare la mia soluzione:

        boolean A = 2 <= 2 && !true;
        boolean B = !false && 3 > 2;
        boolean C = !(!t || f);
        boolean D = 6 > 6 ^ !(true && true);

        if(A == false) {
            System.out.println("A: La mia soluzione è corretta");
        } else {
            System.out.println("A: La mia soluzione è errata");
        }

        if(B == true) {
            System.out.println("B: La mia soluzione è corretta");
        } else {
            System.out.println("B: La mia soluzione è errata");
        }

        if(C == true) {
            System.out.println("C: La mia soluzione è corretta");
        } else {
            System.out.println("C: La mia soluzione è errata");
        }

        if(D == false) {
            System.out.println("D: La mia soluzione è corretta");
        } else {
            System.out.println("D: La mia soluzione è errata");
        }

    }
}