package pub;
import pubsub.Message;
import server.Server;

public interface Publisher
{
    void publish(Message message, Server server);
}