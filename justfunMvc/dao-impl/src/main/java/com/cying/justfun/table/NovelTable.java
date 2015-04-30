package com.cying.justfun.table;

import org.tinygroup.tinysqldsl.base.Alias;
import org.tinygroup.tinysqldsl.base.Column;
import org.tinygroup.tinysqldsl.base.Table;

public class NovelTable extends Table {
	 public static final NovelTable NOVEL =  new NovelTable();
     public final Column novel_id = new Column(this,"novel_id");
     public final Column novel_category_id = new Column(this,"novel_category_id");
     public final Column content = new Column(this,"content");
     public final Column title = new Column(this,"title");
     
     private NovelTable() {
	        super("novel");
	    }

		public void setAlias(String string) {
			this.setAlias(new Alias(string));
		}
}
