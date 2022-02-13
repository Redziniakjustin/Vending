package com.techelevator.view;


import java.io.*;
import java.time.LocalDateTime;
import java.util.logging.Logger;
import java.io.File;

public class vLogger {

    public Logger logger;
    private File log;
    public vLogger(String logFile) {
        this.log = new File(logFile);
    }

/*
    private String newFileName = "Log.txt";
    private File loggingFile = new File(newFileName);
*/
/*

private void newFile () {
    try {loggingFile.createNewFile();
    } catch (IOException e){}
*/

    public void log(String string) throws Exception{

        try(PrintWriter pw = new PrintWriter(new FileOutputStream(log, true)))
        {pw.println(LocalDateTime.now()) ;
        }catch (FileNotFoundException fnf){
            Exception x = new Exception("Log File Error");
            throw x;
        }
        }



}



}
