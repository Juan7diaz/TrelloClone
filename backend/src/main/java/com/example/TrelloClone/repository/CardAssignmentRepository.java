package com.example.TrelloClone.repository;

import com.example.TrelloClone.entities.CardAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardAssignmentRepository extends JpaRepository<CardAssignment, UUID> {

}
