package com.commercetools.api.ml.generated.models.missing_data;


import com.commercetools.api.ml.generated.models.missing_data.AttributeCoverage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeCoverageBuilder {
   
   
   private Integer names;
   
   
   private Integer values;
   
   public AttributeCoverageBuilder names( final Integer names) {
      this.names = names;
      return this;
   }
   
   public AttributeCoverageBuilder values( final Integer values) {
      this.values = values;
      return this;
   }
   
   
   public Integer getNames(){
      return this.names;
   }
   
   
   public Integer getValues(){
      return this.values;
   }

   public AttributeCoverage build() {
       return new AttributeCoverageImpl(names, values);
   }
   
   public static AttributeCoverageBuilder of() {
      return new AttributeCoverageBuilder();
   }
   
   public static AttributeCoverageBuilder of(final AttributeCoverage template) {
      AttributeCoverageBuilder builder = new AttributeCoverageBuilder();
      builder.names = template.getNames();
      builder.values = template.getValues();
      return builder;
   }
   
}
