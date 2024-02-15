public class Customer implements DiscountRate {
    private String customerName;
    private String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
        if (customerType.equals("Premium")) {
            return 0.2;
        } else if (customerType.equals("Gold")) {
            return 0.15;
        } else if (customerType.equals("Silver")) {
            return 0.1;
        } else {
            return 0;
        }
    }

    @Override
    public double getProductMemberDiscount() {
        if (customerType.equals("Premium")) {
            return 0.1;
        } else if (customerType.equals("Gold")) {
            return 0.05;
        } else if (customerType.equals("Silver")) {
            return 0.02;
        } else {
            return 0;
        }
    }
}