package com.banln.test.sender.component;

import com.banln.test.sender.dto.Dept;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiverModule {

//    String exchangeName = "x.upbit";

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "${val.exchange}", type = ExchangeTypes.TOPIC),
            value = @Queue(name = "${val.queue}"),  // 새거
            key = "${val.key}") // 받는거
    )
    public void receiveTicker(Dept dept){
        System.out.println("Ticker >> 받았음: " + dept.toString());
    }

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(name = "x.upbit", type = ExchangeTypes.TOPIC),
            value = @Queue(name= "q.upbit.bid"),  // 새거
            key = "*.bid") // 받는거
    )
    public void receiveBid(Dept dept){
        System.out.println("Bid >> 받았음: " + dept.toString());
    }

}