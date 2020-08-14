package com.commercetools.api.models.cart_discount;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum StackingMode {

    
    @JsonProperty("Stacking")
    STACKING("Stacking"),
    
    
    @JsonProperty("StopAfterThisDiscount")
    STOP_AFTER_THIS_DISCOUNT("StopAfterThisDiscount");

    private final String jsonName;

    private StackingMode(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<StackingMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}
