package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategorySetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategorySetKeyActionBuilder {

    @Nullable
    private String key;

    public TaxCategorySetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey(){
        return this.key;
    }

    public TaxCategorySetKeyAction build() {
        return new TaxCategorySetKeyActionImpl(key);
    }

    public static TaxCategorySetKeyActionBuilder of() {
        return new TaxCategorySetKeyActionBuilder();
    }

    public static TaxCategorySetKeyActionBuilder of(final TaxCategorySetKeyAction template) {
        TaxCategorySetKeyActionBuilder builder = new TaxCategorySetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
