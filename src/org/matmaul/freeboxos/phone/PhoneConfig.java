package org.matmaul.freeboxos.phone;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)

public class PhoneConfig {
   private String network;
   private Boolean dect_eco_mode;
   private String dect_pin;
   private Integer dect_ring_pattern;
   private Boolean dect_registration;
   private Boolean dect_nemo_mode;
   private Boolean dect_enabled;
   private Boolean dect_ring_on_off;
 
   public String getNetwork() {
	   return network;
   }

   public void setNetwork(String network) {
	   this.network = network;
   }

   public Boolean getDect_eco_mode() {
	   return dect_eco_mode;
   }

   public void setDect_eco_mode(Boolean dect_eco_mode) {
	   this.dect_eco_mode = dect_eco_mode;
   }

   public String getDect_pin() {
	   return dect_pin;
   }

   public void setDect_pin(String dect_ping) {
	   this.dect_pin = dect_ping;
   }

   public Integer getDect_ring_pattern() {
	   return dect_ring_pattern;
   }

   public void setDect_ring_pattern(Integer dect_ring_pattern) {
	   this.dect_ring_pattern = dect_ring_pattern;
   }

   public Boolean getDect_registration() {
	   return dect_registration;
   }

   public void setDect_registration(Boolean dect_registration) {
	   this.dect_registration = dect_registration;
   }

   public Boolean getDect_nemo_mode() {
	   return dect_nemo_mode;
   }

   public void setDect_nemo_mode(Boolean dect_nemo_mode) {
	   this.dect_nemo_mode = dect_nemo_mode;
   }

   public Boolean getDect_enabled() {
	   return dect_enabled;
   }

   public void setDect_enabled(Boolean dect_enabled) {
	   this.dect_enabled = dect_enabled;
   }

   public Boolean getDect_ring_on_off() {
	   return dect_ring_on_off;
   }

   public void setDect_ring_on_off(Boolean dect_ring_on_off) {
	   this.dect_ring_on_off = dect_ring_on_off;
   }
}
