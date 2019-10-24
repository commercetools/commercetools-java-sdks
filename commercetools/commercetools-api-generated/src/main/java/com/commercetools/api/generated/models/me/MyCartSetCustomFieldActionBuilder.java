package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public MyCartSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public MyCartSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public MyCartSetCustomFieldAction build() {
       return new MyCartSetCustomFieldActionImpl(name, value);
   }
   
   public static MyCartSetCustomFieldActionBuilder of() {
      return new MyCartSetCustomFieldActionBuilder();
   }
   
   public static MyCartSetCustomFieldActionBuilder of(final MyCartSetCustomFieldAction template) {
      MyCartSetCustomFieldActionBuilder builder = new MyCartSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}