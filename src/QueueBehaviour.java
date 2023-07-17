import java.util.List;

public interface QueueBehaviour {

    void addToQueue();

    void leftQueue();

    void reachEndOfQueue();

    List<String> showQueueStatus();

    int sizeOfQueue();
}
