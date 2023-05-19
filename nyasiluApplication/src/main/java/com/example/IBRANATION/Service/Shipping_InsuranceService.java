package com.example.IBRANATION.Service;

import com.example.IBRANATION.Entity.Shipping_Insurance;

import java.util.List;

public interface Shipping_InsuranceService {

    //Create
    Shipping_Insurance addShipping_Insurance(Shipping_Insurance shipping_insurance);
    //Get all Shipping_insurance
    List<Shipping_Insurance> getAllShipping_Insurance();
    //Get Shipping_Insurance By id
    Shipping_Insurance getShipping_InsuranceById(Long id);
    //update
    Shipping_Insurance updateShipping_Insurance(Long id,Shipping_Insurance shipping_insurance);
        //Delete
    void DeleteShipping_Insurance(Long id);
}
