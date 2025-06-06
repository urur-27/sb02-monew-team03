package com.team03.monew.repository;

import com.team03.monew.entity.Activity;
import com.team03.monew.entity.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, UUID> {

    void deleteByUser(User user);
}
