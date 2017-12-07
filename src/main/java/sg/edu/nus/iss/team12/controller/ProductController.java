package sg.edu.nus.iss.team12.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sg.edu.nus.iss.team12.model.Product;
import sg.edu.nus.iss.team12.service.ProductService;

@RequestMapping(value = "/product")
@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
	}
	
	@RequestMapping (value = "/list", method = RequestMethod.GET)
	public ModelAndView userListPage() {
		ModelAndView mav = new ModelAndView("product-list");
		ArrayList<Product> productList = productService.findAllProducts();
		mav.addObject("productList", productList);
		return mav;
	}
	
	

}
