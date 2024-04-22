package MQ.Kafka.Listener;

//import MQ.Kafka.dbo.customer;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;



@Service
public class consumerListener {
    Logger log = LoggerFactory.getLogger(consumerListener.class);
    @KafkaListener(topics = "Topic1" ,groupId = "1")
    public void consume (String message) {
        log.info("consumer consume the message {}..", message);
    }

}
