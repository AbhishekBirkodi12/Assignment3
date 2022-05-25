package com.example.PackagingAndDeliveryService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PackagingAndDeliveryService.entity.ChargeDetails;
import com.example.PackagingAndDeliveryService.entity.PackageAndDeliveryCostDetail;

@Service
public class PackagingAndDeliveryService {

    @Autowired
    PackageAndDeliveryCostDetail detail;

    public ChargeDetails getPackagingAndDeliveryCharge(String componentType, int count) {
        ChargeDetails chargeDetails = new ChargeDetails();
        if (componentType.equalsIgnoreCase("integral") && count > 0) {
            int charge = (detail.getIntegraItem()*count)+(detail.getIntegralItemDeliveryCharge()*count)+detail.getProtectiveSheath();
            chargeDetails.setProcessingAndDeliveryCharge(charge);
            return chargeDetails;

        }

        else if(componentType.equalsIgnoreCase("accessory") && count > 0){
            int charge = (detail.getAcessory()*count)+(detail.getAccessoryDeliveryCharge()*count)+detail.getProtectiveSheath();
            chargeDetails.setProcessingAndDeliveryCharge(charge);
            return chargeDetails;

        }
        return chargeDetails;
    }

}
