package com.cying.justfun.daoimpl;

import java.util.List;

import org.tinygroup.tinysqldsl.Delete;
import org.tinygroup.tinysqldsl.Insert;
import org.tinygroup.tinysqldsl.Update;

import com.cying.justfun.basedao.BaseDao;
import com.cying.justfun.daointerface.IJokeCategoryDao;
import com.cying.justfun.tableobject.JokeCategory;

import static com.cying.justfun.table.JokeCategoryTable.JOKE_CATEGORY;

public class JokeCategoryDao extends BaseDao  implements IJokeCategoryDao<JokeCategory> {

	public int add(JokeCategory  joke_category) {
		Insert insert = Insert.insertInto(JOKE_CATEGORY).values(JOKE_CATEGORY.joke_category_id.value(getFeildMax(JOKE_CATEGORY,JOKE_CATEGORY.joke_category_id)+1),
															JOKE_CATEGORY.parent_id.value(joke_category.getParent_id()),
															JOKE_CATEGORY.title.value(joke_category.getTitle()));
		return  super.getSession().execute(insert);
	}

	public int deleteById(int joke_category_id) {
	   Delete delete = Delete.delete(JOKE_CATEGORY).where(JOKE_CATEGORY.joke_category_id.eq(joke_category_id));
		return super.getSession().execute(delete);
	}

	public int update(JokeCategory joke_category) {
		Update update = Update.update(JOKE_CATEGORY).set(JOKE_CATEGORY.parent_id.value(joke_category.getParent_id()),
														JOKE_CATEGORY.title.value(joke_category.getTitle())).where(JOKE_CATEGORY.joke_category_id.eq(joke_category.getJoke_category_id()));
        return  super.getSession().execute(update);
	}

	public List<JokeCategory> findById(int joke_category_id, int start, int limit) {
		return getObjects(JOKE_CATEGORY,start,limit,JokeCategory.class,JOKE_CATEGORY.joke_category_id.eq(joke_category_id));
	}

	public int getTotalPageNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
