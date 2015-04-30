package com.cying.justfun.daoimpl;

import java.util.List;

import org.tinygroup.tinysqldsl.Delete;
import org.tinygroup.tinysqldsl.Insert;
import org.tinygroup.tinysqldsl.Update;

import com.cying.justfun.basedao.BaseDao;
import com.cying.justfun.daointerface.IJokeDao;
import com.cying.justfun.tableobject.Joke;

import static com.cying.justfun.table.JokeTable.JOKE;

public class JokeDao extends BaseDao  implements IJokeDao<Joke> {

	public int add(Joke joke) {
       Insert insert = Insert.insertInto(JOKE).values(JOKE.joke_id.value(getFeildMax(JOKE,JOKE.joke_id)+1) ,
    		   																		JOKE.joke_category_id.value(joke.getJoke_category_id()),
    		   																		JOKE.content.value(joke.getContent()),
    		   																		 JOKE.title.value(joke.getTitle())
    		   																		 );
		return super.getSession().execute(insert);
	}

	public int deleteById(int joke_id) {
		Delete delete = Delete.delete(JOKE).where(JOKE.joke_id.eq(joke_id));
		return super.getSession().execute(delete);
	}

	public int update(Joke joke) {
		Update update = Update.update(JOKE).set( JOKE.joke_category_id.value(joke.getJoke_category_id()),
																					JOKE.content.value(joke.getContent()),
																					JOKE.title.value(joke.getTitle())
																					).where(JOKE.joke_id.eq(joke.getJoke_id()));
		return super.getSession().execute(update);
	}

	public List<Joke> findByCategory(int joke_category_id, int start, int limit) {
		return getObjects(JOKE,start,limit,Joke.class,JOKE.joke_category_id.eq(joke_category_id));
	}

	public List<Joke> findById(int joke_id, int start, int limit) {
		return getObjects(JOKE,start,limit,Joke.class,JOKE.joke_id.eq(joke_id));
	}

	public int getTotalPageNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
