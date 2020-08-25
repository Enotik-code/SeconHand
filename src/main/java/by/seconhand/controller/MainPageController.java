package by.seconhand.controller;

import by.seconhand.dao.service.ClientServiceImpl;
import by.seconhand.dao.service.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {

    @Autowired
    private GoodsServiceImpl goodsServiceImpl;

    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping(value = "/goods")
    public ModelAndView getListOfGoods(){
        ModelAndView modelAndView = new ModelAndView("/goods");
        modelAndView.addObject("goodsList", goodsServiceImpl.listOfGoods());
        System.out.println(clientService.listOfClients());
        return modelAndView;
    }
}
