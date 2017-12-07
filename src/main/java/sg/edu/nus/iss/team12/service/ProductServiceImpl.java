package sg.edu.nus.iss.team12.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.team12.model.Product;
import sg.edu.nus.iss.team12.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Resource
	ProductRepository productRepository;

	@Override
	@Transactional
	public ArrayList<Product> findAllProducts() {
		ArrayList<Product> products = (ArrayList<Product>)productRepository.findAll();
		return products;
	}

	@Override
	@Transactional
	public Product findProduct(int productId) {
		return productRepository.getOne(productId);
	}

	@Override
	@Transactional
	public Product createProduct(Product product) {
		return productRepository.saveAndFlush(product);
	}

	@Override
	@Transactional
	public Product changeProduct(Product product) {
		return productRepository.saveAndFlush(product);
	}

	@Override
	@Transactional
	public void removeProduct(Product product) {
		productRepository.delete(product);
	}

	@Override
	public ArrayList<Product> findProductByID(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> findProductByDesc(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> findProductByColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> findProductByManufacturer(String manufacturer) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
