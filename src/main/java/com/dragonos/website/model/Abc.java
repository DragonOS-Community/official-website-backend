package com.dragonos.website.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author linhu
 * @since 2022-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Abc对象", description="")
public class Abc implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "a", type = IdType.AUTO)
    private Integer a;

    private Integer b;

    private Integer c;


}
