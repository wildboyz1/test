package dev.mn.test.enums;

public enum EmployeeStatus {
    STILL_WORKING(1), STOP(0);
    private int value;
    EmployeeStatus(int value) { this.value = value; }

}
