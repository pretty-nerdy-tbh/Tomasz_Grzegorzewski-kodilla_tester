import java.util.Random;

public class RandomNumbers {

    public int getRandomNumbers() {
        Random random = new Random();
        int max = 5000;
        int sum = 0;
        int temp = 0;
        while (sum <= max) {
            temp = random.nextInt(30);
            sum = sum + temp;
        }

        public int lowestNumber() {
            int lowestNumber = 5000;
            while (lowestNumber > temp) {
                lowestNumber = temp;
            }
            return lowestNumber;
        }

        public int highestNumber() {
            int highestNumber = 0;
            while (highestNumber < temp) {
                highestNumber = temp;
            }
            return highestNumber;
        }
    }
}
