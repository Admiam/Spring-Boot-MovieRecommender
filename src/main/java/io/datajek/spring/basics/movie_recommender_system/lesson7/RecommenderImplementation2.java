package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked..");
    }

    public String[] recommendMovies(String movie) {
        //use content based filter to find similar movies
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");
        //return the results
        return results;
    }
}
