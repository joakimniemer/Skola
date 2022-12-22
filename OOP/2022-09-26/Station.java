import java.time.LocalTime;

public class Station {
    public Observation lastObservation;

    public Observation observationRequest() {
        LocalTime lt = LocalTime.now();
        int hour = lt.getHour();
        int minute = lt.getMinute();
        if (lastObservation == null) {
            lastObservation = new Observation(1, hour, minute, 13, 25, 125);
        } else if (lastObservation.getHour() != hour || lastObservation.getMinute() != minute) {
            lastObservation = new Observation(lastObservation.getId() + 1, hour, minute, 15, 32, 155);
        }
        return lastObservation;
    }
}
