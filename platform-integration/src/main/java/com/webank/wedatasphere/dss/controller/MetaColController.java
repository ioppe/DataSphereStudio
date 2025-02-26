package com.webank.wedatasphere.dss.controller;

import com.webank.wedatasphere.dss.domain.dto.MetaColLoadParams;
import com.webank.wedatasphere.dss.domain.entity.DmpMetaCol;
import com.webank.wedatasphere.dss.service.IMetaColService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dmp/MetaCol")
public class MetaColController {
    @Autowired
    IMetaColService m_MetaColService;
    /**
     * 查询列表
     *
     * @param params 查询参数
     * @return 列表数据
     */
    @GetMapping("/selectMetaColList")
    @ResponseBody
    public List<DmpMetaCol> selectMetaColList(@ModelAttribute MetaColLoadParams params) {
        return m_MetaColService.selectMetaColList( params);
    }
}
