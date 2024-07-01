package com.example.TrelloClone.repository;

import com.example.TrelloClone.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {
    List<Card> findByBoardId(UUID boardId);
}
