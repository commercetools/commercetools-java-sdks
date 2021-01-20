
package com.commercetools.api.models.product;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductSetAssetKeyActionImpl;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetKeyActionImpl.class)
public interface ProductSetAssetKeyAction extends ProductUpdateAction {

    String SET_ASSET_KEY = "setAssetKey";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("staged")
    public Boolean getStaged();

    @NotNull
    @JsonProperty("assetId")
    public String getAssetId();

    /**
    *  <p>User-defined identifier for the asset.
    *  If left blank or set to <code>null</code>, the asset key is unset/removed.</p>
    */

    @JsonProperty("assetKey")
    public String getAssetKey();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public static ProductSetAssetKeyAction of() {
        return new ProductSetAssetKeyActionImpl();
    }

    public static ProductSetAssetKeyAction of(final ProductSetAssetKeyAction template) {
        ProductSetAssetKeyActionImpl instance = new ProductSetAssetKeyActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public static ProductSetAssetKeyActionBuilder builder() {
        return ProductSetAssetKeyActionBuilder.of();
    }

    public static ProductSetAssetKeyActionBuilder builder(final ProductSetAssetKeyAction template) {
        return ProductSetAssetKeyActionBuilder.of(template);
    }

    default <T> T withProductSetAssetKeyAction(Function<ProductSetAssetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
