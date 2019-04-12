package lottery;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int userNo, randomNo, counter = 0;

        randomNo = (int) (random.nextDouble() * 1000);
        System.out.println(randomNo);
        userNo = input.nextInt();

        if (userNo == randomNo) {

            System.out.println("The award is 10,000$!");

        } else {
            int[] userNoDigits = new int[3];

            for (int i = 0; i < 3; i++) {

                userNoDigits[i] = userNo % 10;
                userNo /= 10;
            }

            for (int j = 0; j < 3; j++) {

                int digit, prior = -1;
                digit = randomNo % 10;
                randomNo /= 10;

                for (int k = 0; k < 3; k++) {

                    if (userNoDigits[k] == digit && prior != digit) {

                        prior = digit;
                        counter++;
                        break;

                    }
                }

            }
            if (counter > 1 && counter <= 3) {

                System.out.println("The award is 3000$!");

            } else if (counter == 1) {

                System.out.println("The award is 1000$!");

            } else {

                System.out.println("You won nothing!");

            }
        }

    }

}
