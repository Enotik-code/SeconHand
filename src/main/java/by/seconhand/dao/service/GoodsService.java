package by.seconhand.dao.service;

import by.seconhand.bean.Goods;
import by.seconhand.dao.repos.GoodsRepository;
import lombok.SneakyThrows;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    private static final Logger log = Logger.getLogger(GoodsService.class);

    @SneakyThrows
    public List<Goods> listOfGoods(){
        log.info("Returned list of goods");
        return goodsRepository.findAll();
    }

}
