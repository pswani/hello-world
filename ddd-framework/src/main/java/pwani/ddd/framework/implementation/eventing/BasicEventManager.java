package pwani.ddd.framework.implementation.eventing;

import pwani.ddd.framework.core.event.Event;
import pwani.ddd.framework.core.event.EventType;
import pwani.ddd.framework.eventing.EventHandler;
import pwani.ddd.framework.eventing.EventManager;

import java.util.*;

public class BasicEventManager implements EventManager {

    private Map<EventType, List<EventHandler>> handlers;

    public BasicEventManager() {
        this(new HashMap<>());
    }

    public BasicEventManager(Map<EventType, List<EventHandler>> handlers) {
        this.handlers = handlers;
    }

    @Override
    public void publish(Event event) {
        List<EventHandler> handlerList = handlersForEventType(event.eventType());
        for (EventHandler eventHandler : handlerList)
            eventHandler.handle(event);
    }

    @Override
    public void registerHandler(EventType eventType, EventHandler handler) {
        List<EventHandler> handlerList = handlersForEventType(eventType);
        handlerList.add(handler);
    }

    private List<EventHandler> handlersForEventType(EventType eventType){
        List<EventHandler> handlerList = handlers.getOrDefault(eventType, new ArrayList<EventHandler>());
        handlers.putIfAbsent(eventType, handlerList);
        return handlerList;
    }
}
