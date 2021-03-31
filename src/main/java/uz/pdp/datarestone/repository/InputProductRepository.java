package uz.pdp.datarestone.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarestone.entity.Input;
import uz.pdp.datarestone.entity.InputProduct;
import uz.pdp.datarestone.entity.OutputProduct;
import uz.pdp.datarestone.template.CustomInputProduct;

@RepositoryRestResource(path = "inputProduct",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {

    @RestResource(path = "byPrice")
    Page<InputProduct> findAllByPrice(@Param("price") Double price, Pageable pageable);

    @RestResource(path = "byProductId")
    Page<InputProduct> findAllByProductId(@Param("productId") Integer product_id, Pageable pageable);

    @RestResource(path = "byInputId")
    Page<InputProduct> findAllByInputId(@Param("inputId") Integer input_id, Pageable pageable);

}
