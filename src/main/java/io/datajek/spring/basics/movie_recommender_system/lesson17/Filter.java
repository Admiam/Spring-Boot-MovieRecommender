package io.datajek.spring.basics.movie_recommender_system.lesson17;

public interface Filter {
    public String[] getRecommendations(String movie);
}
