package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        //集合查询
        List<Items> items = itemsService.findAll();
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }


    @RequestMapping("/save")
    public String save(Items items) {
        int acount =  itemsService.save(items);
        //集合列表页跳转
        return "redirect:/items/findAll";
    }
}
