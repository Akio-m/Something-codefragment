import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Solver solver = new Solver();
        while(sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(solver.solve(line));
        }
    }
}

public class Solver {
    public String solve(int number) {
        int abso = Math.abs(getDivisorAccum(number) - number);
        if (abso == 0) {
            return "perfect";
        } else if (abso == 1) {
            return "nearly";
        }
        return "neither";
    }

    private int getDivisorAccum(int number) {
        int acc = 0;
        for (int i=1; i < number; i++) {
            if (number % i != 0) { continue; }
            acc += i;
        }
        return acc;
    }
}
