package com.streetbuzz.microservices.services;

import com.streetbuzz.microservices.services.blogs.BlogServer;
import com.streetbuzz.microservices.services.external.ExternalServer;
import com.streetbuzz.microservices.services.internal.InternalServer;
import com.streetbuzz.microservices.services.registration.RegistrationServer;
import com.streetbuzz.microservices.services.socialmedia.SocialMediaServer;
import com.streetbuzz.microservices.services.web.WebServer;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by duttas16 on 6/19/2017.
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
//        log.info("args length : "+args.length);
        String serverName="NO_VALUE";
        switch(args.length){
            case 0:
                //start all service by default
                log.info("Starting registration server..");
                RegistrationServer.main(args);
                log.info("Starting blog service..");
                BlogServer.main(args);
                log.info("Starting external service..");
                ExternalServer.main(args);
                log.info("Starting internal service..");
                InternalServer.main(args);
                log.info("Starting social service");
                SocialMediaServer.main(args);
                log.info("Starting web service");
                WebServer.main(args);
                break;
            case 1:
                serverName=args[0].toLowerCase();
                break;
            case 2:
                System.setProperty("server.port",args[1]);
            default:
                return;
        }


        if (serverName.equals("blog")) {
            BlogServer.main(args);
        } else if (serverName.equals("external")) {
            ExternalServer.main(args);
        }else if (serverName.equals("internal")) {
            InternalServer.main(args);
        } else if (serverName.equals("registration")) {
            RegistrationServer.main(args);
        }  else if (serverName.equals("social")) {
            SocialMediaServer.main(args);
        }else if (serverName.equals("web")) {
            WebServer.main(args);
        } else {
            System.out.println("Unknown server type: " + serverName);
            usage();
        }

    }

    /**
     *
     */
    protected static void usage() {
        System.out.println("Usage: java -jar ... <server-name> [server-port]");
        System.out.println(
                "     where server-name is 'reg', 'registration', " + "'accounts' or 'web' and server-port > 1024");
    }
}
