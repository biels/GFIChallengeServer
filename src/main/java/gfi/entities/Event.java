package gfi.entities;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Biel on 8/10/2016.
 */
public class Event {
    Animation animation;
    Date startInstant;
    UUID uuid;

    public Event(Animation animation, Date startInstant) {
        this.animation = animation;
        this.startInstant = startInstant;
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
}
