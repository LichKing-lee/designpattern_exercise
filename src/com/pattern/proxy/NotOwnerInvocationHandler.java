package com.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NotOwnerInvocationHandler implements InvocationHandler {
	PersonBean person;
	
	public NotOwnerInvocationHandler(PersonBean person) {
		// TODO Auto-generated constructor stub
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		try{
			if(method.getName().equals("setHotOrNotRating")){
				return method.invoke(person, args);
			}else{
				throw new IllegalAccessException();
			}
		}catch(InvocationTargetException e){
			e.printStackTrace();
		}
		
		return null;
	}

}
