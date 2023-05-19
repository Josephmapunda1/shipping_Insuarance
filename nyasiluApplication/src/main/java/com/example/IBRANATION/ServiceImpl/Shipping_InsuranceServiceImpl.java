package com.example.IBRANATION.ServiceImpl;

import com.example.IBRANATION.Entity.Shipping_Insurance;
import com.example.IBRANATION.Exception.Shipping_InsuranceException;
import com.example.IBRANATION.Repository.Shipping_InsuranceRepository;
import com.example.IBRANATION.Service.Shipping_InsuranceService;

import java.util.List;

public class Shipping_InsuranceServiceImpl implements Shipping_InsuranceService {
    private Shipping_InsuranceRepository shipping_insuranceRepository;

    public Shipping_InsuranceServiceImpl(Shipping_InsuranceRepository shipping_insuranceRepository) {
        this.shipping_insuranceRepository = shipping_insuranceRepository;
    }

    @Override
    public Shipping_Insurance addShipping_Insurance(Shipping_Insurance shipping_insurance) {
        return shipping_insuranceRepository.save(shipping_insurance);
    }

    @Override
    public List<Shipping_Insurance> getAllShipping_Insurance() {
        return shipping_insuranceRepository.findAll();
    }

    @Override
    public Shipping_Insurance getShipping_InsuranceById(Long id) {
        Shipping_Insurance shipping_insurance=shipping_insuranceRepository.findById(id)
                .orElseThrow(()->new Shipping_InsuranceException("Not found"));
        return shipping_insurance;
    }

    @Override
    public Shipping_Insurance updateShipping_Insurance(Long id, Shipping_Insurance shipping_insurance) {
     Shipping_Insurance shipping_insurance1=shipping_insuranceRepository.findById(id)
             .orElseThrow(()->new Shipping_InsuranceException("Not found"));
     shipping_insurance1.setShipping_InsuranceID(shipping_insurance.getShipping_InsuranceID());
     shipping_insurance1.setShipping_InsuranceName(shipping_insurance.getShipping_InsuranceName());
     shipping_insurance1.setShipping_insuranceAmount(shipping_insurance.getShipping_insuranceAmount());
     Shipping_Insurance updateShipping_Insurance=shipping_insuranceRepository.save(shipping_insurance);
        return updateShipping_Insurance;
    }

    @Override
    public void DeleteShipping_Insurance(Long id) {
        Shipping_Insurance shipping_insurance=shipping_insuranceRepository.findById(id)
                .orElseThrow(()->new Shipping_InsuranceException(("Not found")));
        shipping_insuranceRepository.delete(shipping_insurance);
    }
}
