import java.util.Random;

public class RandomNumbers {
    public int temp;
    private int lowestNumber = 5000;
    private int highestNumber = 0   ;


    public void getRandomNumbers() {
        Random random = new Random();
        int max = 5000;
        int sum = 0;
        this.temp = 0;
        while (sum <= max) {
            this.temp = random.nextInt(30);
            if (this.lowestNumber > this.temp) {
                this.lowestNumber = this.temp;
            } else if (this.highestNumber < this.temp) {
                this.highestNumber = this.temp;
            }
            sum = sum + this.temp;
        }
    }

    public int getLowestNumber() {
        return this.lowestNumber;
    }

    public int getHighestNumber() {
        return this.highestNumber;
    }
}