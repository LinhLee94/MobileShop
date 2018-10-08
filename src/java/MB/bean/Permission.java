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
public class Permission {
    private int id;
    private String permissionName;
    private int status;

    public Permission() {
    }

    public Permission(int id, String permissionName, int status) {
        this.id = id;
        this.permissionName = permissionName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
