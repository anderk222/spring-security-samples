/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example.repository;

import example.domain.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Anderson Macias
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByUserNameOrEmail(String name, String email);
    
}
