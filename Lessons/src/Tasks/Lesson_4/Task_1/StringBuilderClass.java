package Tasks.Lesson_4.Task_1;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class StringBuilderClass implements Subject {

   private List<Observer> observers;
   private StringBuilder string;

   public StringBuilderClass() {
       observers = new ArrayList<>();
   }

   @Override
   public void attachObserver(Observer observer) {
       observers.add(observer);
   }

   @Override
   public void removeObservers(Observer observer) {
       observers.remove(observer);
   }

   @Override
   public void notifyObservers() {
       for (Observer observer : observers) {
           observer.update(string);
       }
   }

   public void newString(StringBuilder string) {
       this.string = string;
       notifyObservers();
   }

   public void getString() {
       System.out.println("Current string is:" + " " + string);
   }



}
