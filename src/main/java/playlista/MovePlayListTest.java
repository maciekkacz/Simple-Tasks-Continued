package playlista;

public class MovePlayListTest {
    public static void main(String[] args) {

        Move move1 = new Move("Killer", 5000); // time in sec
        Move move2 = new Move("Chłopaki nie płaczą", 8000);

        MovePlayList mpl = new MovePlayList();
        int movePlayList = mpl.movePlayListLength(move1, move2);
        System.out.printf("All moves last: %d seconds, i.e. ", movePlayList);
        String formatetedTime = mpl.getFormattedTime(movePlayList);
        System.out.println(formatetedTime);

    }
}
