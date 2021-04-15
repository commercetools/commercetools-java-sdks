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
public interface ProductPublishScope {

    
    ProductPublishScope ALL = ProductPublishScopeEnum.ALL;
    
    ProductPublishScope PRICES = ProductPublishScopeEnum.PRICES;
    
    enum ProductPublishScopeEnum implements ProductPublishScope {
        ALL("All"),
        
        PRICES("Prices");
        private final String jsonName;

        private ProductPublishScopeEnum(final String jsonName) {
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
    public static ProductPublishScope findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductPublishScope() {
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

    public static Optional<ProductPublishScope> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    public static ProductPublishScope[] values() {
        return ProductPublishScopeEnum.values();
    }
}
