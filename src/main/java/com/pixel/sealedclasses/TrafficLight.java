package com.pixel.sealedclasses;

public sealed interface TrafficLight permits RedLight,YellowLight, GreenLight, BrokenLight{ }

 final class RedLight implements TrafficLight {}
 final class YellowLight implements TrafficLight {}
 final class GreenLight implements TrafficLight {}
