package finals.discountRate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
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

    @Override
    public String toString() {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        return "Visit(" +
                "customer=" + customer.toString() +
                ", date=" + simpleDateFormat.format(date) +
                ", serviceExpense=" + getServiceExpense() +
                ", productExpense=" + getProductExpense() +
                ')';
    }

    public double getTotalExpense() {
        return (getProductExpense() - getProductExpense() * DiscountRate.getProductDiscountRate(customer.getMemberType())) +
                (getServiceExpense() - getServiceExpense() * DiscountRate.getServiceDiscountRate(customer.getMemberType()));
    }
}
