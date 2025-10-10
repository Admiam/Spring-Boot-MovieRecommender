package io.datajek.spring.basics.movie_recommender_system.lesson17;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Qualifier("CBF")
@Component
@Qualifier("contentBasedFilter")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
