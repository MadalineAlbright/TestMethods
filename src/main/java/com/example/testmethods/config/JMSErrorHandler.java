package com.example.testmethods.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

/*
 * Jeremiah Basil Aura
 * KCB Group - BSS
 * VOOMA C2B
 * Date: 25th August 2022
 */
@Service
public class JMSErrorHandler implements ErrorHandler{
	
	private static final Logger logger = LoggerFactory.getLogger(JMSErrorHandler.class);

	@Override
    public void handleError(Throwable t) {
		logger.error(t.getMessage());
		logger.error(t.getLocalizedMessage());
    }
	
}
