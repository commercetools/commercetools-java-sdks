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
public interface TaxMode {

    
    TaxMode PLATFORM = TaxModeEnum.PLATFORM;
    
    TaxMode EXTERNAL = TaxModeEnum.EXTERNAL;
    
    TaxMode EXTERNAL_AMOUNT = TaxModeEnum.EXTERNAL_AMOUNT;
    
    TaxMode DISABLED = TaxModeEnum.DISABLED;
    
    enum TaxModeEnum implements TaxMode {
        PLATFORM("Platform"),
        
        EXTERNAL("External"),
        
        EXTERNAL_AMOUNT("ExternalAmount"),
        
        DISABLED("Disabled");
        private final String jsonName;

        private TaxModeEnum(final String jsonName) {
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
    public static TaxMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TaxMode() {
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

    public static Optional<TaxMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    public static TaxMode[] values() {
        return TaxModeEnum.values();
    }
}
