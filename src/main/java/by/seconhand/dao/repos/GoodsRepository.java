package by.seconhand.dao.repos;

import by.seconhand.bean.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface GoodsRepository extends JpaRepository<Goods, Long> {
    List<Goods> findAll();
}
