package com.cying.justfun.table;

import org.tinygroup.tinysqldsl.base.Alias;
import org.tinygroup.tinysqldsl.base.Column;
import org.tinygroup.tinysqldsl.base.Table;

public class JokeTable extends Table {

	 public static final JokeTable JOKE =  new JokeTable();
     public final Column joke_id = new Column(this,"joke_id");
     public final Column joke_category_id = new Column(this,"joke_category_id");
     public final Column content = new Column(this,"content");
     public final Column title = new Column(this,"title");
     
     private JokeTable() {
	        super("joke");
	    }

		public void setAlias(String string) {
			this.setAlias(new Alias(string));
		}
}
