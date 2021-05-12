package uz.pdp.task_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_1.entity.Currency;
import uz.pdp.task_1.entity.Input;
import uz.pdp.task_1.entity.Supplier;
import uz.pdp.task_1.entity.WearHouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Timestamp getDate();

    WearHouse getWearHouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
