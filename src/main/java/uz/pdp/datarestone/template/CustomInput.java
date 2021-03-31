package uz.pdp.datarestone.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestone.entity.Currency;
import uz.pdp.datarestone.entity.Input;
import uz.pdp.datarestone.entity.Supplier;
import uz.pdp.datarestone.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    Timestamp getTimestamp();

    String getFactureNumber();

    String getCode();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

}
