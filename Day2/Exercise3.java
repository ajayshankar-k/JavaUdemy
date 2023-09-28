public class Exercise3 {
    public static void main(String[] args) {
        displayHighScorePosition("Ajay", calculateHighScore(1500));
        displayHighScorePosition("Alen", calculateHighScore(1000));
        displayHighScorePosition("Rakesh", calculateHighScore(500));
        displayHighScorePosition("Siva", calculateHighScore(100));
        displayHighScorePosition("Venthan", calculateHighScore(25));
    } // main method

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    } //first method

    public static int calculateHighScore(int x) {
        if (x >= 1000) {
            return 1;
        } else if (x >= 500 && x < 1000) {
            return 2;
        } else if (x >= 100 && x < 500) {
            return 3;
        } else {
            return 4;
        }
    } // second method
}
