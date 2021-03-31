package uz.pdp.datarestone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarestone.entity.Output;
import uz.pdp.datarestone.template.CustomOutput;

@RepositoryRestResource(path = "output",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {

    @RestResource(path = "byFacture")
    Page<Output> findAllByFactureNumber(@Param("factureNumber") String factureNumber, Pageable pageable);

    @RestResource(path = "byWarehouseId")
    Page<Output> findAllByWarehouseId(@Param("warehouseId") Integer warehouse_id, Pageable pageable);

    @RestResource(path = "byCurrencyId")
    Page<Output> findAllByCurrencyId(@Param("currencyId") Integer currency_id, Pageable pageable);

    @RestResource(path = "byClientId")
    Page<Output> findAllByClientId(@Param("clientId") Integer client_id, Pageable pageable);

}
