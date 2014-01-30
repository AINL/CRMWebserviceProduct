/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.amnesty.crm.product;

import java.util.Currency;
import java.util.Locale;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import nl.amnesty.crm.entity.Product;

/**
 *
 * @author ed
 * algemene webservices uitgezet uit beveiligingsoogpunt
 */
@WebService()
@Stateless()
public class ProductCRUD {

    private long productid;
    private String name;
    private String description;
    private Currency price;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dummy")
    public String dummy() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     
    @WebMethod(operationName = "create")
    public long create(@WebParam(name = "Name") String name,
            @WebParam(name = "Description") String description,
            @WebParam(name = "Price") int price) {
        //TODO write your implementation code here:
        long productid = 123456789;
        return productid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "read")
    public Product read(long productid) {
        //TODO write your implementation code here:
        Product product = new Product();
        product.setName("Name");
        product.setDescription("Description");
        product.setPrice(123);
        return product;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "update")
    public long update(@WebParam(name = "Productid") long productid, 
            @WebParam(name = "Name") String name,
            @WebParam(name = "Description") String description,
            @WebParam(name = "Price") int price) {
        //TODO write your implementation code here:
        return productid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "delete")
    public long delete(long productid) {
        //TODO write your implementation code here:
        return productid;
    }
    */
}
