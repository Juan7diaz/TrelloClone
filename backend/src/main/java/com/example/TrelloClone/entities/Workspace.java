package com.example.TrelloClone.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @CreationTimestamp
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private User user;

    @OneToMany(mappedBy = "workspace", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Board> boards;

    @OneToMany(mappedBy = "workspace", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Member> members;
}
