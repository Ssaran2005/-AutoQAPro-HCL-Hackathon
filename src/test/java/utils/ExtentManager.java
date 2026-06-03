package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {
System.out.println("CREATING EXTENT REPORT");
            ExtentSparkReporter reporter =
        new ExtentSparkReporter(
                "ExtentReport.html");

            extent = new ExtentReports();

            extent.attachReporter(reporter);
        }

        return extent;
    }
}