package com.example.demo.repository;

import com.example.demo.entity.Client;
import com.example.demo.projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {

    boolean existsByName(String name);

}
