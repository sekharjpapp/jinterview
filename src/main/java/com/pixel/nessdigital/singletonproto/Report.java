package com.pixel.nessdigital.singletonproto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // Indicating this bean is a prototype
public class Report {

    private String reportData;

    // Constructor to initialize the report with data
    public Report(String reportData) {
        this.reportData = reportData;
    }

    public void generateReport() {
        System.out.println("Generating report with data: " + reportData);
    }

    public String getReportData() {
        return reportData;
    }
}
