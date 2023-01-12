package observerdesignpattern.subscriber;

import observerdesignpattern.message.Message;

public class Observer2 implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("Observer-2: "+m.getMessageContent());
    }
}
