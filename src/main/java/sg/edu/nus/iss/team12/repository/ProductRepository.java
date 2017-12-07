package sg.edu.nus.iss.team12.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.team12.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
