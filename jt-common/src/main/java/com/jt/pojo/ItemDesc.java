package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_item_desc")
public class ItemDesc extends BasePojo{

	private static final long serialVersionUID = -3532471496881435303L;
	@TableId
	private Long itemId;
	private String itemDesc;
}
