package observerdesignpattern.subscriber;

import observerdesignpattern.message.Message;

public class Observer1 implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("Observer-1: "+m.getMessageContent());
    }
}
