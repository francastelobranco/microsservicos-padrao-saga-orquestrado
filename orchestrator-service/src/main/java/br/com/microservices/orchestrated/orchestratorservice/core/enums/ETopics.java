package br.com.microservices.orchestrated.orchestratorservice.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ETopics {

    START_SAGA("start-saga"),
    BASE_ORCHESTRATOR("orchestrator"),
    FINISH_SUCESS("finish-sucess"),
    FINISH_FAIL("finish-fail"),
    PRODUCT_VALIDATION_SUCESS("product-validation-success"),
    PRODUCT_VALIDATION_FAIL("product-validation-fail"),
    PAYMENT_VALIDATION_SUCESS("payment-success"),
    PAYMENT_VALIDATION_FAILED("payment-fail"),
    INVENTORY_VALIDATION_SUCESS("inventory-success"),
    INVENTORY_VALIDATION_FAILED("inventory-fail"),
    NOTIFY_ENDING("notify-ending");

    private String topic;
}
