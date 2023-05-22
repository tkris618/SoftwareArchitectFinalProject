package main.wctc.edu;

public class Friend extends Person {
    public Friend(String name, String attendance) {
        super(name, attendance);
    }

    @Override
    public String getDetailLine() {
        return "Friend: " + this.getName() + "Attending: " +this.getAttendance();
    }
}
