package pub;
import pub.Publisher;
import pubsub.Message;
import server.Server;

public class PublisherImpl implements Publisher {
    //Publishes new message to PubSubService
    public void publish(Message message, Server pubSubServer) {
        pubSubServer.addMessageToQueue(message);
    }
}