package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.order_edit.OrderEdit;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditReferenceImpl implements OrderEditReference {

    
    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    
    private String id;
    
    
    private com.commercetools.api.models.order_edit.OrderEdit obj;

    @JsonCreator
    OrderEditReferenceImpl(@JsonProperty("id") final String id, @JsonProperty("obj") final com.commercetools.api.models.order_edit.OrderEdit obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnum("order-edit");
    }
    public OrderEditReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("order-edit");
    }

    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    
    public String getId(){
        return this.id;
    }
    
    
    public com.commercetools.api.models.order_edit.OrderEdit getObj(){
        return this.obj;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setObj(final com.commercetools.api.models.order_edit.OrderEdit obj){
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderEditReferenceImpl that = (OrderEditReferenceImpl) o;
    
        return new EqualsBuilder()
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(obj, that.obj)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(typeId)
            .append(id)
            .append(obj)
            .toHashCode();
    }

}
