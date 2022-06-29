package SimpleRest.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import SimpleRest.Model.User;

@RepositoryRestResource(collectionResourceRel="signup",path="signup")
@CrossOrigin(origins = "*")
public interface StudentRepo extends JpaRepository<User, Integer>	{
}