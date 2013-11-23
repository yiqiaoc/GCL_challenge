package com.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Helloworld
 */
@Stateless
@LocalBean
public class Helloworld implements HelloworldRemote {

    /**
     * Default constructor. 
     */
    public Helloworld() {
        // TODO Auto-generated constructor stub
    }

    public String sayHello(String name){
    	return "Hello " + name + "!";
    }
}
