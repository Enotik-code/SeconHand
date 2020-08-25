package by.seconhand.dao.repos;

import by.seconhand.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> {
    List<Client> findAll();
    Optional<Client> findById(Long id);
}
