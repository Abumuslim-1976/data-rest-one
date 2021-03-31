package uz.pdp.datarestone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarestone.entity.OutputProduct;
import uz.pdp.datarestone.template.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {

    @RestResource(path = "byPrice")
    Page<OutputProduct> findAllByPrice(@Param("price") Double price, Pageable pageable);

    @RestResource(path = "byProductId")
    Page<OutputProduct> findAllByProductId(@Param("productId") Integer product_id, Pageable pageable);

    @RestResource(path = "byOutputId")
    Page<OutputProduct> findAllByOutputId(@Param("outputId") Integer output_id, Pageable pageable);

}
