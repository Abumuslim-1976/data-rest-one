package uz.pdp.datarestone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarestone.entity.User;
import uz.pdp.datarestone.entity.Warehouse;
import uz.pdp.datarestone.template.CustomUser;

import java.util.List;

@RepositoryRestResource(path = "users", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

    @RestResource(path = "byFirstName")
    Page<User> findAllByFirstName(@Param("firstName") String firstName, Pageable pageable);

    @RestResource(path = "byLastName")
    Page<User> findAllByLastName(@Param("lastName") String lastName, Pageable pageable);

    @RestResource(path = "byNumber")
    Page<User> findByPhoneNumber(@Param("phoneNumber") String phoneNumber, Pageable pageable);

}
