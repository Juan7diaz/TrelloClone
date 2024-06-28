package com.example.TrelloClone.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "workspaceId")
    private Workspace workspace;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Card> cards;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<CardAssignment> cardAssignments;
}
