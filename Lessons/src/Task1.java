 import java.util.Scanner;

  class TestTask {

    public static void main(String[] args) {
 // Task 1.3
     Scanner scanner = new Scanner(System.in);
          System.out.print("Введите первое целое число! ");
        String number = scanner.next();
        if (new Scanner(number).hasNextInt()){
            int trueNumber = Integer.parseInt(number);
            if (trueNumber % 2 == 0){
                System.out.println("Это четное число! ");
            }else {
                System.out.println("Это нечетное чило! ");
            }

        }else {
            System.out.println("Это не число!");
        }
        System.out.print("Введите второе целое число! ");
        String number2 = scanner.next();
        if (new Scanner(number2).hasNextInt()){
            int trueNumber = Integer.parseInt(number2);
            if (trueNumber % 1 == 0){
                if (trueNumber % 2 == 0) {
                    System.out.println("Это четное число! ");
                } else {
                    System.out.println("Это нечетное число! ");
                }
            }
            else {
                System.out.println("Это не целое число! ");
            }
        }
        else {
            System.out.println("Это не число! ");
        }
        System.out.print("Введите букву! ");
        String character = scanner.next();
        char letter = character.charAt(0);
        if (Character.isDigit(letter)) {
            System.out.println("Это не буква! ");
        } else if (Character.isLetter(letter)) {
            System.out.println("Вы ввели букву " + letter);
        }

        }

    }

}




