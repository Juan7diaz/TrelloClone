package com.example.TrelloClone.entities;

import com.example.TrelloClone.utils.PrimaryKeyCardAssignment;
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
    @EmbeddedId
    private PrimaryKeyCardAssignment id;

    @ManyToOne
    @MapsId("memberId")
    @JoinColumn(name = "memberId")
    private Member member;

    @ManyToOne
    @MapsId("cardId")
    @JoinColumn(name = "cardId")
    private Card card;
}
