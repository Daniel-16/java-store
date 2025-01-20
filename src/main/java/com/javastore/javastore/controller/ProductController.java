package com.javastore.javastore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javastore.javastore.models.Products;
import com.javastore.javastore.services.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository repo;

    public String showProductList(Model model) {
        List<Products> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }
}
