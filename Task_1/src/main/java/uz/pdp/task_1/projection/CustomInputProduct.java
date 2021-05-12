package uz.pdp.task_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_1.entity.Input;
import uz.pdp.task_1.entity.InputProduct;
import uz.pdp.task_1.entity.Product;

import javax.persistence.*;
import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

     Integer getId();

     Product getProduct();

     Double getAmount();

     Double getPrice();

     Date getExpiDate();

     Input getInput();
}
