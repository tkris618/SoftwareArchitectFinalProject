package main.wctc.edu;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private static Party party;

    private List<Person> review;

    private UI ui;

    private Party(UI ui){
        this.review = new ArrayList<>();
        this.ui = ui;
    }

    public static Party getInstance(UI ui){
        if (party == null){
            party = new Party(ui);
        }
        return party;
    }

    public List<Person> getReview(){return null;}

    public void addPerson(){
        PersonType personTypeChoice = ui.getPersonType();
        String name = ui.getName();
        String attendance = ui.getAttendance();
        review.add(PersonList.getPerson(name, attendance,personTypeChoice));
    }
    //public void produceReviews() {ui.runReport(review);}

    public void addFood() {
        int answer = ui.getFamilySelection(review);
        ((Family)review.get(answer)).addFood(ui.getSnackTypeMenu());
    }

}
