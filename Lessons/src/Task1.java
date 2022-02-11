import java.util.Scanner;

class Task1 {
    Task1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Введите первое целое число! ");
            String character = scanner.next();
            if ((new Scanner(character)).hasNextInt()) {
                int trueNumber = Integer.parseInt(character);
                if (trueNumber % 2 == 0) {
                    System.out.println("Это четное число! ");
                } else {
                    System.out.println("Это нечетное число! ");
                }

                while(true) {
                    System.out.print("Введите второе целое число! ");
                    character = scanner.next();
                    if ((new Scanner(character)).hasNextInt()) {
                        trueNumber = Integer.parseInt(character);
                        if (trueNumber % 2 == 0) {
                            System.out.println("Это четное число! ");
                        } else {
                            System.out.println("Это нечетное число! ");
                        }

                            while(true) {
                                System.out.print("Введите букву! ");
                                character = scanner.next();
                                char letter = character.charAt(0);
                                if (Character.isDigit(letter)) {
                                    System.out.println("Это не буква! ");
                                } else if (Character.isLetter(letter)) {
                                    System.out.println("Вы ввели букву " + letter);
                                    return;
                                }
                            }
                    }

                    System.out.println("Это не целое число! ");
                }
            }

            System.out.println("Это не целое число!");
        }
    }
}
