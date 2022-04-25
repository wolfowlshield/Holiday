package org.vashonsd;

import java.time.LocalDateTime;
import java.util.Objects;

public class Holiday {

    int month;
    int dayOfMonth;
    String name;
    String description;
    boolean isFederallyRecognized;
    String celebration;

    public Holiday(int month, int dayOfMonth, String name, String description, boolean isFederallyRecognized, String celebration) {
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.name = name;
        this.description = description;
        this.isFederallyRecognized = isFederallyRecognized;
        this.celebration = celebration;
    }

    public Holiday(int month, int dayOfMonth, String name, String description, boolean isFederallyRecognized) {
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.name = name;
        this.description = description;
        this.isFederallyRecognized = isFederallyRecognized;
    }

    public String getCelebration() {
        return celebration;
    }
    public void setCelebration(String celebration) {
        this.celebration = celebration;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }
    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFederallyRecognized() {
        return isFederallyRecognized;
    }
    public void setFederallyRecognized(boolean federallyRecognized) {
        isFederallyRecognized = federallyRecognized;
    }

    public boolean isToday() {
        LocalDateTime now = LocalDateTime.now();
        return (now.getMonthValue() == month && now.getDayOfMonth() == dayOfMonth);
    }

    public String celebrate() {
        if (Objects.isNull(celebration)) {
            return "Happy " + name + "!";
        }
        return celebration;
    }
}
