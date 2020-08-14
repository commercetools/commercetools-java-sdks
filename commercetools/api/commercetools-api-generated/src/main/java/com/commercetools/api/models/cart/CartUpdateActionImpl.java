package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartAddCustomLineItemAction;
import com.commercetools.api.models.cart.CartAddDiscountCodeAction;
import com.commercetools.api.models.cart.CartAddItemShippingAddressAction;
import com.commercetools.api.models.cart.CartAddLineItemAction;
import com.commercetools.api.models.cart.CartAddPaymentAction;
import com.commercetools.api.models.cart.CartAddShoppingListAction;
import com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction;
import com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyAction;
import com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityAction;
import com.commercetools.api.models.cart.CartChangeLineItemQuantityAction;
import com.commercetools.api.models.cart.CartChangeTaxCalculationModeAction;
import com.commercetools.api.models.cart.CartChangeTaxModeAction;
import com.commercetools.api.models.cart.CartChangeTaxRoundingModeAction;
import com.commercetools.api.models.cart.CartRecalculateAction;
import com.commercetools.api.models.cart.CartRemoveCustomLineItemAction;
import com.commercetools.api.models.cart.CartRemoveDiscountCodeAction;
import com.commercetools.api.models.cart.CartRemoveItemShippingAddressAction;
import com.commercetools.api.models.cart.CartRemoveLineItemAction;
import com.commercetools.api.models.cart.CartRemovePaymentAction;
import com.commercetools.api.models.cart.CartSetAnonymousIdAction;
import com.commercetools.api.models.cart.CartSetBillingAddressAction;
import com.commercetools.api.models.cart.CartSetCartTotalTaxAction;
import com.commercetools.api.models.cart.CartSetCountryAction;
import com.commercetools.api.models.cart.CartSetCustomFieldAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateAction;
import com.commercetools.api.models.cart.CartSetCustomShippingMethodAction;
import com.commercetools.api.models.cart.CartSetCustomTypeAction;
import com.commercetools.api.models.cart.CartSetCustomerEmailAction;
import com.commercetools.api.models.cart.CartSetCustomerGroupAction;
import com.commercetools.api.models.cart.CartSetCustomerIdAction;
import com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction;
import com.commercetools.api.models.cart.CartSetLineItemCustomTypeAction;
import com.commercetools.api.models.cart.CartSetLineItemPriceAction;
import com.commercetools.api.models.cart.CartSetLineItemShippingDetailsAction;
import com.commercetools.api.models.cart.CartSetLineItemTaxAmountAction;
import com.commercetools.api.models.cart.CartSetLineItemTaxRateAction;
import com.commercetools.api.models.cart.CartSetLineItemTotalPriceAction;
import com.commercetools.api.models.cart.CartSetLocaleAction;
import com.commercetools.api.models.cart.CartSetShippingAddressAction;
import com.commercetools.api.models.cart.CartSetShippingMethodAction;
import com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountAction;
import com.commercetools.api.models.cart.CartSetShippingMethodTaxRateAction;
import com.commercetools.api.models.cart.CartSetShippingRateInputAction;
import com.commercetools.api.models.cart.CartUpdateItemShippingAddressAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartUpdateActionImpl implements CartUpdateAction {

    private String action;

    @JsonCreator
    CartUpdateActionImpl() {
        this.action = "null";
    }
    

    
    public String getAction(){
        return this.action;
    }


}
