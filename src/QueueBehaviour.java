import java.util.List;

public interface QueueBehaviour {

    void addToQueue(Client client);

    void leftQueue(Client client);
}