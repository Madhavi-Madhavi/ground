package com.example.bookyourslot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookyourslot.model.PreviewDetails;

public interface PreviewRepository extends JpaRepository<PreviewDetails, Integer> {

}
