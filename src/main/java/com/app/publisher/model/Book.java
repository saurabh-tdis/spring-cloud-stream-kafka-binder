package com.app.publisher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Saurabh Vaish
 * @Date 17-10-2021
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Long id;
    private String bookName;
    private String authorName;

}
