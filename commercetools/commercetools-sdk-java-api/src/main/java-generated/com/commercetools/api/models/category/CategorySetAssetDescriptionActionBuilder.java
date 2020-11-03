package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.category.CategorySetAssetDescriptionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetAssetDescriptionActionBuilder {

    @Nullable
    private String assetId;
    
    @Nullable
    private String assetKey;
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    public CategorySetAssetDescriptionActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }
    
    public CategorySetAssetDescriptionActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }
    
    public CategorySetAssetDescriptionActionBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public String getAssetId(){
        return this.assetId;
    }
    
    @Nullable
    public String getAssetKey(){
        return this.assetKey;
    }
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }

    public CategorySetAssetDescriptionAction build() {
        return new CategorySetAssetDescriptionActionImpl(assetId, assetKey, description);
    }

    public static CategorySetAssetDescriptionActionBuilder of() {
        return new CategorySetAssetDescriptionActionBuilder();
    }

    public static CategorySetAssetDescriptionActionBuilder of(final CategorySetAssetDescriptionAction template) {
        CategorySetAssetDescriptionActionBuilder builder = new CategorySetAssetDescriptionActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.description = template.getDescription();
        return builder;
    }

}
