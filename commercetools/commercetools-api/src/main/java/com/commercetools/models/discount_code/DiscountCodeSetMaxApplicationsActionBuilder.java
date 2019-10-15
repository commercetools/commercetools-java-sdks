package com.commercetools.models.discount_code;

import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.models.discount_code.DiscountCodeSetMaxApplicationsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeSetMaxApplicationsActionBuilder {
   
   @Nullable
   private Long maxApplications;
   
   public DiscountCodeSetMaxApplicationsActionBuilder maxApplications(@Nullable final Long maxApplications) {
      this.maxApplications = maxApplications;
      return this;
   }
   
   @Nullable
   public Long getMaxApplications(){
      return this.maxApplications;
   }

   public DiscountCodeSetMaxApplicationsAction build() {
       return new DiscountCodeSetMaxApplicationsActionImpl(maxApplications);
   }
   
   public static DiscountCodeSetMaxApplicationsActionBuilder of() {
      return new DiscountCodeSetMaxApplicationsActionBuilder();
   }
   
   public static DiscountCodeSetMaxApplicationsActionBuilder of(final DiscountCodeSetMaxApplicationsAction template) {
      DiscountCodeSetMaxApplicationsActionBuilder builder = new DiscountCodeSetMaxApplicationsActionBuilder();
      builder.maxApplications = template.getMaxApplications();
      return builder;
   }
   
}