package com.lambdaschool.projectrestdogs.services;


// import com.lambdaschool.projectrestdogs.ProjectrestdogsApplication;
import com.lambdaschool.projectrestdogs.model.MessageDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageListenerHigh
{
    private static final Logger logger = LoggerFactory.getLogger(MessageListenerHigh.class);

    // @RabbitListener(queues = ProjectrestdogsApplication.QUEUE_NAME_HIGH)
    public void recieveHighMessage(MessageDetail msg)
    {
        logger.info("Recieved message {}", msg.toString());
    }
}
