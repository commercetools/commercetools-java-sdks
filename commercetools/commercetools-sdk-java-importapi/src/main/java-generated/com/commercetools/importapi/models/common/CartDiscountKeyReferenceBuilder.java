package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.CartDiscountKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountKeyReferenceBuilder {

    
    private String key;

    public CartDiscountKeyReferenceBuilder key( final String key) {
        this.key = key;
        return this;
    }

    
    public String getKey(){
        return this.key;
    }

    public CartDiscountKeyReference build() {
        return new CartDiscountKeyReferenceImpl(key);
    }

    public static CartDiscountKeyReferenceBuilder of() {
        return new CartDiscountKeyReferenceBuilder();
    }

    public static CartDiscountKeyReferenceBuilder of(final CartDiscountKeyReference template) {
        CartDiscountKeyReferenceBuilder builder = new CartDiscountKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
