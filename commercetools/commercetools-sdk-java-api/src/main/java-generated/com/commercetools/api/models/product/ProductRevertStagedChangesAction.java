package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRevertStagedChangesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductRevertStagedChangesActionImpl.class)
public interface ProductRevertStagedChangesAction extends ProductUpdateAction {

    String REVERT_STAGED_CHANGES = "revertStagedChanges";



    public static ProductRevertStagedChangesAction of(){
        return new ProductRevertStagedChangesActionImpl();
    }
    

    public static ProductRevertStagedChangesAction of(final ProductRevertStagedChangesAction template) {
        ProductRevertStagedChangesActionImpl instance = new ProductRevertStagedChangesActionImpl();
        return instance;
    }

    public static ProductRevertStagedChangesActionBuilder builder(){
        return ProductRevertStagedChangesActionBuilder.of();
    }
    
    public static ProductRevertStagedChangesActionBuilder builder(final ProductRevertStagedChangesAction template){
        return ProductRevertStagedChangesActionBuilder.of(template);
    }
    

    default <T> T withProductRevertStagedChangesAction(Function<ProductRevertStagedChangesAction, T> helper) {
        return helper.apply(this);
    }
}
