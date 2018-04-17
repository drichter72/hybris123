package concerttours.service;

import java.util.Date;
import java.util.List;

import de.hybris.platform.concerttours.model.NewsModel;

public interface NewsService {
	List<NewsModel> getNewsOfTheDay(Date date);
}
