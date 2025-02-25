package com.webank.wedatasphere.dss.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Dmp/Test")
public class TestController {

    @PostMapping("/selectMetaById")
    @ResponseBody
    public String selectMetaById(@RequestParam("sysid") String sysid) {
        return "TEST";
    }
}
