package by.seconhand.dao.service;

import by.seconhand.bean.Goods;
import by.seconhand.dao.repos.GoodsRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl {

    @Autowired
    private GoodsRepository goodsRepository;

    private static final Logger log = Logger.getLogger(GoodsServiceImpl.class);

    public List<Goods> listOfGoods(){
        log.info("Returned list of goods");
        return goodsRepository.findAll();
    }

    public void addThingsToList(Goods goods){
        log.info("Add goods to list");
        this.goodsRepository.save(goods);
    }

    public void updateGoods(Goods goods, int count){
        log.info("Successfully updated");
        this.goodsRepository.updateGoods(goods.getId(), count);
    }

    public Optional<Goods> findById(Long id){
        return goodsRepository.findById(id);
    }

    public List<Goods> findByName(String name){
        return this.goodsRepository.findByName(name);
    }
}
