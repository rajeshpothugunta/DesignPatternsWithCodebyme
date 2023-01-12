package observerdesignpattern.publisher;

import observerdesignpattern.message.Message;
import observerdesignpattern.subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessageNotifier implements Subject{
    private List<Observer> observersList = new ArrayList<>();
    @Override
    public void attach(Observer o) {
        observersList.add(o);
    }

    @Override
    public void detach(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyupdate(Message m) {
        for(Observer o:observersList){
            o.update(m);
        }


    }
}
