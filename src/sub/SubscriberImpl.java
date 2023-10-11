package sub;
import server.Server;
import sub.Subscriber;

public class SubscriberImpl extends Subscriber{
    //Add subscriber with PubSubService for a topic
    public void addSubscriber(String topic, Server pubSubServer){
        pubSubServer.addSubscriber(topic, this);
    }

    //Unsubscribe subscriber with PubSubService for a topic
    public void unSubscribe(String topic, Server pubSubServer){
        pubSubServer.removeSubscriber(topic, this);
    }

    //Request specifically for messages related to topic from PubSubService
    public void getMessagesForSubscriberOfTopic(String topic, Server pubSubServer) {
        pubSubServer.getMessagesForSubscriberOfTopic(topic, this);

    }
}