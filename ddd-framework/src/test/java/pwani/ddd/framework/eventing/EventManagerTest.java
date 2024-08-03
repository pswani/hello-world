package pwani.ddd.framework.eventing;

import org.junit.jupiter.api.Test;

import pwani.ddd.framework.core.event.Event;
import pwani.ddd.framework.core.event.EventId;
import pwani.ddd.framework.core.event.EventType;
import pwani.ddd.framework.implementation.NumberSequence;
import pwani.ddd.framework.implementation.eventing.BasicEventManager;

public class EventManagerTest {

    @Test
    void testGeneral() {
        TestEvent event = new TestEvent();
        EventManager em=new BasicEventManager();
        em.registerHandler(event.eventType(), e -> System.out.println(e.id()));
        em.publish(event);
    }
}

class TestEvent implements Event {

    private static EventType eventType = new TestEventType();
    private static NumberSequence sequence = new NumberSequence();
    private EventId id;

    public TestEvent() {
        id = new EventId(sequence);
    }

    @Override
    public boolean sameEventAs(Event right) {
        return this.id.sameAs(right.id());
    }

    @Override
    public EventId id() {
        return this.id;
    }

    @Override
    public EventType eventType() {
        return eventType;
    }

    static class TestEventType implements EventType {
    }

}