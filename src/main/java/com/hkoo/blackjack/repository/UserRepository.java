package com.hkoo.blackjack.repository;


import com.hkoo.blackjack.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
