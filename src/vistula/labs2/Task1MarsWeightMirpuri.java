package vistula.labs2;

public class Task1MarsWeightMirpuri {

    static String name = "Student";
        static float earthWeightMirpuri = 65.0f;
        static float marsGravityFactorMirpuri = 0.38f;
        static float marsWeightFloatMirpuri;

        static double marsWeightDoubleMirpuri;

        static int marsWeightIntMirpuri;
        static char marsWeightCharMirpuri;

        static int charMathResultIntMirpuri;

        public static void main(String[] args) {
            System.out.println("TASK 1 — HOW MUCH DO YOU WEIGH ON MARS?");
            System.out.println("Name: " + name);


            marsWeightFloatMirpuri = earthWeightMirpuri * marsGravityFactorMirpuri;
            System.out.println("Earth weight (float) = " + earthWeightMirpuri + " kg");
            System.out.println("Mars gravity factor (float) = " + marsGravityFactorMirpuri);
            System.out.println("Mars weight calculated as float = " + marsWeightFloatMirpuri + " kg");


            marsWeightDoubleMirpuri = marsWeightFloatMirpuri;
            System.out.printf("Mars weight assigned to double (4 decimals) = %.4f kg%n", marsWeightDoubleMirpuri);


            marsWeightIntMirpuri = (int) marsWeightDoubleMirpuri;
            System.out.println("Mars weight cast from double to int (fraction removed) = " + marsWeightIntMirpuri);

            marsWeightCharMirpuri = (char) marsWeightIntMirpuri;
            System.out.println("Mars weight cast from int to char = '" + marsWeightCharMirpuri + "'");
            System.out.println("Char Unicode numeric value = " + (int) marsWeightCharMirpuri);


            charMathResultIntMirpuri = marsWeightCharMirpuri + 10;
            System.out.println("Math on char: (char + 10) stored into int = " + charMathResultIntMirpuri);
        }

}
