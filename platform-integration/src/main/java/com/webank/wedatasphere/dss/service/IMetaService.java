package com.webank.wedatasphere.dss.service;

import com.webank.wedatasphere.dss.domain.dto.MetaLoadParams;
import com.webank.wedatasphere.dss.domain.entity.DmpMeta;

import java.util.List;

public interface IMetaService {
    List<DmpMeta> selectMetaList(MetaLoadParams params);
}
