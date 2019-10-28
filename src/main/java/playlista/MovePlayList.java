package playlista;

public class MovePlayList {
    private static final int SECONDS_IN_HOUR = 60*60;
    private static final int SECONDS_IN_MINUTE = 60;

    public int movePlayListLength(Move... move) {
        int totalTime = 0;
        for (Move moves : move) {
            totalTime += moves.getLenght();
        }
        return totalTime;
    }

    public String getFormattedTime(int seconds) {
        int hours = seconds / SECONDS_IN_HOUR;
        seconds %= SECONDS_IN_HOUR;
        int minutes = seconds / SECONDS_IN_MINUTE;
        seconds %= SECONDS_IN_MINUTE;
        String hoursPart = timeToString(hours);
        String minutesPart = timeToString(minutes);
        String secondsPart = timeToString(seconds);
        return hoursPart + ":" + minutesPart + ":" + secondsPart;
    }

    private String timeToString(int hours) {
        String time;
        if(hours == 0)
            time = "00";
        else if(hours < 10)
            time = "0" + hours;
        else
            time = Integer.toString(hours);
        return time;
    }


}
