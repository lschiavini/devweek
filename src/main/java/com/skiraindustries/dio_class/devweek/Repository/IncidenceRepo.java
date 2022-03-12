package com.skiraindustries.dio_class.devweek.Repository;

import com.skiraindustries.dio_class.devweek.Entity.Incidence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenceRepo extends JpaRepository<Incidence, Long> {
}
