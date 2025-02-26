package com.webank.wedatasphere.dss.service.impl;


import com.webank.wedatasphere.dss.domain.dto.MetaColLoadParams;
import com.webank.wedatasphere.dss.domain.entity.DmpMetaCol;
import com.webank.wedatasphere.dss.mapper.DmpMetaColMapper;
import com.webank.wedatasphere.dss.mapper.DmpMetaMapper;
import com.webank.wedatasphere.dss.service.IMetaColService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaColServiceImpl implements IMetaColService {
    @Autowired
    private DmpMetaColMapper m_dmpMetaColMapper;

    @Override
    public List<DmpMetaCol> selectMetaColList(MetaColLoadParams params) {
        return m_dmpMetaColMapper.selectForList(params);
    }





}
