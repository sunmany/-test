package com.jt.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)	//链式加载
@NoArgsConstructor			//有参数
@AllArgsConstructor			//无参数
public class EasyUITable<T> {

	private Integer total;
	private List<T> rows;
}
