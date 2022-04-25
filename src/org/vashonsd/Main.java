package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        Holiday christmas = new Holiday(12, 25, "Christmas","A day to celebrate the birth of Jesus H. Christ", true, "Merry Christmas!");
        Holiday mothers = new Holiday(5, 8, "Mother's Day", "To celebrate all Mothers", true);
        Holiday skyesBirthday = new Holiday(4, 4, "Skye's Birthday", "The day that Skye was Born", false, "Happy Birthday Skye!");

        if (christmas.isToday()) {
            System.out.println(christmas.celebrate());
        }

        if (mothers.isToday()) {
            System.out.println(mothers.celebrate());
        }

        System.out.println(skyesBirthday.celebrate());

    }
}
