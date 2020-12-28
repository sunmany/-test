package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class FileImage {

	private Integer error = 0; //默认正常  1表示失败
	private String url; //网络访问的虚拟地址
	private Integer width;
	private Integer height;
}
