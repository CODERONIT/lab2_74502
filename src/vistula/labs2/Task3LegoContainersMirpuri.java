package vistula.labs2;

public class Task3LegoContainersMirpuri {

    static int amountOfBricksMirpuri = 77;       // odd, 50..100
    static int containerCapacityMirpuri = 8;     // even, 5..10

    static int fullContainersMirpuri;
    static int totalContainersMirpuri;
    static int remainingBricksMirpuri;

    public static void main(String[] args) {
        System.out.println("TASK 3 — HOW MANY CONTAINERS FOR BLOCKS NEED?");

        System.out.println("Amount of bricks (odd 50..100) = " + amountOfBricksMirpuri);
        System.out.println("Container capacity (even 5..10) = " + containerCapacityMirpuri);

        // Full containers
        fullContainersMirpuri = amountOfBricksMirpuri / containerCapacityMirpuri;
        System.out.println("Full containers = " + amountOfBricksMirpuri + " / " + containerCapacityMirpuri
                + " = " + fullContainersMirpuri);

        // Remaining bricks using modulo
        remainingBricksMirpuri = amountOfBricksMirpuri % containerCapacityMirpuri;
        System.out.println("Remaining bricks (modulo) = " + amountOfBricksMirpuri + " % " + containerCapacityMirpuri
                + " = " + remainingBricksMirpuri);

        // Total containers (add 1 if remainder exists)
        totalContainersMirpuri = (remainingBricksMirpuri == 0) ? fullContainersMirpuri : (fullContainersMirpuri + 1);
        System.out.println("Total containers (full + not full) = " + totalContainersMirpuri);

        if (remainingBricksMirpuri == 0) {
            System.out.println("All containers are full. No partially filled container.");
        } else {
            System.out.println("Bricks in the not completely full container = " + remainingBricksMirpuri);
        }
    }
}