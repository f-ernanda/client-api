package com.fernanda.client.services;

import com.fernanda.client.dto.ClientDTO;
import com.fernanda.client.entities.Client;
import com.fernanda.client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
    }

    @Transactional
    public ClientDTO insert(ClientDTO dto) {
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO dto) {
    }

    @Transactional
    public void delete(Long id) {
    }
}
