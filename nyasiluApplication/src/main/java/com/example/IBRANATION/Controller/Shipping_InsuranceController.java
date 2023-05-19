package com.example.IBRANATION.Controller;

import com.example.IBRANATION.Entity.Shipping_Insurance;
import com.example.IBRANATION.Service.Shipping_InsuranceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Shipping_Insurance")
public class Shipping_InsuranceController {

Shipping_InsuranceService shipping_insuranceService;

    public Shipping_InsuranceController(Shipping_InsuranceService shipping_insuranceService) {
        this.shipping_insuranceService = shipping_insuranceService;
    }
    //Create
    @PostMapping
    public ResponseEntity<Shipping_Insurance> addShipping_Insurance(@RequestBody Shipping_Insurance shipping_insurance){
        return new ResponseEntity<>(shipping_insuranceService.addShipping_Insurance(shipping_insurance), HttpStatus.CREATED);
    }
    //Get all Shipping_Insurance
    @GetMapping
    public List<Shipping_Insurance> getAllShipping_Insurance(){
        return shipping_insuranceService.getAllShipping_Insurance();
    }
    //get Shipping_Insurance By id
    @GetMapping({"id"})
    public ResponseEntity<Shipping_Insurance> getById(@PathVariable Long id){
        return new ResponseEntity<>(shipping_insuranceService.getShipping_InsuranceById(id), HttpStatus.OK);
    }
    //Update
    @PutMapping({"id"})
    public ResponseEntity<Shipping_Insurance> updateShipping_insurance(@PathVariable Long id, @RequestBody Shipping_Insurance shipping_insurance){
        return new ResponseEntity<>(shipping_insuranceService.updateShipping_Insurance(id,shipping_insurance), HttpStatus.OK);
    }
    //Delete
    @DeleteMapping({"id"})
    public ResponseEntity<String> DeleteShipping_Insurance(@PathVariable Long id){
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }
}