package com.example.TrelloClone.utils;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class PrimaryKeyCardAssignment implements Serializable {
    @Column(name = "memberId")
    private UUID memberId;
    @Column(name = "cardId")
    private UUID cardId;
}
