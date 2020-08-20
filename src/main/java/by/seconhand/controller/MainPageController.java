package by.seconhand.controller;

import by.seconhand.dao.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping(value = "/goods")
    public ModelAndView getListOfGoods(){
        ModelAndView modelAndView = new ModelAndView("/goods");
        modelAndView.addObject("goodsList", goodsService.listOfGoods());
        return modelAndView;
    }
}
