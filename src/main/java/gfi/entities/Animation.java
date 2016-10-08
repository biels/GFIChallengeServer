package gfi.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Biel on 8/10/2016.
 */
public class Animation {
    List<AnimationFrame> animationFrames = new ArrayList<>();

    public void add(AnimationFrame element) {
        animationFrames.add(element);
    }

    public List<AnimationFrame> getAnimationFrames() {
        return animationFrames;
    }

    public void setAnimationFrames(List<AnimationFrame> animationFrames) {
        this.animationFrames = animationFrames;
    }
}
