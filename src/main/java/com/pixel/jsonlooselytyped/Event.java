package com.pixel.jsonlooselytyped;

public record Event(
        String eventType,
        Message message
) {}

