package uz.pdp.datarestone.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarestone.entity.Client;
import uz.pdp.datarestone.template.CustomClient;

@RepositoryRestResource(path = "client", excerptProjection = CustomClient.class, collectionResourceRel = "clients")
public interface ClientRepository extends JpaRepository<Client, Integer> {

    @RestResource(path = "byName")
    Page<Client> findAllByName(@Param("name") String name, Pageable pageable);

    @RestResource(path = "byPhoneNumber")
    Page<Client> findByPhoneNumber(@Param("phoneNumber") String phoneNumber, Pageable pageable);
}
