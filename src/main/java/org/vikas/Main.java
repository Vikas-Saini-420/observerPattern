package org.vikas;

import org.vikas.AlarmSystem.AlarmSystem;
import org.vikas.AlarmSystem.User;
import org.vikas.AlarmSystem.Event;

public class Main {
    public static void main(String[] args) {
        AlarmSystem alarmSystem = new AlarmSystem();
        User user1 = new User("Vikas");
        User user2 = new User("Raj");
        User user3 = new User("Amit");
        User user4 = new User("Ram");
        User user5 = new User("Sita");

        alarmSystem.registerObserver(user1);
        alarmSystem.registerObserver(user2);
        alarmSystem.registerObserver(user3);
        alarmSystem.registerObserver(user4);
        alarmSystem.registerObserver(user5);
        alarmSystem.notifyObservers(Event.INTRUSION);
        alarmSystem.removeObserver(user5);
        alarmSystem.notifyObservers(Event.FIRE);
        alarmSystem.removeObserver(user4);
        alarmSystem.notifyObservers(Event.ACCIDENT);
        alarmSystem.removeObserver(user3);
        alarmSystem.notifyObservers(Event.EMERGENCY);
        alarmSystem.removeObserver(user2);
        alarmSystem.notifyObservers(Event.LEAK);
    }
}