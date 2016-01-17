package com.pattern.proxy;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
	public static void main(String[] args) {
		
	}
	
	public MatchMakingTestDrive(){
		
	}
	
	public void drive(){
		
	}
	
	public PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(	
								person.getClass().getClassLoader(), 
								person.getClass().getInterfaces(),
								new OwnerInvocationHandler(person)
							);
	}

	public PersonBean getNotOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(	
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(),
				new NotOwnerInvocationHandler(person)
				);
	}
}
