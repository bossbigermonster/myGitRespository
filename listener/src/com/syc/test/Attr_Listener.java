package com.syc.test;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class Attr_Listener implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		String name=event.getName();
		Object value=event.getValue();
		System.out.println("ServletContextAttribute-add   attr-name: "+name+"\tattr-value: "+value);
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println(event.getName()+" have been removed");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		String name=event.getName();
		System.out.println(name+"  have changed!!!!  turn to "+event.getValue());
	}
	
}
