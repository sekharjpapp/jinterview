package com.pixel.jsonlooselytyped;

public class SealedInterfaceTest {
    public static void main(String[] args) {

        Event stringEvent = new Event(
                "WATCH",
                new StringMessage("Started watching")
        );

        Event numberEvent = new Event(
                "WATCH_TIME",
                new NumberMessage(120)
        );

        processEvent(stringEvent);
        processEvent(numberEvent);
    }

    private static void processEvent(Event event) {

        System.out.println("Event Type: " + event.eventType());

        Message msg = event.message();

        // Java 17 pattern matching for switch
        switch (msg) {
            case StringMessage sm ->
                    System.out.println("Message (String): " + sm.value());

            case NumberMessage nm ->
                    System.out.println("Message (Number): " + nm.value());
        }

        System.out.println("----------");
    }

}
