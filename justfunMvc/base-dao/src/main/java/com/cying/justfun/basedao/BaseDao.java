package com.cying.justfun.basedao;
import java.util.List;

import org.tinygroup.tinysqldsl.Delete;
import org.tinygroup.tinysqldsl.Select;
import org.tinygroup.tinysqldsl.base.Column;
import org.tinygroup.tinysqldsl.base.Condition;
import org.tinygroup.tinysqldsl.base.Table;
import org.tinygroup.tinysqldsl.extend.MysqlSelect;

public class BaseDao extends Dao {
	public <T> T getObject(int id,Table table, Column column,Class<T> requiredType) {
		// TODO Auto-generated method stub
		Select select=Select.selectFrom(table).where(column.eq(id));
		return getSession().fetchOneResult(select, requiredType);
	}

	public <T> List<T> getObjects(Table table,int start,int limit,Class<T> requiredType) {
		// TODO Auto-generated method stub
		Select select=MysqlSelect.selectFrom(table).limit(start, limit);
		return getSession().fetchList(select, requiredType);
	}

	public int deleteObject(Table table ,Condition condition) {
		// TODO Auto-generated method stub
		Delete delete=Delete.delete(table).where(condition);
		return getSession().execute(delete);
	}

	public <T> List<T> getObjects(Table table, Class<T> requiredType) {
		// TODO Auto-generated method stub
		Select select=Select.selectFrom(table);
		return getSession().fetchList(select, requiredType);
	}

	public int getTotalPages(Table table ,Column column,int limit) {
		// TODO Auto-generated method stub
		Select select=Select.select(column.count()).from(table);
		int count=getSession().fetchOneResult(select, Integer.class);
		return (int)(count/limit)+ ((count%limit==0)?0:1 );
	}

	public <T> List<T> getObjects(Table table, int start, int limit,
			Class<T> requiredType, Condition condition) {
		// TODO Auto-generated method stub
		Select select=MysqlSelect.selectFrom(table).where(condition).limit(start, limit);
		return getSession().fetchList(select, requiredType);
	}

	public int getTotalPages(Table table, Column column, int limit,
			Condition condition) {
		// TODO Auto-generated method stub
		Select select=Select.select(column.count()).from(table).where(condition);
		int count=getSession().fetchOneResult(select, Integer.class);
		return (int)(count/limit)+ ((count%limit==0)?0:1 );
	}

	public int getFeildMax(Table table, Column column) {
		// TODO Auto-generated method stub
		Select select=Select.select(column.max()).from(table);
		return getSession().fetchOneResult(select, Integer.class);
	}

	public <T> List<T> getSearchObjects(Table table, int start, int limit,
			Class<T> requiredType, Condition condition) {
		// TODO Auto-generated method stub
		Select select=MysqlSelect.selectFrom(table).where(condition).limit(start, limit);
		return getSession().fetchList(select, requiredType);
	}

	public int getSearchTotalpages(Table table, Column column, int limit,
			Condition condition) {
		// TODO Auto-generated method stub
		Select select=Select.select(column.count()).from(table).where(condition);
		int count=getSession().fetchOneResult(select, Integer.class);
		return (int)(count/limit)+ ((count%limit==0)?0:1 );
	}

	public <T> List<T> getObjects(Table table, Class<T> requiredType,Condition condition) {
		    Select select = MysqlSelect.selectFrom(table).where(condition);
		return  getSession().fetchList(select, requiredType);
	}
	
	public <T> T getObject(Table table, Class<T> requiredType,Condition condition){
		   Select select = MysqlSelect.selectFrom(table).where(condition);
		  return getSession().fetchOneResult(select, requiredType);
	}

}
