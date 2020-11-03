package com.commercetools.api.models.product;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetMetaDescriptionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetMetaDescriptionActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;
    
    @Nullable
    private Boolean staged;

    public ProductSetMetaDescriptionActionBuilder metaDescription(@Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }
    
    public ProductSetMetaDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription(){
        return this.metaDescription;
    }
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    public ProductSetMetaDescriptionAction build() {
        return new ProductSetMetaDescriptionActionImpl(metaDescription, staged);
    }

    public static ProductSetMetaDescriptionActionBuilder of() {
        return new ProductSetMetaDescriptionActionBuilder();
    }

    public static ProductSetMetaDescriptionActionBuilder of(final ProductSetMetaDescriptionAction template) {
        ProductSetMetaDescriptionActionBuilder builder = new ProductSetMetaDescriptionActionBuilder();
        builder.metaDescription = template.getMetaDescription();
        builder.staged = template.getStaged();
        return builder;
    }

}
