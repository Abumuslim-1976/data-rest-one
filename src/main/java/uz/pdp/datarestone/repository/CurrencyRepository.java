package uz.pdp.datarestone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarestone.entity.Currency;
import uz.pdp.datarestone.template.CustomCurrency;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {

    @RestResource(path = "byName")
    Page<Currency> findAllByName(@Param("name") String name, Pageable pageable);

}
