public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        if (args.length != 0) {
            print(args[0]);
            try {
                print(args[0], Integer.parseInt(args[1]));
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Second parameter should be a number");
            }
        } else {
            System.out.println("You should enter some text, or text and number");
        }
    }


    private static void print(String str) {
        System.out.println(str);
    }


    private static void print(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}
