package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCartSetCountryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCartSetCountryActionImpl.class)
public interface MyCartSetCountryAction extends MyCartUpdateAction {

   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   
   @JsonProperty("country")
   public String getCountry();

   public void setCountry(final String country);
   
   public static MyCartSetCountryActionImpl of(){
      return new MyCartSetCountryActionImpl();
   }
   

   public static MyCartSetCountryActionImpl of(final MyCartSetCountryAction template) {
      MyCartSetCountryActionImpl instance = new MyCartSetCountryActionImpl();
      instance.setCountry(template.getCountry());
      return instance;
   }

}