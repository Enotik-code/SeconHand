package by.seconhand.dao.repos;

import by.seconhand.bean.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Transactional
@Repository
public interface GoodsRepository extends JpaRepository<Goods, Long> {
    List<Goods> findAll();

    List<Goods> findByName(String name);

    @Query(value = "Update Goods g SET g.count=?2 WHERE g.id=?1")
    void updateGoods(Long id, int count);

}
