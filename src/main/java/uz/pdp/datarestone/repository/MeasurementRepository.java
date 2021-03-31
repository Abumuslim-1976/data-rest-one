package uz.pdp.datarestone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.datarestone.entity.Measurement;
import uz.pdp.datarestone.template.CustomMeasurement;

@RepositoryRestResource(path = "measurement",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

    @RestResource(path = "byName")
    Page<Measurement> findAllByName(@Param("name") String name, Pageable pageable);

}
