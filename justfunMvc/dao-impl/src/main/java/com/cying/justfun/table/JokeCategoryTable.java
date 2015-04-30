package com.cying.justfun.table;

import org.tinygroup.tinysqldsl.base.Alias;
import org.tinygroup.tinysqldsl.base.Column;
import org.tinygroup.tinysqldsl.base.Table;

public class JokeCategoryTable extends Table {

	 public static final JokeCategoryTable JOKE_CATEGORY =  new JokeCategoryTable();
     public final Column joke_category_id = new Column(this,"joke_category_id");
     public final Column title = new Column(this,"title");
     public final Column parent_id = new Column(this,"parent_id");

     
     private JokeCategoryTable() {
	        super("joke_category");
	    }

		public void setAlias(String string) {
			this.setAlias(new Alias(string));
		}
		
}
