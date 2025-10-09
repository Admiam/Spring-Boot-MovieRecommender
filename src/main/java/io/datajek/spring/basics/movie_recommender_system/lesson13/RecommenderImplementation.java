package io.datajek.spring.basics.movie_recommender_system.lesson13;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
public class RecommenderImplementation {

    @Inject
    @Qualifier("CF")
    private Filter filter;

    public String[] recommendMovies(String movie) {
        //use content based filter to find similar movies
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations(movie);
        //return the results
        return results;
    }
}
