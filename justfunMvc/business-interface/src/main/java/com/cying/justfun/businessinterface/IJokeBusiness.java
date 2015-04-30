package com.cying.justfun.businessinterface;

import java.util.List;

import com.cying.justfun.tableobject.Joke;

public interface IJokeBusiness {
   public  List<Joke>listJoke(int joke_category_id,int page,int limit);
}
