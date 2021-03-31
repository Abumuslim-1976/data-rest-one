package uz.pdp.datarestone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.datarestone.entity.Supplier;
import uz.pdp.datarestone.template.CustomSupplier;

@RepositoryRestResource(path = "supplier",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

    @RestResource(path = "byName")
    Page<Supplier> findAllByName(@Param("name") String name, Pageable pageable);

    @RestResource(path = "byNumber")
    Page<Supplier> findByPhoneNumber(@Param("phoneNumber") String phoneNumber, Pageable pageable);
}
