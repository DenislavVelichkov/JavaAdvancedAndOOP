package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;
import JavaOOP.Solid_13.Exercise.interfaces.Appender;
import JavaOOP.Solid_13.Exercise.interfaces.Logger;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    private void logAll(String time, String massege, ReportLevel reportLevel) {
        for (Appender appender : this.appenders) {
            appender.append(time, massege, reportLevel);

        }
    }
    public MessageLogger(Appender... appenders) {
        this.appenders = appenders;
    }

    @Override
    public void log(String time, String message, ReportLevel reportLevel) {
        this.logAll(time, message, ReportLevel.INFO);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Logger info");
        sb.append(System.lineSeparator());

        for (Appender appender : this.appenders) {
            sb.append(System.lineSeparator());
            sb.append(appender.toString());
        }

        return sb.toString();
    }
}
