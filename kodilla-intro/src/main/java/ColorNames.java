import java.util.Scanner;
public class ColorNames {

    public static String getColorFromLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of a color:");
            String firstLetter = scanner.nextLine().trim().toUpperCase();
            switch (firstLetter) {
                case "A": return "Amber";
                case "B": return "Black";
                case "C": return "Charcoal";
                case "D": return "Denim";
                case "E": return "Ecru";
                case "F": return "Fuchsia";
                case "G": return "Gold";
                case "H": return "Hazel";
                case "I": return "Indigo";
                case "J": return "Jade";
                case "K": return "Khaki";
                case "L": return "Lilac";
                case "M": return "Magenta";
                case "N": return "Navy";
                case "O": return "Orange";
                case "P": return "Pink";
                case "Q": return "Quartz";
                case "R": return "Red";
                case "S": return "Scarlet";
                case "T": return "Turquoise";
                case "U": return "Ultramarine";
                case "V": return "Violet";
                case "W": return "White";
                case "X": return "Xanthic";
                case "Y": return "Yellow";
                case "Z": return "Zomp";
                default:
                    System.out.println ("I don't know this letter. Try different one.");
            }
        }
    }
}
