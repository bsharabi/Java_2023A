import java.util.Arrays;
import java.util.Scanner;

public class Ceremony {


    private int[] songPoints;
    private int max;
    private int songNumber;

    public Ceremony() {
        songPoints = new int[30];
        max = 0;
        songNumber = -1;
    }

    public void doChoices() {

        Scanner sc = new Scanner(System.in);
        int first;
        int second;
        int third;
        while ((first = sc.nextInt()) != 0 && (second = sc.nextInt()) != 0 && (third = sc.nextInt()) != 0) {
            songPoints[first - 1] += 5;
            songPoints[second - 1] += 3;
            songPoints[third - 1] += 1;

            if (songPoints[first - 1] > max) {
                max = songPoints[first - 1];
                songNumber = first;
            }
            if (songPoints[second - 1] > max) {
                max = songPoints[second - 1];
                songNumber = second;
            }
            if (songPoints[third - 1] > max) {
                max = songPoints[third - 1];
                songNumber = third;
            }

        }
        System.out.println(Arrays.toString(songPoints));
    }

    public int winner() {
        int max = songPoints[0];
        int numberSong = 1;
        for (int i = 1; i < songPoints.length; i++) {
            if (max < songPoints[i]) {
                max = songPoints[i];
                numberSong = i + 1;
            }
        }
        return numberSong;
//        return songNumber;
    }
}
