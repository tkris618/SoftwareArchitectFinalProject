package main.wctc.edu;

public class Person {

    private String name;
    private String attendance;
    private String detailLine;

    public Person(String name, String attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetailLine() {
        return detailLine;
    }

    public void setDetailLine(String detailLine) {
        this.detailLine = detailLine;
    }
}
