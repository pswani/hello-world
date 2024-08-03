package pwani.ddd.framework.core.event;

public interface Event {

  public boolean sameEventAs(Event right);

  public EventId id();

  public EventType eventType();

}
