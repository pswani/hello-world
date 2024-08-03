package pwani.ddd.framework.core.event;

import pwani.ddd.framework.core.Identity;
import pwani.ddd.framework.implementation.NumberSequence;

public class EventId implements Identity<EventId> {

    private long id;

    public EventId(NumberSequence sequence) {
        this.id = sequence.nextValue();
    }

    private EventId(EventId eventId) {
        this.id = eventId.id;
    }

    @Override
    public EventId copy() {
        return new EventId(this);
    }

    @Override
    public boolean sameAs(EventId right) {
        return this.id == right.id;
    }

    @Override
    public String toString() {
        return "EventId [id=" + id + "]";
    }
}
