package uz.pdp.task_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_1.entity.Users;
import uz.pdp.task_1.entity.WearHouse;

import java.util.Set;

@Projection(types = Users.class)
public interface CustomUsers {
    Integer getId();

    String getLastName();

    String getPhoneNumber();

    String getFirstName();

    String getCode();

    String getPassword();

    boolean getActive();

    Set<WearHouse> getWearHouseSet();
}
