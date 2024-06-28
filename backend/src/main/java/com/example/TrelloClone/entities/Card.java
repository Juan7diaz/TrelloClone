package com.example.TrelloClone.entities;

import com.example.TrelloClone.utils.ColumnType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    private ColumnType columnType;

    @ManyToOne
    @JoinColumn(name = "autor")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "boardId")
    private Board board;

    @OneToMany(mappedBy = "card", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<CardAssignment> cardAssignments;
}
