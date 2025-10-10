package io.datajek.spring.basics.movie_recommender_system.lesson17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("collaborativeFilter")
    private Filter filter;

    @Value("${recommender.implementation.favoriteMovie: Finding Dory}")
    String favoriteMovie;

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public String[] recommendMovies(String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}
