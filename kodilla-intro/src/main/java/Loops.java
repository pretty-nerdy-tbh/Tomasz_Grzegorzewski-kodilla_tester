public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[] {22, 34, 43, 67};
        Integer result = null;
        for (int i = 0; i < numbers.length; i++) {
        result = result + numbers[i];
        }
        System.out.println(result);
    }
}
