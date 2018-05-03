package com.bozgold.payeezyclient.controller;

import com.bozgold.payeezyclient.controller.bean.PayResult;
import com.bozgold.payeezyclient.controller.bean.TokenPayRequest;
import com.bozgold.payeezyclient.controller.bean.TransactionInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.firstdata.payeezy.PayeezyClientHelper;
import com.firstdata.payeezy.models.transaction.PayeezyResponse;
import com.firstdata.payeezy.models.transaction.Token;
import com.firstdata.payeezy.models.transaction.TransactionRequest;
import com.firstdata.payeezy.models.transaction.Transarmor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PayeezyController {

    @Autowired
    private PayeezyClientHelper payeezyClientHelper;

    @RequestMapping(value = "/payeezy/index")
    public String getPage(){
        return "payeezy/index";
    }

    @RequestMapping(value = "/payeezy/pay", method = RequestMethod.POST)
    @ResponseBody
    public PayResult pay(@RequestBody TokenPayRequest payRequest) {
        TransactionRequest transactionRequest = new TransactionRequest();
        PayResult payResult = new PayResult();
        try {
            transactionRequest.setAmount(""+payRequest.getAmount());
            transactionRequest.setCurrency(""+payRequest.getCurrency());
            transactionRequest.setPaymentMethod("token");
            transactionRequest.setTransactionType("purchase");
            Token token = new Token();
            token.setTokenType("FDToken");
            Transarmor transarmor = new Transarmor();
            transarmor.setType(payRequest.getCardType());
            transarmor.setValue(payRequest.getTokenValue());
            transarmor.setName(payRequest.getCardHolder());
            transarmor.setExpiryDt(payRequest.getExpDate());
            token.setTokenData(transarmor);
            transactionRequest.setToken(token);
            PayeezyResponse response = payeezyClientHelper.doPrimaryTransaction(transactionRequest);
            ObjectMapper mapper = new ObjectMapper();
            payResult.setCode(response.getStatusCode());
            //System.out.println(response.getResponseBody());
            //System.out.println(response.getStatusCode());
            TransactionInfo transactionInfo = mapper.readValue(response.getResponseBody(), TransactionInfo.class);
            payResult.setDescription(transactionInfo.getTransactionStatus());
            System.out.println(transactionInfo);
        } catch (Exception e) {
            payResult.setCode(9999);
            payResult.setDescription(e.getMessage());
        }
        return payResult;
    }
}
