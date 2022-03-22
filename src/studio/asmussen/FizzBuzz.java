package studio.asmussen;

public class FizzBuzz {

    public static void main(String[] args) {

        final long START_TIME = System.currentTimeMillis();

        try {

            startGame(args.length > 0 ? Integer.parseInt(args[0]) : 100);

        } catch (NumberFormatException nFE) {

            startGame(100);
        }

        final double END_TIME = (System.currentTimeMillis() - START_TIME) / 1_000D;
        final String[] TIME = String.valueOf(END_TIME).split("\\.");

        System.out.printf("Time: %s second(s) and %s millisecond(s).%n", TIME[0], TIME[1]);
    }

    public static void startGame(int n) {

        for (int i = 1; i <= n; i++) {

            StringBuilder output = new StringBuilder();

            if (i % 3 == 0) output.append("Fizz");
            if (i % 5 == 0) output.append("Buzz");

            if (String.valueOf(output).equalsIgnoreCase("")) output = new StringBuilder(String.valueOf(i));

            System.out.println(output);
        }
    }
}
