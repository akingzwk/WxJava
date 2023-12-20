package cn.binarywang.wx.miniapp.bean.product;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import lombok.Data;

@Data
public class WxMinishopUpdateGoodsSkuData implements Serializable {
  private static final long serialVersionUID = -2596988603027040989L;
  @SerializedName("sku_id")
  private Long skuId;
  @SerializedName("out_sku_id")
  private String outSkuId;
  @SerializedName("update_time")
  private String updateTime;
}
