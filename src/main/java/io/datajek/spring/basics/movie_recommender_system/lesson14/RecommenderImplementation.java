package io.datajek.spring.basics.movie_recommender_system.lesson14;



public class RecommenderImplementation {

    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        //use content based filter to find similar movies
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations(movie);
        //return the results
        return results;
    }
}
