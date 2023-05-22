package main.wctc.edu;

import java.util.List;

public class UI {

    private static UI ui;

    private IOStrategy ioStrategy;

    private UI(IOStrategy ioStrategy){
        this.ioStrategy = ioStrategy;
    }

    public static UI getInstance(IOStrategy ioStrategy) {
        if (ui == null) {
            ui = new UI(ioStrategy);
        }
        return ui;
    }

    public char getMenuSelection() {
        ioStrategy.outputLine("1. Add party food/snacks");
        ioStrategy.outputLine("2. Add decorations");
        ioStrategy.outputLine("3. Add participating friends/family");
        ioStrategy.outputLine("4. Reviews");
        return ioStrategy.inputCharacter();
    }

    public char getSnackTypeMenu() {
        ioStrategy.outputLine("1. Candy");
        ioStrategy.outputLine("2. Cake/baked goods");
        ioStrategy.outputLine("3. Savory foods");
        ioStrategy.outputLine("4. Adult beverages");

        return ioStrategy.inputCharacter();
    }

    public char getDecorations() {
        ioStrategy.outputLine("Enter decorations needed: ");
        return ioStrategy.inputCharacter();
    }

    public String getName() {
        ioStrategy.outputLine("Please enter name of person attending:");
        return ioStrategy.inputString();
    }

    public String getAttendance() {
        ioStrategy.outputLine("Will you be attending the hosted event? Y/N?");
        return ioStrategy.inputString();
    }
    public PersonType getPersonType() {
        ioStrategy.outputLine("What is your relation to the parties host?\nOptions: (F)amily or (A)cquaintence/friend");
        switch (ioStrategy.inputCharacter()) {
            case 'F' -> {return PersonType.FAMILY;}
            default -> {return PersonType.FAMILY;}
        }
    }
    public void runReport(List<Person> review){
        for (Person p : review){
            ioStrategy.outputLine(p.getDetailLine());
        }
    }

    public void listPersons(List<Person> review){
        for (int i = 0; i < review.size(); i++) {
            if(review.get(i) instanceof Family family) {
                ioStrategy.outputLine((i + 1) + ". " + family);
            }
        }
    }

    public int getFamilySelection(List<Person> review) {
        listPersons(review);
        return Character.getNumericValue(ioStrategy.inputCharacter()) - 1;
    }

}
