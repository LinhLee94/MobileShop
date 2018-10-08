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
public class Categories {
    private int id;
    private String categoriesName;
    private int parentId;
    private int priority;
    private int status;

    public Categories() {
    }

    public Categories(int id, String categoriesName, int parentId, int priority, int status) {
        this.id = id;
        this.categoriesName = categoriesName;
        this.parentId = parentId;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
