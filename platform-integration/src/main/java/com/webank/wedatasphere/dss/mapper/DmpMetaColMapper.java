package com.webank.wedatasphere.dss.mapper;


import com.webank.wedatasphere.dss.domain.dto.MetaColLoadParams;
import com.webank.wedatasphere.dss.domain.entity.DmpMetaCol;

import java.util.List;

public interface DmpMetaColMapper {


    List<DmpMetaCol> selectForList(MetaColLoadParams params);

}