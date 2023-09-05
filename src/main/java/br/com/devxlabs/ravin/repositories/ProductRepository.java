package br.com.devxlabs.ravin.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.devxlabs.ravin.models.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findByName(String name);

	Optional<Product> findByCostPrice(double costPrice);

	@Query(	"SELECT p from Product p where p.costPrice <= :costPrice AND " + 
			" p.salePrice >= :salePrice")
	List<Product> findByCostPriceAndSalePrice(@Param("costPrice") Double costPrice,
			@Param("salePrice") double salePrice);

	@Query("SELECT p.name from Product p")
	List<String> findProductNames();

	@Query(value = 	"select name from Product where productType = :productType AND " +
			 		" createdDate = TODAY()", nativeQuery = true)
	List<String> findProductNamesByProductTypeInsertedToday(String productType);
	
	Page<Product> findAll(Pageable pageable);
}
