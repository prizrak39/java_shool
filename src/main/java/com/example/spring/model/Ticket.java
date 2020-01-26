package com.example.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private UUID id;

    private LocalDateTime localDateTime;

    /**
     * Отправка
     */
    private String sending;

    /**
     * Пункт прибытия
     */
    private String destination;

    /**
     * Авиакомпания
     */
    private String airline;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getSending() {
        return sending;
    }

    public void setSending(String sending) {
        this.sending = sending;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
