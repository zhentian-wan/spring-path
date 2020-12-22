package com.example.ec;

import com.example.ec.service.TourRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication
public class ExplorecaliApplication  {

	@Autowired
	TourRatingService tourRatingService;

	public static void main(String[] args) {
		SpringApplication.run(ExplorecaliApplication.class, args);
	}

	@PostMapping("/{score}")
	@ResponseStatus(HttpStatus.CREATED)
	public void createManyTourRatings(
			@PathVariable(value = "tourId") int tourId,
			@PathVariable(value = "score") int score,
			@RequestParam("customers") Integer customers[]
	) {
		tourRatingService.rateMany(tourId, score, customers);
	}
}
