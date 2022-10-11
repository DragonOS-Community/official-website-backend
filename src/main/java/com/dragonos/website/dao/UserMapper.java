package com.dragonos.website.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dragonos.website.common.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author linhu
 * @since 2021-10-02
 */
@Repository
public interface UserMapper extends BaseMapper<Object> {


    Integer getTotal(@Param("shopId") Integer shopId);

}
