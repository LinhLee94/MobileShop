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
public class Product {
    private int id;
    private String productId;
    private String productName;
    private float price;
    private String description;
    private String image;
    private float discout;
    private String fromDate;
    private String toDate;
    private int viewCount;
    private int saleCount;
    private String createdDate;
    private int status;
    private int productLeft;
    private int explainId;
    private int providerId;
    private int catagoriesId;

    public Product() {
    }

    public Product(int id, String productId, String productName, float price, String description, String image, float discout, String fromDate, String toDate, int viewCount, int saleCount, String createdDate, int status, int productLeft, int explainId, int providerId, int catagoriesId) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.image = image;
        this.discout = discout;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.viewCount = viewCount;
        this.saleCount = saleCount;
        this.createdDate = createdDate;
        this.status = status;
        this.productLeft = productLeft;
        this.explainId = explainId;
        this.providerId = providerId;
        this.catagoriesId = catagoriesId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getDiscout() {
        return discout;
    }

    public void setDiscout(float discout) {
        this.discout = discout;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getProductLeft() {
        return productLeft;
    }

    public void setProductLeft(int productLeft) {
        this.productLeft = productLeft;
    }

    public int getExplainId() {
        return explainId;
    }

    public void setExplainId(int explainId) {
        this.explainId = explainId;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public int getCatagoriesId() {
        return catagoriesId;
    }

    public void setCatagoriesId(int catagoriesId) {
        this.catagoriesId = catagoriesId;
    }

    
    
    
}
