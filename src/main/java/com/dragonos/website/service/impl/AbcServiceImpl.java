package com.dragonos.website.service.impl;

import com.dragonos.website.model.Abc;
import com.dragonos.website.dao.AbcMapper;
import com.dragonos.website.model.JsonResult;
import com.dragonos.website.service.AbcService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author linhu
 * @since 2022-10-11
 */
@Service
public class AbcServiceImpl extends ServiceImpl<AbcMapper, Abc> implements AbcService {

    @Override
    public JsonResult selectFisrt() {
        AbcMapper baseMapper = this.getBaseMapper();
        Abc abc = baseMapper.selectFirst();
        return new JsonResult(abc);
    }
}
