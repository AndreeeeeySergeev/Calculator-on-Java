import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber;
        int changing;
        String secondNumber;
        int thirdNumber;
        int finalNumber;

        Scanner input = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            firstNumber = input.nextInt();

            System.out.print("Введите знак операции (+;-;*;/): ");
            secondNumber = input.next();
            changing = secondNumber.charAt(0);


            System.out.print("Введите второе число: ");
            thirdNumber = input.nextInt();
            if (thirdNumber == 0 && changing == '/' ){
                System.out.println("Делить на ноль нельзя!");
            }


            switch (changing) {
                case '+':
                    finalNumber = firstNumber + thirdNumber;
                    System.out.println("Итого: " + finalNumber);
                    break;
                case '-':
                    finalNumber = firstNumber - thirdNumber;
                    System.out.println("Итого: " + finalNumber);
                    break;
                case '*':
                    finalNumber = firstNumber * thirdNumber;
                    System.out.println("Итого: " + finalNumber);
                    break;
                case '/':
                    finalNumber = firstNumber / thirdNumber;
                    System.out.println("Итого: " + finalNumber);
                    break;
                default:
                    System.out.println("Вы ввели неверный знак");
            }
        }
    }

