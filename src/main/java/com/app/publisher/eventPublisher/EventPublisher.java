package com.app.publisher.eventPublisher;

import com.app.publisher.model.Book;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

/**
 * @author Saurabh Vaish
 * @Date 17-10-2021
 *
 *  Implementing cloud functions for supplier
 *
 */

@Configuration
@Log4j2
public class EventPublisher {


    @Autowired
    private StreamBridge output;

    /****
     *  It's the same as defining the controller and then trigger publish event
     *  instead we can define functions and publish events to consumer
     *
     *
     * @return
     */
    @Bean
    public Function<Book,String> publishBookEvent(){
        return (book)->{
            // publishing event using stream bridge
            this.output.send("publishBookEvent-out-0",book);  // binding name , data to send

            log.info("event published with data :: "+ book.toString());
            return "event generated ::: "+book.toString();
        };
    }
}
