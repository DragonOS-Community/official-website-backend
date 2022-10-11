package com.dragonos.website.dao;

import com.dragonos.website.model.Abc;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author linhu
 * @since 2022-10-11
 */
public interface AbcMapper extends BaseMapper<Abc> {

    Abc selectFirst();
}
