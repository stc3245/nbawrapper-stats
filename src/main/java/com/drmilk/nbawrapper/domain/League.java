package com.drmilk.nbawrapper.domain;

import org.apache.http.HttpResponse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.drmilk.nbawrapper.config.AppConfig;
import com.drmilk.nbawrapper.domain.utils.scoreboard.Scoreboard;
import com.drmilk.nbawrapper.exception.ScoreboardNotFoundException;
import com.drmilk.nbawrapper.utils.QueryManager;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author Antoine Guay
 *
 */
public class League {

	private static AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	private static String sourceBaseUrl = (String) context.getBean("sourceBaseUrl");

	private static ObjectMapper objectMapper = (ObjectMapper) context.getBean("objectMapper");

	public static Scoreboard getScoreboard(Integer day, Integer month, Integer year) throws ScoreboardNotFoundException {
		try {
			HttpResponse scoreboardResponse = QueryManager.getHttpResponse(
					sourceBaseUrl + "/" + year.toString() + month.toString() + day.toString() + "/scoreboard.json");
			return objectMapper.readValue(scoreboardResponse.getEntity().getContent(), Scoreboard.class);
		} catch (Exception e) {
			throw new ScoreboardNotFoundException(
					"Could not find a scoreboard for the date " + month + " " + day + "th " + year);
		}
	}

	public static void getBoxscore(int day, int month, int year, int gameId) {

	}
}
