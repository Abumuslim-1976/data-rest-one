package uz.pdp.datarestone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarestone.entity.Product;
import uz.pdp.datarestone.template.CustomProduct;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @RestResource(path = "byName")
    Page<Product> findAllByName(@Param("name") String name, Pageable pageable);

    @RestResource(path = "byCategoryId")
    Page<Product> findAllByCategoryId(@Param("categoryId") Integer category_id, Pageable pageable);

    @RestResource(path = "byMeasurementId")
    Page<Product> findAllByMeasurementId(@Param("measurementId") Integer measurement_id, Pageable pageable);

}
