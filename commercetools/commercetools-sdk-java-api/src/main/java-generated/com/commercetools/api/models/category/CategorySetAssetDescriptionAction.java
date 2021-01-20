
package com.commercetools.api.models.category;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategorySetAssetDescriptionActionImpl;
import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetDescriptionActionImpl.class)
public interface CategorySetAssetDescriptionAction extends CategoryUpdateAction {

    @JsonProperty("assetId")
    public String getAssetId();

    @JsonProperty("assetKey")
    public String getAssetKey();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setDescription(final LocalizedString description);

    public static CategorySetAssetDescriptionAction of() {
        return new CategorySetAssetDescriptionActionImpl();
    }

    public static CategorySetAssetDescriptionAction of(final CategorySetAssetDescriptionAction template) {
        CategorySetAssetDescriptionActionImpl instance = new CategorySetAssetDescriptionActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static CategorySetAssetDescriptionActionBuilder builder() {
        return CategorySetAssetDescriptionActionBuilder.of();
    }

    public static CategorySetAssetDescriptionActionBuilder builder(final CategorySetAssetDescriptionAction template) {
        return CategorySetAssetDescriptionActionBuilder.of(template);
    }

    default <T> T withCategorySetAssetDescriptionAction(Function<CategorySetAssetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
