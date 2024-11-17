import java.util.Random;

public class RandomNumbers {
    public int temp;

    public void getRandomNumbers() {
        Random random = new Random();
        int max = 5000;
        int sum = 0;
        this.temp = 0;
        while (sum <= max) {
            this.temp = random.nextInt(30);
            sum = sum + this.temp;
        }
    }

    public int getLowestNumber() {
        int lowestNumber = 5000;
        while (lowestNumber > this.temp) {
            lowestNumber = this.temp;
        }
        return lowestNumber;
    }

    public int gwtHighestNumber() {
        int highestNumber = 0;
        while (highestNumber < this.temp) {
            highestNumber = this.temp;
        }
        return highestNumber;
    }
}
