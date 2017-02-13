package com.newproject.ws.controller;

import com.newproject.ws.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahesh on 12/12/2017.
 */
@Controller
@RequestMapping("/customers")
public class CustomerController {

    private static List<Customer> list = new ArrayList<Customer>();

    static {
        list.add(new Customer(1l,"Jack","Apple", 1l));
        list.add(new Customer(2l,"John","Apple", 1l));
        list.add(new Customer(3l,"Alex","Apple", 1l));
        list.add(new Customer(4l,"Salaj","Apple", 1l));

        list.add(new Customer(1l,"Mahesh","Google", 2l));
        list.add(new Customer(2l,"Mitra","Google", 2l));
        list.add(new Customer(2l,"Tom","Google", 2l));
        list.add(new Customer(2l,"Sam","Google", 2l));

        list.add(new Customer(3l,"Christy","Amazon", 3l));
        list.add(new Customer(3l,"Nile","Amazon", 3l));
        list.add(new Customer(3l,"Sunny","Amazon", 3l));
        list.add(new Customer(3l,"David","Amazon", 3l));

    }

    @RequestMapping(value = "" ,method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Customer>getAllCustomers(){
        return list;
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Customer getCustomer(@PathVariable("id") Long id){
        for(Customer c: list) {
            if (c.getId()==(id)) {
                return c;
            }
        }
        return null;
    }






}
