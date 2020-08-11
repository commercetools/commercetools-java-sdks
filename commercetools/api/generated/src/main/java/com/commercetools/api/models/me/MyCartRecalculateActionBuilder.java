package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartRecalculateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartRecalculateActionBuilder {

   @Nullable
   private Boolean updateProductData;

   public MyCartRecalculateActionBuilder updateProductData(@Nullable final Boolean updateProductData) {
      this.updateProductData = updateProductData;
      return this;
   }

   @Nullable
   public Boolean getUpdateProductData(){
      return this.updateProductData;
   }

   public MyCartRecalculateAction build() {
       return new MyCartRecalculateActionImpl(updateProductData);
   }

   public static MyCartRecalculateActionBuilder of() {
      return new MyCartRecalculateActionBuilder();
   }

   public static MyCartRecalculateActionBuilder of(final MyCartRecalculateAction template) {
      MyCartRecalculateActionBuilder builder = new MyCartRecalculateActionBuilder();
      builder.updateProductData = template.getUpdateProductData();
      return builder;
   }

}
