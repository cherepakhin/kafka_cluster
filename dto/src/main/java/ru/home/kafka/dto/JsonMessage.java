package ru.home.kafka.dto;

import java.util.Objects;

public class JsonMessage {

    private long number;

    private String message;

    public JsonMessage() {
    }

    public JsonMessage(long number, String message) {
        this.number = number;
        this.message = message;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JsonMessage)) return false;
        JsonMessage that = (JsonMessage) o;
        return number == that.number && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, message);
    }
}
