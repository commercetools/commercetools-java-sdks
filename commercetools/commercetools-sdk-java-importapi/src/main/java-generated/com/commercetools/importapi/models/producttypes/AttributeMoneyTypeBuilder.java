package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeType;
import com.commercetools.importapi.models.producttypes.AttributeMoneyType;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeMoneyTypeBuilder {




    public AttributeMoneyType build() {
        return new AttributeMoneyTypeImpl();
    }

    public static AttributeMoneyTypeBuilder of() {
        return new AttributeMoneyTypeBuilder();
    }

    public static AttributeMoneyTypeBuilder of(final AttributeMoneyType template) {
        AttributeMoneyTypeBuilder builder = new AttributeMoneyTypeBuilder();
        return builder;
    }

}
