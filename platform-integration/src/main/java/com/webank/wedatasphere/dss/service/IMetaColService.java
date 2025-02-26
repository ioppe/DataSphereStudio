package com.webank.wedatasphere.dss.service;

import com.webank.wedatasphere.dss.domain.dto.MetaColLoadParams;
import com.webank.wedatasphere.dss.domain.entity.DmpMetaCol;

import java.util.List;

public interface IMetaColService {


    List<DmpMetaCol> selectMetaColList( MetaColLoadParams params);


}
