/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB.controller;

import MB.bean.Product;
import MB.model.ProductModel;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Linhlee
 */
@Controller
@RequestMapping(value = "/ProductController")
public class ProductController {
    private ProductModel promodel;

    public ProductController() {
        promodel = new ProductModel();
    }
@RequestMapping(value = "/index")
public ModelAndView getAllProduct(){
    ModelAndView model = new ModelAndView("Index");
    List<Product> lspro = promodel.getAllProduct();
    model.addObject("product", lspro);
    return model;
}
}
