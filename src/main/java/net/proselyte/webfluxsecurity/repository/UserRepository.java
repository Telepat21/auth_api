package net.proselyte.webfluxsecurity.repository;

import net.proselyte.webfluxsecurity.entity.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {

    Mono<UserEntity> findByUsername(String username);
    Mono<UserEntity> updateUser(String email);
}
