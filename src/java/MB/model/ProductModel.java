/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB.model;

import MB.bean.Product;
import MB.utility.ConnectionDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Linhlee
 */
public class ProductModel {
    public List<Product> getAllProduct(){
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> lsProduct = new ArrayList<>();
        conn = ConnectionDB.openconnection();
        try {
            callSt= conn.prepareCall("{call getAllProduct()}");
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                Product pro = new Product();
                pro.setId(rs.getInt("id"));
                pro.setProductId(rs.getString("product_id"));
                pro.setProductName(rs.getString("product_name"));
                pro.setPrice(rs.getFloat("price"));
                pro.setDescription(rs.getString("description"));
                pro.setImage(rs.getString("image"));
                pro.setDiscout(rs.getFloat("discout"));
                pro.setFromDate(rs.getString("from_date"));
                pro.setToDate(rs.getString("to_date"));
                pro.setViewCount(rs.getInt("view_count"));
                pro.setSaleCount(rs.getInt("sale_count"));
                pro.setCreatedDate(rs.getString("created_date"));
                pro.setStatus(rs.getInt("status"));
                pro.setProductLeft(rs.getInt("product_left"));
                pro.setExplainId(rs.getInt("explain_id"));
                pro.setProviderId(rs.getInt("provider_id"));
                pro.setCatagoriesId(rs.getInt("categories_id"));
                lsProduct.add(pro);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeconnection(conn, callSt);
        }
        return lsProduct;
    }
}
