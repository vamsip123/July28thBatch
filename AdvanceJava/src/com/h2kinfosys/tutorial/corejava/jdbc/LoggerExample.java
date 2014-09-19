package com.h2kinfosys.tutorial.corejava.jdbc;

import org.apache.log4j.Logger;

public class LoggerExample {
	
private static Logger log = Logger.getLogger(LoggerExample.class);
	
	public static void main(String[] args) {
		
		if(log.isDebugEnabled()){
			log.debug("Hello Logger"); // in development
			log.debug("Hello Logger Again");
		}
		if(log.isInfoEnabled()){
			log.info("This is just for information"); // in production
		}
		
		try{
			
		}catch(Exception exp) {
			log.error("This is error"+ exp.getMessage());	
		}
		
		
		/*for(int i = 0 ; i < 50; i++){
			log.debug("");
		}*/
	}
}
