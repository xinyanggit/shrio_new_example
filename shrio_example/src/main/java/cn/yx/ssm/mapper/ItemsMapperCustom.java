package cn.yx.ssm.mapper;

import java.util.List;

import cn.yx.ssm.po.ItemsCustom;
import cn.yx.ssm.po.ItemsQueryVo;

/**
 * 
 * <p>
 * Title: ItemsMapperCustom
 * </p>
 * <p>
 * Description:商品自定义mapper
 * </p>
 * <p>
 * yx
 * </p>
 * 
 * @author yx
 * @date 2015-3-20下午3:00:53
 * @version 1.0
 */
public interface ItemsMapperCustom {
	// 商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception;

}
