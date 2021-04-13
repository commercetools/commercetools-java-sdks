package com.commercetools.api.models.state;

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
public interface StateTypeEnum {

    
    StateTypeEnum ORDER_STATE = StateTypeEnumEnum.ORDER_STATE;
    
    StateTypeEnum LINE_ITEM_STATE = StateTypeEnumEnum.LINE_ITEM_STATE;
    
    StateTypeEnum PRODUCT_STATE = StateTypeEnumEnum.PRODUCT_STATE;
    
    StateTypeEnum REVIEW_STATE = StateTypeEnumEnum.REVIEW_STATE;
    
    StateTypeEnum PAYMENT_STATE = StateTypeEnumEnum.PAYMENT_STATE;
    
    enum StateTypeEnumEnum implements StateTypeEnum {
        ORDER_STATE("OrderState"),
        
        LINE_ITEM_STATE("LineItemState"),
        
        PRODUCT_STATE("ProductState"),
        
        REVIEW_STATE("ReviewState"),
        
        PAYMENT_STATE("PaymentState");
        private final String jsonName;

        private StateTypeEnumEnum(final String jsonName) {
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
    public static StateTypeEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new StateTypeEnum() {
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

    public static Optional<StateTypeEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    public static StateTypeEnum[] values() {
        return StateTypeEnumEnum.values();
    }
}
