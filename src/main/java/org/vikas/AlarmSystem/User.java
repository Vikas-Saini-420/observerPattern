package org.vikas.AlarmSystem;

public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(Event event) {
        System.out.println(this.name + " notified " + event);
    }
}
