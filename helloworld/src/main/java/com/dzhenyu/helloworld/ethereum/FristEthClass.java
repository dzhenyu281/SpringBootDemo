package com.dzhenyu.helloworld.ethereum;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.parity.Parity;

@RestController
public class FristEthClass {

    public Parity parity;

    public static Web3j web3j ;

    static{
        web3j = Web3j.build(new HttpService("httP://localhost/8545"));
    }

    @GetMapping("/eth/")
    public String test(){
//        web3j.
        return "te";
    }

}
