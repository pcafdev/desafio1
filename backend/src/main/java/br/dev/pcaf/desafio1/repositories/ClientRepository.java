package br.dev.pcaf.desafio1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.pcaf.desafio1.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
