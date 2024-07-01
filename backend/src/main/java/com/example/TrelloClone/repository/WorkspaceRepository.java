package com.example.TrelloClone.repository;

import com.example.TrelloClone.entities.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface WorkspaceRepository extends JpaRepository<Workspace, UUID> {
    List<Workspace> findByNameContainingIgnoreCaseAndUserId(String name, UUID ownerId);
    List<Workspace> findByUserId(UUID ownerId);
}
