package com.webank.wedatasphere.dss.service.impl;

import com.webank.wedatasphere.dss.domain.dto.MetaLoadParams;
import com.webank.wedatasphere.dss.domain.entity.DmpMeta;
import com.webank.wedatasphere.dss.mapper.DmpMetaMapper;
import com.webank.wedatasphere.dss.service.IMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaServiceImpl  implements IMetaService {

    @Autowired
    private DmpMetaMapper m_dmpMetaMapper;
    @Override
    public List<DmpMeta> selectMetaList(MetaLoadParams params) {
        return m_dmpMetaMapper.selectForList(params);
    }
}
