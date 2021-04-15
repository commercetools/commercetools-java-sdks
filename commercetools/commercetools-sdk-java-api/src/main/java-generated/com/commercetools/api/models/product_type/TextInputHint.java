package com.commercetools.api.models.product_type;

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
public interface TextInputHint {

    
    TextInputHint SINGLE_LINE = TextInputHintEnum.SINGLE_LINE;
    
    TextInputHint MULTI_LINE = TextInputHintEnum.MULTI_LINE;
    
    enum TextInputHintEnum implements TextInputHint {
        SINGLE_LINE("SingleLine"),
        
        MULTI_LINE("MultiLine");
        private final String jsonName;

        private TextInputHintEnum(final String jsonName) {
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
    public static TextInputHint findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TextInputHint() {
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

    public static Optional<TextInputHint> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    public static TextInputHint[] values() {
        return TextInputHintEnum.values();
    }
}
