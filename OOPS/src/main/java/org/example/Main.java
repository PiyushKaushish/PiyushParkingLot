package org.example;

import java.util.List;
import java.util.SimpleTimeZone;
import org.example.java.Learner;
import org.example.luxurycar.LuxuryCar;


public class Main {
    public static void main(String[] args) {
       AbstractHuman human = new AbstractHuman();
       AbstractHuman actualHuman = new ActualHuman();

       human.speak();
       actualHuman.speak();
       actualHuman.dance();
       actualHuman.hello();
    }
}