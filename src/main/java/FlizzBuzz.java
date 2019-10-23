public class FlizzBuzz {
    public static void main(String[] args) {
        int giveMyNumer = 100;
        for (int i = 0; i <= giveMyNumer; i++) {
            boolean three = i % 3 == 0;
            boolean five = i % 5 == 0;
            boolean fifteen = three && five;
            if (fifteen) {
                System.out.println(i + "FizzBuzz");
            }
            else if (five) {
                System.out.println(i + "Fizz");
            }
            else if (three) {
                System.out.println(i + "Buzz");
            }

        }

    }
}
