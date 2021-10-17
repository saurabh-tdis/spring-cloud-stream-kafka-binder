package com.app.publisher;

import com.app.publisher.model.Book;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
@Log4j2
//@EnableBinding   // its deprecated so taking the functional programming support
public class SpringCloudStreamsPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamsPublisherApplication.class, args);
	}
}
