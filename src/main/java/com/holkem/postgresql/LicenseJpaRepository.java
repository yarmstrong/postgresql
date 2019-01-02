package com.holkem.postgresql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseJpaRepository extends JpaRepository<License, String> {
}
