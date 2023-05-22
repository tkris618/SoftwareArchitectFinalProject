package main.wctc.edu;

public class PersonList {
    private PersonList() {

    }
    public static Person getPerson (String name, String attendance, PersonType personType) {
        switch (personType) {
            case FRIEND -> {return new Friend(name, attendance);}
            case FAMILY -> {return new Family(name, attendance);}
            default -> {return null;}
        }
    }
}
