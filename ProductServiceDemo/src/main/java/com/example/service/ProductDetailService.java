package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.ProductDetails;

public class ProductDetailService {
	@Autowired
	ProductDetailRepository productDetailIORepo;

//	public ResponseBody getById(String id) {
//		try {
//			PensionerResult result = new PensionerResult();
//			Optional<ProductDetails> pensioner;
//
//			pensioner = ProductDetailRepository.findById(id);
//
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//			PensionerDetails rs = pensioner.get();
//			result.setPensionerDetail(rs);
//			result.setErrorCode(200);
//			result.setErrorMessage(ErrorMessages.RETRIEVE_SUCCESSFUL);
//			return result;
//			return null;
//		} catch (Exception e) {
//		}
//	}

	public ResponseBody getByPName(String pName) {
		try {
			ProductDetails result = new ProductDetails();
			Optional<ProductDetails> product = ProductDetailRepository.findByUsername(pName);


			ProductDetails rs = product.get();
			result=rs;
			
			//result.setErrorMessage("RETRIEVE_SUCCESSFUL");
			return (ResponseBody) result;
			
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
