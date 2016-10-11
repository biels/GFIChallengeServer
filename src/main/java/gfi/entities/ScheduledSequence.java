package gfi.entities;

import java.util.UUID;

/**
 * Created by Biel on 9/10/2016.
 */
public class ScheduledSequence {
    Long timeToStart;
    Sequence sequence;
    UUID uuid;

    public ScheduledSequence(Long timeToStart, Sequence sequence, UUID uuid) {
        this.timeToStart = timeToStart;
        this.sequence = sequence;
        this.uuid = uuid;
    }

    public Long getTimeToStart() {
        return Math.round(timeToStart * 1.85);
    }

    public void setTimeToStart(Long timeToStart) {
        this.timeToStart = timeToStart;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
