package com.webank.wedatasphere.dss.controller;

import com.webank.wedatasphere.dss.domain.dto.MetaLoadParams;
import com.webank.wedatasphere.dss.domain.entity.DmpMeta;
import com.webank.wedatasphere.dss.service.IMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dmp/Meta")
public class MetaController {
    @Autowired
    IMetaService m_MetaService;
    @GetMapping("/selectMetaList.do")
    @ResponseBody
    public List<DmpMeta> selectMetaList(@ModelAttribute MetaLoadParams params) {
        return m_MetaService.selectMetaList(params);
    }
}
