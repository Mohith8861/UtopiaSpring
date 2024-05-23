package com.example.UtopiaSpring.model;

import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "tours")
public class Tour {

    @MongoId
    private String _id;
    private int days;
    private String slug;
    private String title;
    @Nullable
    private List<String> places;
    @Nullable
    private List<String> inclusions;
    @Nullable
    private String imglink;
    @Nullable
    private String optional;
    private double price;
    @Nullable
    private TourPage page;
    @Nullable
    private List<TourItinerary> tourItinerary;
    @Nullable
    private Details detils;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class TourPage {
        @Nullable
        private String img;
        private String title;
        private String daysNight;
        private String citytocity;
        @Nullable
        private String customisable;
        @Nullable
        private List<TourItinerary> tourItinerary;
        @Nullable
        private Details details;

    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class TourItinerary {
        private String day;
        @Nullable
        private String dayImg;
        @Nullable
        private List<String> schedule;

    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class Details {
        @Nullable
        private List<String> otherInclusions;
        @Nullable
        private List<String> exclusions;

    }
}

