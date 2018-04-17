package concerttours.daos;

import java.util.Date;
import java.util.List;

import de.hybris.platform.concerttours.model.NewsModel;

public interface NewsDAO {
	List<NewsModel> getNewsOfTheDay(Date date);
}
