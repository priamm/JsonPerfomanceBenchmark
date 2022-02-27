package com.example.jsonbenchmark.logan;

import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;

@JsonObject
public class PhotoLogan {

    public List<Result> results;

    public int total;

    public int total_pages;

    @JsonObject
    public static class Result{
        public String color;
        public String created_at;
        public String description;
        public int height;
        public String id;
        public boolean liked_by_user;
        public int likes;
        public Links links;
        public Urls urls;
        public User user;
        public int width;

        @JsonObject
        public static class Links{
            public String download;
            public String html;
            public String self;
        }

        @JsonObject
        public static class User{
            public String first_name;
            public String id;
            public String instagram_username;
            public String last_name;
            public Links links;
            public String name;
            public String portfolio_url;
            public ProfileImage profile_image;
            public String twitter_username;
            public String username;

            @JsonObject
            public static class Links{
                public String html;
                public String likes;
                public String photos;
                public String self;
            }

            @JsonObject
            public static class ProfileImage{
                public String large;
                public String medium;
                public String small;
            }
        }

        @JsonObject
        public static class Urls {
            public String full;

            public String raw;

            public String regular;

            public String small;
            public String thumb;
        }
    }
}
