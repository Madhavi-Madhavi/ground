package com.example.bookyourslot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookyourslot.model.Dashboard;

public interface DashboardRepository extends JpaRepository<Dashboard, Integer> {

}
