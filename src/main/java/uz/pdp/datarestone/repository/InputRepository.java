package uz.pdp.datarestone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarestone.entity.Input;
import uz.pdp.datarestone.entity.Output;
import uz.pdp.datarestone.template.CustomInput;

@RepositoryRestResource(path = "input",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Integer> {

    @RestResource(path = "byFacture")
    Page<Input> findAllByFactureNumber(@Param("factureNumber") String factureNumber, Pageable pageable);

    @RestResource(path = "byWarehouseId")
    Page<Input> findAllByWarehouseId(@Param("warehouseId") Integer warehouse_id, Pageable pageable);

    @RestResource(path = "byCurrencyId")
    Page<Input> findAllByCurrencyId(@Param("currencyId") Integer currency_id, Pageable pageable);

    @RestResource(path = "bySupplierId")
    Page<Input> findAllBySupplierId(@Param("supplierId") Integer supplier_id, Pageable pageable);

}
