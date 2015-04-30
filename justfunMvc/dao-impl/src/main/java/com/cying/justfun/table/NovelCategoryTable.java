package com.cying.justfun.table;

import org.tinygroup.tinysqldsl.base.Alias;
import org.tinygroup.tinysqldsl.base.Column;
import org.tinygroup.tinysqldsl.base.Table;

public class NovelCategoryTable extends Table {

	 public static final NovelCategoryTable NOVEL_CATEGORY =  new NovelCategoryTable();
    public final Column novel_category_id = new Column(this,"novel_category_id");
    public final Column title = new Column(this,"title");
    public final Column parent_id = new Column(this,"parent_id");

    
    private NovelCategoryTable() {
	        super("novel_category");
	    }

		public void setAlias(String string) {
			this.setAlias(new Alias(string));
		}
}
