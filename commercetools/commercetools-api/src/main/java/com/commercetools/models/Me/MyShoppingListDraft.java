package com.commercetools.models.Me;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListLineItemDraft;
import com.commercetools.models.ShoppingList.TextLineItemDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import com.commercetools.models.Me.MyShoppingListDraftImpl;

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
@JsonDeserialize(as = MyShoppingListDraftImpl.class)
public interface MyShoppingListDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @Valid
   @JsonProperty("lineItems")
   public List<ShoppingListLineItemDraft> getLineItems();
   
   @Valid
   @JsonProperty("textLineItems")
   public List<TextLineItemDraft> getTextLineItems();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();

   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setLineItems(final List<ShoppingListLineItemDraft> lineItems);
   
   public void setTextLineItems(final List<TextLineItemDraft> textLineItems);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);
   
   public static MyShoppingListDraftImpl of(){
      return new MyShoppingListDraftImpl();
   }
   

   public static MyShoppingListDraftImpl of(final MyShoppingListDraft template) {
      MyShoppingListDraftImpl instance = new MyShoppingListDraftImpl();
      instance.setLineItems(template.getLineItems());
      instance.setTextLineItems(template.getTextLineItems());
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      instance.setCustom(template.getCustom());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      return instance;
   }

}