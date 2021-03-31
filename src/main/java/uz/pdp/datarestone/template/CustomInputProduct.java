package uz.pdp.datarestone.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestone.entity.Input;
import uz.pdp.datarestone.entity.InputProduct;
import uz.pdp.datarestone.entity.Product;

import java.sql.Timestamp;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Timestamp getExpireDate();

    Double getAmount();

    Double getPrice();

    Product getProduct();

    Input getInput();

}
