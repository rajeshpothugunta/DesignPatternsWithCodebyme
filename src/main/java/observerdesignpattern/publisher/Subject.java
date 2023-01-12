package observerdesignpattern.publisher;

import observerdesignpattern.message.Message;
import observerdesignpattern.subscriber.Observer;

public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyupdate(Message m);
}
