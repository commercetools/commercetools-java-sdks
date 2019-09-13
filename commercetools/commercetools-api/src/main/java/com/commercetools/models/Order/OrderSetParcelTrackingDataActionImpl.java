package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.TrackingData;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetParcelTrackingDataActionImpl implements OrderSetParcelTrackingDataAction {

   private java.lang.String action;
   
   private com.commercetools.models.order.TrackingData trackingData;
   
   private java.lang.String parcelId;

   @JsonCreator
   OrderSetParcelTrackingDataActionImpl(@JsonProperty("trackingData") final com.commercetools.models.order.TrackingData trackingData, @JsonProperty("parcelId") final java.lang.String parcelId) {
      this.trackingData = trackingData;
      this.parcelId = parcelId;
      this.action = "setParcelTrackingData";
   }
   public OrderSetParcelTrackingDataActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public void setTrackingData(final com.commercetools.models.order.TrackingData trackingData){
      this.trackingData = trackingData;
   }
   
   public void setParcelId(final java.lang.String parcelId){
      this.parcelId = parcelId;
   }

}