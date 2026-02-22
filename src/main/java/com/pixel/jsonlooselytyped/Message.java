package com.pixel.jsonlooselytyped;

public sealed interface Message permits StringMessage, NumberMessage {

}
