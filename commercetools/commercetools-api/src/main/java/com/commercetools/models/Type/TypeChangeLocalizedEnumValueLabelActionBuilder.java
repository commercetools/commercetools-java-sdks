package com.commercetools.models.type;

import com.commercetools.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.type.TypeChangeLocalizedEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeLocalizedEnumValueLabelActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private com.commercetools.models.type.CustomFieldLocalizedEnumValue value;
   
   public TypeChangeLocalizedEnumValueLabelActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeLocalizedEnumValueLabelActionBuilder value( final com.commercetools.models.type.CustomFieldLocalizedEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.type.CustomFieldLocalizedEnumValue getValue(){
      return this.value;
   }

   public TypeChangeLocalizedEnumValueLabelAction build() {
       return new TypeChangeLocalizedEnumValueLabelActionImpl(fieldName, value);
   }
   
   public static TypeChangeLocalizedEnumValueLabelActionBuilder of() {
      return new TypeChangeLocalizedEnumValueLabelActionBuilder();
   }
   
   public static TypeChangeLocalizedEnumValueLabelActionBuilder of(final TypeChangeLocalizedEnumValueLabelAction template) {
      TypeChangeLocalizedEnumValueLabelActionBuilder builder = new TypeChangeLocalizedEnumValueLabelActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.value = template.getValue();
      return builder;
   }
   
}