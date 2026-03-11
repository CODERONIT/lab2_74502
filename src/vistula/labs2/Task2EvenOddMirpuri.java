package vistula.labs2;

public class Task2EvenOddMirpuri {

    static int randomNumberMirpuri;
    static int moduloResultMirpuri;

    public static void main(String[] args) {
        System.out.println("TASK 2 — EVEN OR NOT EVEN?");

        // Random int from 1 to 100 inclusive using Math.random()
        randomNumberMirpuri = (int) (Math.random() * 100) + 1;
        System.out.println("Generated random number (1..100) = " + randomNumberMirpuri);

        // Modulo check
        moduloResultMirpuri = randomNumberMirpuri % 2;
        System.out.println("Modulo operation: " + randomNumberMirpuri + " % 2 = " + moduloResultMirpuri);

        if (moduloResultMirpuri == 0) {
            System.out.println("Result: The number is EVEN.");
        } else {
            System.out.println("Result: The number is ODD.");
        }
    }
}

