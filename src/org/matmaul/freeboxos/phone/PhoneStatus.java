package org.matmaul.freeboxos.phone;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)

public class PhoneStatus {
   private Boolean is_ringing;
   private String type;
   private Long id;
   private Integer gain_tx;
   private String vendor;
   private Integer gain_rx;
   private Boolean on_hook;
   private Boolean hardware_defect;
   private Long type_id;
   
   public Boolean getIs_ringing() {
	   return is_ringing;
   }
   
   public String getType() {
	   return type;
   }

   public Long getId() {
	   return id;
   }

   protected void setId(Long id) {
	   this.id = id;
   }

   public Integer getGain_tx() {
	   return gain_tx;
   }

   protected void setGain_tx(Integer gain_tx) {
	   this.gain_tx = gain_tx;
   }

   public String getVendor() {
	   return vendor;
   }

   protected void setVendor(String vendor) {
	   this.vendor = vendor;
   }

   public Integer getGain_rx() {
	   return gain_rx;
   }

   protected void setGain_rx(Integer gain_rx) {
	   this.gain_rx = gain_rx;
   }

   public Boolean getOn_hook() {
	   return on_hook;
   }

   protected void setOn_hook(Boolean on_hook) {
	   this.on_hook = on_hook;
   }

   public Boolean getHardware_defect() {
	   return hardware_defect;
   }

   public Long getType_id() {
	   return type_id;
   }

   protected void setType_id(Long type_id) {
	   this.type_id = type_id;
   }

}
