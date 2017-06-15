import java.util.Map;
import java.util.Set;

/*
 * Created by vanle on 10.06.17.
 */
public class Time implements EventCatalog {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        if ((hour < 0) || (hour > 23) || (minute < 0) || (minute > 59)){
            throw new IllegalArgumentException("Value for hour must be between 0 and 23.\nValue for minute must be between 0 and 59!");
        }

        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public boolean addCatalogEntry(Event e, Set<Time> tSet) {


        return false;
    }

    @Override
    public boolean addTimeToEvent(Event e, Time t) {
        return false;
    }

    @Override
    public Set<Event> getAllEvents() {
        return null;
    }

    @Override
    public Set<Time> getTimeOfEvent(Event e) {
        return null;
    }

    @Override
    public Map<Event, Set<Time>> FilterByEventCategory(EventCategory category) {
        return null;
    }

    @Override
    public Set<Time> deleteEvent(Event e) {
        return null;
    }

    @Override
    public boolean deleteTime(Event e, Time t) {
        return false;
    }
}