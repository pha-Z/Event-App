import java.util.Map;
import java.util.Set;

/*
 * Created by vanle on 10.06.17.
 */
public interface EventCatalog {
    public boolean addCatalogEntry(Event e, Set<Time> tSet);
    public boolean addTimeToEvent(Event e, Time t);
    public Set<Event> getAllEvents();
    public Set<Time> getTimeOfEvent(Event e);
    public Map<Event, Set<Time>> FilterByEventCategory(EventCategory category);
    public Set<Time> deleteEvent(Event e);
    public boolean deleteTime(Event e, Time t);
}
