package com.coralogix.sdk;

import api.CoralogixLogger;

public class ExampleApp
{
    public static void main(String[] args)
    {
        String privateKey = System.getenv("CORALOGIX_PRIVATE_KEY");
        String appName = "coralogix-sdk";
        String subSystem = "example";
    
        CoralogixLogger.configure(privateKey, appName, subSystem);
        CoralogixLogger logger = new CoralogixLogger(ExampleApp.class.toString());

        logger.info("Test log line");
    }
}
