package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTaskQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> messages;
    private final String studentName;

    public StudentTaskQueue(final String studentName) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addMessage(String message){
        messages.add(message);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
