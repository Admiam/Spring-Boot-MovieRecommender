package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//passing name of the filter as constructor argument
//		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		System.out.println("Constructor injection in RecommenderImplementation class");
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);


//		System.out.println("Setter injection in RecommenderImplementation2 class");
//		RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
//		String[] result = recommender2.recommendMovies("Finding Dory");
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));


		System.out.println("Setter injection in RecommenderImplementation2 class");
		RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
		result = recommender2.recommendMovies("Finding Dory");
		//display results
		System.out.println(Arrays.toString(result));
	}

}
