package system.warehouse.managment;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import system.warehouse.managment.pojo.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ManagmentApplicationTests {
		private final static String PRODUCTNAME = "TestProduct";
	private final static String DESCRIPTION = "This product cures cancer!";
	private final static String SKU = "FF002B";
	private final static double PRICE = 30.00;
	private final static String MEASURINGUNIT = "Kg";
	private final static String CUSTOMERNAME = "MyTestUser";
	private final static String PHONE = "070070070";
	private final static String EMAIL = "test@test.com";

	private final static String LOCATION = "Tetovo, North Macedonia";
	private final static Integer STOCK = 2;
	private final static Integer ONORDER = 1;
	private final static String SUPPLIERNAME = "TestSupplier";
	private final static String CONTACT = "070123456";
	private final static String ADDRESS = "TestAddress";
	private final static Boolean PAYMENT = false;
	private final static Integer INITIAL_BALANCE = 100;
	private final static Integer NEGATIVE_AMOUNT = -1;

	private Customer customer;
	private Inventory inventory;
	private Product product;
	private Supplier supplier;
	@Before("")
	public void setUpCustomer() {
		customer = new Customer(CUSTOMERNAME, PHONE, EMAIL);
	}

	@Before("")
	public void setUpProduct() {
		product = new Product(PRODUCTNAME,DESCRIPTION,SKU,PRICE,MEASURINGUNIT);
	}

	@Before("")
	public void setUpSupplier() {
		supplier = new Supplier(SUPPLIERNAME,CONTACT,ADDRESS,PAYMENT);
	}

	@Before("")
	public void setUpInventory() {
		inventory = new Inventory(LOCATION,product,STOCK,ONORDER,supplier);
	}

	@Test
	public void testCostumerConstructor() {
		assertEquals(CUSTOMERNAME, customer.getName());
		assertEquals(PHONE, customer.getPhone());
		assertEquals(EMAIL, customer.getEmail());
	}

	@Test
	public void testWithdrawWithNegativeAmount() throws NegativeAmountException {
		inventory.setStock(NEGATIVE_AMOUNT);

		assertEquals(STOCK, inventory.getStock());
	}

}
