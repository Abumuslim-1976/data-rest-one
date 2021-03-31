package uz.pdp.datarestone.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestone.entity.Output;
import uz.pdp.datarestone.entity.OutputProduct;
import uz.pdp.datarestone.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Double getPrice();

    Double getAmount();

    Product getProduct();

    Output getOutput();

}
