package com.jt.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jt.pojo.BasePojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
//设置表名
@TableName("tb_item_cat")
public class ItemCat extends BasePojo{

	/**
	 * 商品
	 */
	private static final long serialVersionUID = 7609253706885922569L;
	//设置id自动增长
	@TableId(type = IdType.AUTO)
	private Long id;
	private Long parentId;
	private String name;
	private Integer status;
	private Integer sortOrder;
	private Integer isParent;
}
