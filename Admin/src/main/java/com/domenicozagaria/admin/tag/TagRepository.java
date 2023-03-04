package com.domenicozagaria.admin.tag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
    boolean existsByName(String name);

    Set<Tag> findByIdIn(Set<Integer> setIds);
}
