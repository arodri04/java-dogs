package com.lambdaschool.projectrestdogs.services;
import com.lambdaschool.projectrestdogs.Dog;
//import com.lambdaschool.projectrestdogs.ProjectrestdogsApplication;
//import com.lambdaschool.projectrestdogs.model.MessageDetail;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//import java.util.Random;
//@Service
//public class MessageSender
//{
//    private RabbitTemplate rt;
//    private static final Logger logger = LoggerFactory.getLogger(MessageSender.class);
//
//    public MessageSender(RabbitTemplate rt)
//    {
//        this.rt = rt;
//    }
//    @Scheduled(fixedDelay = 3000L)
//    public void SendMessage()
//    {
//        for(Dog d: ProjectrestdogsApplication.ourDogList.dogList)
//        {
//            int rand = new Random().nextInt(10); // 0 - 9
//            boolean randBool = new Random().nextBoolean();
//            MessageDetail message = new MessageDetail(d.toString(), rand, randBool);
//            if (rand <= 5) {
//                logger.info("Sending Message High");
//                rt.convertAndSend(ProjectrestdogsApplication.QUEUE_NAME_HIGH, message);
//            } else {
//                logger.info("Sending Message Low");
//                rt.convertAndSend(ProjectrestdogsApplication.QUEUE_NAME_LOW, message);
//            }
//        }
//    }
//}
