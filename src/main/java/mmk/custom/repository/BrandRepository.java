package mmk.custom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mmk.custom.entity.Brand;

@RepositoryRestResource(path="brands")
public interface BrandRepository extends JpaRepository<Brand,Integer>{

}
