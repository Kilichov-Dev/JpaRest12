package uz.pdp.task_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_1.entity.Client;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Projection(types = Client.class)
public interface CustomClient {

    Integer getId();

    String getName();

    String getPhoneNumber();
}
