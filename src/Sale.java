public class Sale {
    private String date;
    private double serviceExpense;
    private double productExpense;
    private Customer customer;

    public Sale(String date, Customer customer) {
        this.date = date;
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalExpense() {
        double serviceDiscount = serviceExpense * customer.getServiceMemberDiscount();
        double productDiscount = productExpense * customer.getProductMemberDiscount();
        return serviceExpense - serviceDiscount + productExpense - productDiscount;
    }

    public void displayInfo() {
        System.out.println("Sale Date: " + date);
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Service Expense: $" + serviceExpense);
        System.out.println("Product Expense: $" + productExpense);
        System.out.println("Total Expense: $" + getTotalExpense());
        System.out.println();
    }
}