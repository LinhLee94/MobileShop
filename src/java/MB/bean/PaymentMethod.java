/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB.bean;

/**
 *
 * @author Linhlee
 */
public class PaymentMethod {
    private int id;
    private String paymentName;

    public PaymentMethod() {
    }

    public PaymentMethod(int id, String paymentName) {
        this.id = id;
        this.paymentName = paymentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }
    
    
}
