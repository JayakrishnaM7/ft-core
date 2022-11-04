package com.bian.core.process.adapters;


import com.bian.core.process.restprocessors.impl.*;
import com.bian.core.process.restutility.Utility;
import com.bian.core.process.model.error.ApiError;
import com.bian.core.process.model.error.GenericError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class Notifications implements JavaDelegate{

    @Autowired
    private Utility utility;

    @Autowired
    private NotificationRestProcessor restProcessor;

    private final static Logger LOGGER = Logger.getLogger(Notifications.class.getName());

     @Override
    public void execute(DelegateExecution execution) throws Exception {
         LOGGER.info("Adapter execution started");
         String request = (String) execution.getVariable("jsonRequest");
         Object response = utility.processMsg(request, restProcessor);
         if(response instanceof ApiError ||  response instanceof GenericError){
            //Failure Path
            throw new RuntimeException("Error occurred in the adapter:"+Notifications.class.getName());
         }else{
            //success Path - enrich or transform the respone object here
         }
    }

}