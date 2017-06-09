package com.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloBean implements HelloBeanRemote {

	@Override
	public String sayHello() {
		return "HelloEJB";
	}

	

}
