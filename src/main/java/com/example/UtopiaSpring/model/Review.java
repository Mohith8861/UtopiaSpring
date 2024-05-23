package com.example.UtopiaSpring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "reviews")
public class Review {
    private String _id;
    private String title;
    private String reviewText;
    private Date createdAt;
    private Integer rating;
    private User user;
    private Tour tour;
}

