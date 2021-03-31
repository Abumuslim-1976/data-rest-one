package uz.pdp.datarestone.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.datarestone.entity.Category;
import uz.pdp.datarestone.template.CustomCategory;

import java.util.Optional;

@Repository
@RepositoryRestResource(path = "category",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @RestResource(path = "byName")
    Page<Category> findAllByName(@Param("name") String name, Pageable pageable);

    @RestResource(path = "byParentCategoryId")
    Page<Category> findAllByParentCategoryId(@Param("parentCategoryId") Integer parentCategory_id, Pageable pageable);

}
