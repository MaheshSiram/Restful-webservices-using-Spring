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
        list.add(new Customer(1l,"Jack","Apple"));
        list.add(new Customer(2l,"Mahesh","Google"));
        list.add(new Customer(3l,"Alia","Amazon"));
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
