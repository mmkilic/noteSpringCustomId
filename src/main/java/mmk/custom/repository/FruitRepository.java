package mmk.custom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mmk.custom.entity.Fruit;

@RepositoryRestResource(path="fruits")
public interface FruitRepository extends JpaRepository<Fruit,Integer>{

}
