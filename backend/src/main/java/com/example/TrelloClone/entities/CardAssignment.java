package com.example.TrelloClone.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CardAssignment {
    @Id
    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;

    @Id
    @ManyToOne
    @JoinColumn(name = "cardId")
    private Card card;
}
