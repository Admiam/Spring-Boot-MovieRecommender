package io.datajek.spring.basics.movie_recommender_system.lesson1;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
    public String[] recommendMovies(String movie) {
        //use content based filter to find similar movies
//        ContentBasedFilter filter = new ContentBasedFilter();
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");
        //return the results
        return results;
    }
}