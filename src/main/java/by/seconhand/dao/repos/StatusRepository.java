package by.seconhand.dao.repos;

import by.seconhand.bean.OrderStatuses;
import by.seconhand.bean.StatusOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<StatusOrder, Long> {
    StatusOrder findByStatusName(OrderStatuses orderStatuses);
}
