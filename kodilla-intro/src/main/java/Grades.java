public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastAddedGrade() {
        if (this.size > 0) {
            return this.grades[this.size - 1];
        } else {
            System.out.println("Grades have not been added yet");
        }
        return 0;
    }

    public int averageGrade() {
        if (this.size > 0) {
            int sum = 0;
            for (int i = 0; i < this.size; i++) {
                sum = sum + grades[i];
            }
            int result = sum / this.size;
            return result;
    } else {
            System.out.println("Grades have not been added yet");
        }
        return 0;
    }
}
