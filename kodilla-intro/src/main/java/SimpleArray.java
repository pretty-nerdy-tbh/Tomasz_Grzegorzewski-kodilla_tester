public class SimpleArray {
    public static void main(String[] args) {
        String[] songs = new String[5];

        songs[0] = "Blinding Lights";
        songs[1] = "The Twist";
        songs[2] = "Smooth";
        songs[3] = "Mack The Knife";
        songs[4] = "Uptown Funk!";

        String song = songs[3];

        System.out.println(song);

        int numberOfElements = songs.length;

        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

    }
}
