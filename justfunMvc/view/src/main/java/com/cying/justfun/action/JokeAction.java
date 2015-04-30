/**
 * 
 */
/**
 * @author chengying13378
 *
 */
package com.cying.justfun.action;

import org.tinygroup.weblayer.WebContext;
import org.tinygroup.weblayer.mvc.WebContextAware;
import org.tinygroup.weblayer.mvc.annotation.Controller;
import org.tinygroup.weblayer.mvc.annotation.RequestMapping;
import org.tinygroup.weblayer.mvc.annotation.ResultKey;
import org.tinygroup.weblayer.mvc.annotation.View;

import com.cying.justfun.businessinterface.IJokeBusiness;


@Controller()
@RequestMapping(value={"/hello"})
public class JokeAction implements WebContextAware{
 private WebContext webContext;
 private IJokeBusiness jokeBusiness;
 
 public void setContext(WebContext webContext) {
  this.setWebContext(webContext);
 }
 
 @RequestMapping(value={"/sayHello.do"})
 @View(value="/helloworld/helloresult.page")
 @ResultKey(value="result")
 public String sayHelloMethod(String name) {
  if (name == null) { 
   name = "world";
  }
 name = jokeBusiness.listJoke(1, 1, 1).get(0).getContent();
  return  String.format("Hello, %s", name);
 }

public IJokeBusiness getJokeBusiness() {
	return jokeBusiness;
}

public void setJokeBusiness(IJokeBusiness jokeBusiness) {
	this.jokeBusiness = jokeBusiness;
}

public WebContext getWebContext() {
	return webContext;
}

public void setWebContext(WebContext webContext) {
	this.webContext = webContext;
}
} 