package gfi.service;

import gfi.entities.Animation;
import gfi.entities.AnimationFrame;
import gfi.entities.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Biel on 8/10/2016.
 */
@RestController
@RequestMapping("/")
public class AnimationService {
    Date d = new Date();
    @RequestMapping("/event")
    Event getEvent(){
        Animation animation = new Animation();
        animation.add(new AnimationFrame("#154360", 1500));
        animation.add(new AnimationFrame("#1D8348", 1600));
        animation.add(new AnimationFrame("#873600", 1200));
        Calendar cal = Calendar.getInstance(); // creates calendar
        cal.setTime(new Date()); // sets calendar time/date
        cal.add(Calendar.SECOND, 1); // adds one hour
        cal.getTime(); // returns new date object, one hour in the future
        Event e = new Event(animation, new Date());
        return e;
    }
    
}
