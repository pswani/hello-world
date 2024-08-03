package pwani.ddd.framework.eventing;

import pwani.ddd.framework.core.event.Event;

public interface EventHandler {
    public void handle(Event event);
}