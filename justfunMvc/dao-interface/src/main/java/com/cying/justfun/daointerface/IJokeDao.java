package com.cying.justfun.daointerface;

import java.util.List;

public interface IJokeDao <T>{
        public int add(T joke);
        public int deleteById(int joke_id);
        public int  update(T joke);
        public List<T>  findByCategory(int joke_category_id, int start,int limit);
        public List<T> findById(int joke_id, int start ,int limit );
        public int  getTotalPageNum();
}
