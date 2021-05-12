package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_1.entity.Users;
import uz.pdp.task_1.projection.CustomInput;
import uz.pdp.task_1.projection.CustomUsers;

@RepositoryRestResource(path = "users",collectionResourceRel = "list",excerptProjection = CustomUsers.class)

public interface UserRepository extends JpaRepository<Users, Integer> {

    boolean existsByPhoneNumber(String phoneNumber);

//    boolean existsByPasswordAndWearHouseSet(String password, Set<WearHouse> wearHouseSet);

}
