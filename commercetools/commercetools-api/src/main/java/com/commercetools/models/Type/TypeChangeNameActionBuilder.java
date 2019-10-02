package com.commercetools.models.type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.TypeUpdateAction;
import com.commercetools.models.type.TypeChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeNameActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   public TypeChangeNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }

   public TypeChangeNameAction build() {
       return new TypeChangeNameActionImpl(name);
   }
   
   public static TypeChangeNameActionBuilder of() {
      return new TypeChangeNameActionBuilder();
   }
   
   public static TypeChangeNameActionBuilder of(final TypeChangeNameAction template) {
      TypeChangeNameActionBuilder builder = new TypeChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}