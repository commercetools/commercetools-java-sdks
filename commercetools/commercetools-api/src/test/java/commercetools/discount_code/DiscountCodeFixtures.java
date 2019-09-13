package commercetools.discount_code;

import com.commercetools.models.cart_discount.CartDiscount;
import com.commercetools.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.models.cart_discount.CartDiscountResourceIdentifierBuilder;
import com.commercetools.models.discount_code.DiscountCode;
import com.commercetools.models.discount_code.DiscountCodeDraft;
import com.commercetools.models.discount_code.DiscountCodeDraftBuilder;
import commercetools.cart_discount.CartDiscountFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DiscountCodeFixtures {
    
    public static void withDiscountCode(final Consumer<DiscountCode> consumer) {
        DiscountCode discountCode = createDiscountCode();
        consumer.accept(discountCode);
        deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
    }
    
    public static void withUpdateableDiscountCode(final UnaryOperator<DiscountCode> operator) {
        DiscountCode discountCode = createDiscountCode();
        discountCode = operator.apply(discountCode);
        deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
    }
    
    public static DiscountCode createDiscountCode() {
        CartDiscount cartDiscount = CartDiscountFixtures.createCartDiscount();
        CartDiscountResourceIdentifier cartDiscountReference = CartDiscountResourceIdentifierBuilder.of()
                .id(cartDiscount.getId())
                .build();
        
        DiscountCodeDraft discountCodeDraft = DiscountCodeDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .code(CommercetoolsTestUtils.randomString())
                .cartDiscounts(Arrays.asList(cartDiscountReference))
                .build();

        DiscountCode discountCode = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .discountCodes()
                .post(discountCodeDraft)
                .executeBlocking().getBody();

        Assertions.assertNotNull(discountCode);
        Assertions.assertEquals(discountCodeDraft.getCode(), discountCode.getCode());
        
        return discountCode;
    }
    
    public static DiscountCode deleteDiscountCode(final String id, final Long version) {
        DiscountCode discountCode = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .discountCodes()
                .withId(id)
                .delete()
                .addExpand("cartDiscounts[*]")
                .addVersion(version)
                .executeBlocking().getBody();

        discountCode.getCartDiscounts().forEach(cartDiscountReference -> {
            CartDiscountFixtures.deleteCartDiscount(cartDiscountReference.getId(), cartDiscountReference.getObj().getVersion()); 
        });

        Assertions.assertNotNull(discountCode);
        Assertions.assertEquals(discountCode.getId(), id);
        
        return discountCode;
    }
}
