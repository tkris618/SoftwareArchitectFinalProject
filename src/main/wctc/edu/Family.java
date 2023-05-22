package main.wctc.edu;

import java.util.ArrayList;
import java.util.List;

public class Family extends Person{

    private List<Food> foods;

    public Family(String name, String attendance){
        super (name, attendance);

        this.foods = new ArrayList<>();
    }

    @Override
    public String getDetailLine() {
        String line = "Family member: " + this.getName() + " Attending: " +this.getAttendance();

        return line;
    }

    public void addFood(char answer) {
        switch (answer) {
            case '1' -> foods.add(new BakedGoods());
            case '2' -> foods.add(new Candy());
            case '3' -> foods.add(new Savory());
            case '4' -> foods.add(new AdultDrinks());
        }
    }
}
