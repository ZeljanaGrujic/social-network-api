package fon.bg.ac.rs.socialnetworkapi.repository;

import fon.bg.ac.rs.socialnetworkapi.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity,String> {
}
