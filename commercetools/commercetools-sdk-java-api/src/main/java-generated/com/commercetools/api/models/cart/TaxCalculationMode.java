package com.commercetools.api.models.cart;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface TaxCalculationMode {

    
    TaxCalculationMode LINE_ITEM_LEVEL = TaxCalculationModeEnum.LINE_ITEM_LEVEL;
    
    TaxCalculationMode UNIT_PRICE_LEVEL = TaxCalculationModeEnum.UNIT_PRICE_LEVEL;
    
    enum TaxCalculationModeEnum implements TaxCalculationMode {
        LINE_ITEM_LEVEL("LineItemLevel"),
        
        UNIT_PRICE_LEVEL("UnitPriceLevel");
        private final String jsonName;

        private TaxCalculationModeEnum(final String jsonName) {
            this.jsonName = jsonName;
        }
        public String getJsonName() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();
    String name();

    @JsonCreator
    public static TaxCalculationMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TaxCalculationMode() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }
        });
    }

    public static Optional<TaxCalculationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    public static TaxCalculationMode[] values() {
        return TaxCalculationModeEnum.values();
    }
}
