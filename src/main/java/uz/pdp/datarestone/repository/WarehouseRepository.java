package uz.pdp.datarestone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarestone.entity.Warehouse;
import uz.pdp.datarestone.template.CustomWarehouse;

@RepositoryRestResource(path = "warehouse",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

    @RestResource(path = "byName")
    Page<Warehouse> findAllByName(@Param("name") String name, Pageable pageable);
}
