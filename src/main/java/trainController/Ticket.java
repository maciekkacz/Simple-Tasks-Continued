package trainController;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private int validityTime;
    private LocalDateTime timeOfPurchase;

    public Ticket(int validityTime) {
        this(validityTime, LocalDateTime.now());
    }

    public Ticket(int validityTime, LocalDateTime timeOfPurchase) {
        this.validityTime = validityTime;
        this.timeOfPurchase = timeOfPurchase;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }
    public int getValidityTime(){
        return validityTime;
    }
    public boolean isValid() {
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(timeOfPurchase, currentTime);
        return duration.toMinutes() < validityTime;
    }
}
