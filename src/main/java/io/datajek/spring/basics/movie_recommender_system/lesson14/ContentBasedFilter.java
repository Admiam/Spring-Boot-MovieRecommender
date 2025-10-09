package io.datajek.spring.basics.movie_recommender_system.lesson14;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    //for keeping track of instances created
    private static int instances= 0;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    private Movie movie;

    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor method");
    }

    @PostConstruct
    private void postConstruct() {
        //load movies into cache
        logger.info("In ContentBasedFilter postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        //clear movies from cache
        logger.info("In ContentBasedFilter preDestroy method");
    }

//    public Movie getMovie() {
//        return movie;
//    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[0];
    }
}