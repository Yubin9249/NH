package spring.nh.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.nh.entity.Db_entity;

@Repository
public interface DbRepository extends JpaRepository<Db_entity, Integer> {

}
