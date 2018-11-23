package com.swati;


import org.apache.log4j.Logger;

public class LoggerMain {

    static Logger log = Logger.getLogger(LoggerMain.class);
    public static void main(String[] args) {


        log.info("Info Message");
        log.debug("Debug Message");
        log.error("Error Message");
        log.fatal("Exception Occurred" , new RuntimeException("Dummy"));
        //log.all("Every message"); - All will not work as it is above in the heirarchy - ALL<TRACE<DEBUG<INFO<WARN<ERROR<FATAL<OFF
    }
}
