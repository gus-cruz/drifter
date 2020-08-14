package database.enums;

public enum StatusENUM {
    ACTIVATED("A"),
    PENDING("P"),
    HOLDING("E"),
    CANCELED("C");

    private String option;

    StatusENUM(String option) {
        this.option = option;
    }
}
