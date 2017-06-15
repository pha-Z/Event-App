import java.util.Map;
import java.util.Set;

/*
 * Created by vanle on 10.06.17.
 */


public class Event implements EventCatalog {

    private String title;
    private EventCategory category;

    public Event(String title, EventCategory category) {
        if (title == null){
            throw new NullPointerException();
        }
        this.title = title;
        this.category = category;
    }
    public String getTitle() {
        return title;
    }
    public EventCategory getCategory() {
        return category;
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