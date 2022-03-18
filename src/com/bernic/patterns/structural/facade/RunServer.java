package com.bernic.patterns.structural.facade;

public class RunServer {

    public static void main(String[] args) {
        if(!(args.length == 0) && args[0].equals("useFacade")){
            startAndStopServerWithFacade();
        } else {
            startAndStopServerWithoutFacade();
        }
    }

    private static void startAndStopServerWithFacade(){
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facade = new ScheduleServerFacade(scheduleServer);

        facade.startServer();
        doSomeWork();
        facade.stopServer();
    }


    private static void startAndStopServerWithoutFacade(){
        ScheduleServer scheduleServer = new ScheduleServer();
        //start server
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();

        doSomeWork();

        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();

    }

    private static void doSomeWork(){
        System.out.println("Start working......");
        System.out.println("After work done.........");
    }

}
