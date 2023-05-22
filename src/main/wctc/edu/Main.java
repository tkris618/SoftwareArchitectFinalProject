package main.wctc.edu;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        IOStrategy ioStrategy;
        char answer = 'P';
        switch (answer) {
            case 'P': ioStrategy = new ConsoleIOStrategy();
                break;
            default: ioStrategy = new ConsoleIOStrategy();

        }
        UI ui = UI.getInstance(ioStrategy);
        Party party = Party.getInstance(ui);
        answer = ' ';
        do {
            answer = ui.getMenuSelection();
            switch (answer) {
                case '1' -> {party.addFood();}
                case '2' -> {party.addPerson();}
            }

        } while (answer != '4');

    }
}


