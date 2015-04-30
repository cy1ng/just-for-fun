package com.cying.justfun.daointerface;

import java.util.List;

public interface IJokeCategoryDao <T>{
    public int add(T joke_category);
    public int deleteById(int joke_category_id);
    public int  update(T joke_category);
    public List<T> findById(int joke_category_id, int start ,int limit );
    public int  getTotalPageNum();
}
