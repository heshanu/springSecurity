package com.example.productSerivce.dto;

import java.math.BigDecimal;

public class Coupen {
    private Long id;
    private String code;
    private BigDecimal discoint;
    private String expDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getDiscoint() {
        return discoint;
    }

    public void setDiscoint(BigDecimal discoint) {
        this.discoint = discoint;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }


}
