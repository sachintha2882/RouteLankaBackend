package com.example.RouteLanka.Repository;
import com.example.RouteLanka.Model.BusOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusOwnerRepo extends JpaRepository<BusOwner, Long> {

}
