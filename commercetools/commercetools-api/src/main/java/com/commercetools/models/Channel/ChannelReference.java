package com.commercetools.models.channel;

import com.commercetools.models.channel.Channel;
import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.channel.ChannelReferenceImpl;

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
@JsonDeserialize(as = ChannelReferenceImpl.class)
public interface ChannelReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Channel getObj();

   public void setObj(final Channel obj);
   
   public static ChannelReferenceImpl of(){
      return new ChannelReferenceImpl();
   }
   

   public static ChannelReferenceImpl of(final ChannelReference template) {
      ChannelReferenceImpl instance = new ChannelReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}