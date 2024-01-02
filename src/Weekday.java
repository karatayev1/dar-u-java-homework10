public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay(Weekday weekday) {
        boolean isWeekDay;
        switch (weekday) {
            case SATURDAY -> isWeekDay = false;
            case SUNDAY -> isWeekDay = false;
            default -> isWeekDay = true;
        }
        return isWeekDay;
    }

    public boolean isHoliday(Weekday weekday) {
        boolean isWeekDay;
        switch (weekday) {
            case SATURDAY -> isWeekDay = true;
            case SUNDAY -> isWeekDay = true;
            default -> isWeekDay = false;
        }
        return isWeekDay;
    }
}
