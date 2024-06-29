package mmk.custom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mmk.custom.entity.Project;

@RepositoryRestResource(path="projects")
public interface ProjectRepository extends JpaRepository<Project,Integer>{

}
