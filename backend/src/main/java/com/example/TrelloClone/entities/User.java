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
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @Column(unique = true)
    private String email;
    private Integer phone;
    @Column(unique = true)
    private String username;
    private String password;
    // Assign automatically the current date
    @CreationTimestamp
    private LocalDateTime createdAt;
    // Another option
    /*
    * private LocalDateTime createdAt;
    * @PrePersist
    * protected void onCreate(){
    *   createdAt = LocalDateTime.now();
    * }
    * */

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Workspace> workspaces;
    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Member> members;
}
