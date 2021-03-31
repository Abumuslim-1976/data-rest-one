package uz.pdp.datarestone.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestone.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Integer getId();

    String getName();

}
