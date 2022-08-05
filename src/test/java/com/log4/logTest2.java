package com.log4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class logTest2 {
	
	

		public static Logger logger=	(Logger) LogManager.getLogger(logTest2.class.getName());
	
		
		public static void main(String[] args) throws Exception {
			
			
			
			logger.info("hello");                
			logger.fatal("bye");
			logger.trace("world");
			logger.error("mjbdj");
			logger.info("hello");                
			logger.fatal("bye");
			logger.trace("world");
			logger.error("mjbdj");
			logger.info("hello");                
			logger.fatal("bye");
			logger.trace("world");
			logger.error("mjbdj");
			
			
		}
	}

