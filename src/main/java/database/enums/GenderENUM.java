package database.enums;

public enum GenderENUM {
    FEMALE("F"),
    MALE("M"),
    NONE("N");

    private String option;

    GenderENUM(String option) {
        this.option = option;
    }
}