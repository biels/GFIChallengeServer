package gfi.entities;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Biel on 8/10/2016.
 */
public class Event {
    Animation animation;
    Date startInstant;
    int times;
    UUID uuid;

    public Event(Animation animation, Date startInstant) {
        this.animation = animation;
        this.startInstant = startInstant;
        this.times = times;
        uuid = UUID.randomUUID();
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public Date getStartInstant() {
        return startInstant;
    }

    public void setStartInstant(Date startInstant) {
        this.startInstant = startInstant;
    }
    public Long getTimeToStart(){
        return startInstant.getTime() - new Date().getTime();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
}
