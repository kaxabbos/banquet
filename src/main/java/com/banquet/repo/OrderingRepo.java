package com.banquet.repo;

import com.banquet.model.Ordering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderingRepo extends JpaRepository<Ordering, Long> {
    List<Ordering> findAllByNote_Id(Long noteId);
}
