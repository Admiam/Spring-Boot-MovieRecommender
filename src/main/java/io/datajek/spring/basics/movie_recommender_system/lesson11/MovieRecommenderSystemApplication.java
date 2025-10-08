package io.datajek.spring.basics.movie_recommender_system.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = {
		"io.datajek.spring.basics.movie_recommender_system.lesson10"
})
@ComponentScan(includeFilters = @ComponentScan.Filter (
		type= FilterType.REGEX,
		pattern="io.datajek.spring.basics.movie_recommender_system.lesson9.*"))
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//Retrieving singleton bean from application context
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		System.out.println(recommender);

		//Retrieving prototype bean from application context twice
		Movie m1 = appContext.getBean(Movie.class);
		System.out.println(m1);

		Movie m2 = appContext.getBean(Movie.class);
		System.out.println(m2);

	}
}
