package com.valueshipr.contactapp.app.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valueshipr.contactapp.app.model.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    Contact findByNumber(String number);
}
