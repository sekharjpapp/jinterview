package com.pixel.nessdigital.singletonproto;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final ApplicationContext context;

    // Method to use the prototype bean
    public void generateCustomReport(String reportData) {
        // Get the prototype bean from the context
        Report report = context.getBean(Report.class, reportData); // Passing the data to constructor
        report.generateReport(); // Generate the report
    }
}
