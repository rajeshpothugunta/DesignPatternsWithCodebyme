package observerdesignpattern;

import observerdesignpattern.message.Message;
import observerdesignpattern.publisher.MessageNotifier;
import observerdesignpattern.subscriber.Observer;
import observerdesignpattern.subscriber.Observer1;
import observerdesignpattern.subscriber.Observer2;

public class Main {
    public static void main(String[] args) {
        MessageNotifier msgnotifier = new MessageNotifier();

        Observer msgSub1 = new Observer1();
        Observer msgSub2 = new Observer2();

        msgnotifier.attach(msgSub1);
        msgnotifier.attach(msgSub2);

        msgnotifier.notifyupdate(new Message("First Message"));

        msgnotifier.detach(msgSub2);

        msgnotifier.notifyupdate(new Message("Second Message"));
    }
}
