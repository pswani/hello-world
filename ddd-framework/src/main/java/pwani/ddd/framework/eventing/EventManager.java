package pwani.ddd.framework.eventing;

import pwani.ddd.framework.core.event.Event;
import pwani.ddd.framework.core.event.EventType;

public interface EventManager {
    public void publish(Event event);

    public void registerHandler(EventType eventType, EventHandler handler);

}