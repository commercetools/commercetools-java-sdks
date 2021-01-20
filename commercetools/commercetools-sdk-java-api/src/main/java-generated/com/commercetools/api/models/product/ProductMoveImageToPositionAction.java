
package com.commercetools.api.models.product;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductMoveImageToPositionActionImpl;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductMoveImageToPositionActionImpl.class)
public interface ProductMoveImageToPositionAction extends ProductUpdateAction {

    String MOVE_IMAGE_TO_POSITION = "moveImageToPosition";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    /**
    *  <p>The URL of the image</p>
    */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    @NotNull
    @JsonProperty("position")
    public Long getPosition();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setImageUrl(final String imageUrl);

    public void setPosition(final Long position);

    public void setStaged(final Boolean staged);

    public static ProductMoveImageToPositionAction of() {
        return new ProductMoveImageToPositionActionImpl();
    }

    public static ProductMoveImageToPositionAction of(final ProductMoveImageToPositionAction template) {
        ProductMoveImageToPositionActionImpl instance = new ProductMoveImageToPositionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setPosition(template.getPosition());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductMoveImageToPositionActionBuilder builder() {
        return ProductMoveImageToPositionActionBuilder.of();
    }

    public static ProductMoveImageToPositionActionBuilder builder(final ProductMoveImageToPositionAction template) {
        return ProductMoveImageToPositionActionBuilder.of(template);
    }

    default <T> T withProductMoveImageToPositionAction(Function<ProductMoveImageToPositionAction, T> helper) {
        return helper.apply(this);
    }
}
