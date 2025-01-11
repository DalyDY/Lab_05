/**
 * Represents a study session of the day.
 * @author CHHENG Rayuth
 * @version 1.1
 * @update create method call setDuration(int startTime, int endTime)
 * 
 * @modified 01/11/2025
 */
public class Session {
    private String sessionName;
    private int startTime;
    private int endTime;

    public Session() {
    }

    public Session(String sessionName, int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException("Start time must be less than end time.");
        }
        this.sessionName = sessionName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        if (startTime >= this.endTime) {
            throw new IllegalArgumentException("Start time must be less than end time.");
        }
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        if (this.startTime >= endTime) {
            throw new IllegalArgumentException("End time must be greater than start time.");
        }
        this.endTime = endTime;
    }

    public void setDuration(int startTime, int endTime) {
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
