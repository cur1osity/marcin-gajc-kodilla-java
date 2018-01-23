package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private String lastMessage;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTaskQueue studentTaskQueue) {
        System.out.println("Mentor " + mentorName + " was notified by student "
                + studentTaskQueue.getStudentName() + ": ");

        lastMessage = studentTaskQueue.getMessages().get(studentTaskQueue.getMessages().size() -1);

        System.out.println(lastMessage);
        updateCount++;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
