package com.pixel.designpatterns.empfactory;

import java.util.Optional;

public class CommunicationFactory {

    public Optional<Communication> getProcessedBy(String type) {
        if ("Email".equalsIgnoreCase(type)) {
            return Optional.of(new EmailCommunication());
        } else if ("mobile".equalsIgnoreCase(type)) {
            return Optional.of(new MobileCommunication());
        }
        return Optional.empty();
    }
}
