package com.app.publisher.controller;

import com.app.publisher.eventPublisher.EventPublisher;
import com.app.publisher.model.Book;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Saurabh Vaish
 * @Date 17-10-2021
 */

@RestController
@RequiredArgsConstructor
@Log4j2
public class PublishController {

    private final EventPublisher eventPublisher;

    @PostMapping("/publish-book-event")
    public ResponseEntity<String> saveBook(@RequestBody Book book){
        String result = eventPublisher.publishBookEvent().apply(book);
        return ResponseEntity.ok(result);
    }

}
