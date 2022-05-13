package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ProductDetailService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductDetailService productDetailService;
	
	@GetMapping({ "/{id}" })
	public ResponseBody getProductById(@PathVariable String id) {
		return productDetailService.getByPName(id);
	}
	@GetMapping({ "/{pName}" })
	public ResponseBody getProductByPName(@PathVariable String pName) {
		return productDetailService.getByPName(pName);
	}


}
