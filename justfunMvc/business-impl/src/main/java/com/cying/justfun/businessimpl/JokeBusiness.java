package com.cying.justfun.businessimpl;

import java.util.List;

import com.cying.justfun.businessinterface.IJokeBusiness;
import com.cying.justfun.daointerface.IJokeCategoryDao;
import com.cying.justfun.daointerface.IJokeDao;
import com.cying.justfun.tableobject.Joke;

public class JokeBusiness implements IJokeBusiness {
    
	private  IJokeDao jokeDao;
	private IJokeCategoryDao jokeCategoryDao;
	
	public List<Joke> listJoke(int joke_category_id, int page, int limit) {
		return jokeDao.findByCategory(joke_category_id,( page-1)*limit, limit);
	}

	public IJokeDao getJokeDao() {
		return jokeDao;
	}

	public void setJokeDao(IJokeDao jokeDao) {
		this.jokeDao = jokeDao;
	}

	public IJokeCategoryDao getJokeCategoryDao() {
		return jokeCategoryDao;
	}

	public void setJokeCategoryDao(IJokeCategoryDao jokeCategoryDao) {
		this.jokeCategoryDao = jokeCategoryDao;
	}

}
