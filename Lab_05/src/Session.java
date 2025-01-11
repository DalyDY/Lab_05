/**
 * Represents a study session of the day.
 * @author CHHENG Rayuth
 * @version 1.1
 * @update create method call setDuration(int startTime, int endTime)
 * @modified 01/11/2025
 */
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Session {
    private String sessionName;
    private int startTime;
    private int endTime;

    public Session(String sessionName, int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException("Start time must be less than end time.");
        }
        this.sessionName = sessionName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setDuration(int startTime, int endTime) throws IllegalArgumentException {
        if (startTime >= endTime) {
            throw new IllegalArgumentException("Start time must be less than end time.");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }
    @Override
    public String toString() {
        return "Session Name: " + sessionName + "\n" +
                "Start Time: " + startTime + "\n" +
                "End Time: " + endTime;
    }
}
