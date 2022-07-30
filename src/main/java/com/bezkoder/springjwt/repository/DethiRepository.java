package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Dethi;
import com.bezkoder.springjwt.models.TrinhDo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * @author Duy
 */
public interface DethiRepository extends JpaRepository<Dethi, Long> {
}
