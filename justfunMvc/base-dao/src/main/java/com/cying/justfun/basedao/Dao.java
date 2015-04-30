package com.cying.justfun.basedao;

import javax.sql.DataSource;
import org.tinygroup.beancontainer.BeanContainerFactory;
import org.tinygroup.jdbctemplatedslsession.SimpleDslSession;
import org.tinygroup.tinysqldsl.DslSession;
public class Dao {

	private DataSource dataSource;
	private static DslSession session;
	public DslSession getSession(){
		if(session==null){
			if(dataSource==null){
				dataSource=BeanContainerFactory.getBeanContainer(getClass().getClassLoader()).getBean("dataSource");
			}
			session= new SimpleDslSession(dataSource);
			return session;
		}
		return session;
	}
	
}