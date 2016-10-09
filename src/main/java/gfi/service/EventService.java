package gfi.service;

import gfi.entities.Animation;
import gfi.entities.Sequence;
import gfi.entities.SequenceFrame;
import gfi.entities.Event;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Biel on 8/10/2016.
 */
@RestController
@RequestMapping("/event")
public class EventService {
    final int MATRIX_SIZE = 5;
    Event currentEvent;
    @RequestMapping(value = "", method = RequestMethod.GET)
    Event getEvent(@RequestParam Integer pos){
        return currentEvent;
    }
    @RequestMapping("/sequence/{id}")
    Sequence getSequence(@NotNull @PathVariable Integer id){
        return currentEvent.getAnimation().getSequences().get(id);
    }
    @RequestMapping(value = "", method = RequestMethod.POST)
    String setEvent(@RequestParam String name, @RequestParam Integer delay){
        Calendar cal = Calendar.getInstance(); // creates calendar
        cal.setTime(new Date()); // sets calendar time/date
        cal.add(Calendar.SECOND, delay); // adds one hour
        Event e = new Event(new Animation(new File("C:\\Users\\Biel\\anims\\" + name), 5), cal.getTime());
        currentEvent = e;
        return "Event of type " + name + " scheduled for " + cal.getTime().toString();
    }

}
