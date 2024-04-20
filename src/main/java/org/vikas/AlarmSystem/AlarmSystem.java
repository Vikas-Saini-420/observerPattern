package org.vikas.AlarmSystem;

import java.util.List;

public class AlarmSystem implements Subject {

   private List<Observer> observers;

   public AlarmSystem() {
      observers = new java.util.ArrayList<Observer>();
   }

   public void registerObserver(Observer user) {
      observers.add(user);
   }

   public void removeObserver(Observer user) {
      observers.remove(user);
   }

   public void notifyObservers(Event event) {
      for (Observer observer : observers) {
         observer.update(event);
      }
   }
}
