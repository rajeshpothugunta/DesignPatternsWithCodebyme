package observerdesignpattern.subscriber;

import observerdesignpattern.message.Message;

public interface Observer {
    public void update(Message m);
}
