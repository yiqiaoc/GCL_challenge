package com.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloworldRemote {
	public String sayHello(String name);
}
