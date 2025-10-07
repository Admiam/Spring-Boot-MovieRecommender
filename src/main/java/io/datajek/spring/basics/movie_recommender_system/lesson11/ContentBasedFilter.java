package io.datajek.spring.basics.movie_recommender_system.lesson11;

import io.datajek.spring.basics.movie_recommender_system.lesson9.Movie;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode= ScopedProxyMode.TARGET_CLASS)
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