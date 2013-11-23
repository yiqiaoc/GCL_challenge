package com.ejb;

import java.util.Hashtable;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class HelloworldClient {
	public static void main(String[] args) {
		Properties jndiProperties = new Properties();
//		Hashtable jndiProperties = new Hashtable();
		jndiProperties.put("jboss.naming.client.ejb.context", true);
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		try {
			Context context = new InitialContext(jndiProperties);
			final String appName = "";
			final String moduleName = "EJB_Helloworld";
			final String distinctName = "";

			Object obj = context.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/Helloworld!com.ejb.HelloworldRemote");
			System.out.println(obj);
			HelloworldRemote hwr = (HelloworldRemote) obj;
			String say = hwr.sayHello("Yiqiao");
			System.out.println(say);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}