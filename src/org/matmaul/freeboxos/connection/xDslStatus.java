package org.matmaul.freeboxos.connection;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class xDslStatus {
	protected internalXdslStatus status;
	//protected internalXdslStats down;
	//protected internalXdslStats up;
	
	public static class internalXdslStatus {
		public String status; 		// enum ro down, training,started,chan_analysis,msg_exchange,showtime,disabled
		public String protocol; 	// enum ro t1414, adsl1_a, adsl2_a, adsl2plus_a, readsl2, adsl2_m, adsl2plus_m, unknown
		public String modulation; 	// enum ro adsl, vdsl
		public Long uptime;
	}
//	public static class internalXdslStats {
//		public Long maxrate;
//		public Long rate;
//		public Long snr;
//		public Long attn;
//		public Long snr_10;
//		public Long attn_10;
//		public Long fec;
//		public Long crc;
//		public Long hec;
//		public Long es;
//		public Long ses;
//		public Boolean phyr;
//		public Boolean ginp;
//		public Boolean nitro;
//		public Long rxmt;
//		public Long rxmt_corr;
//		public Long rxmt_uncorr;
//		public Long rtx_tx;
//		public Long rtx_c;
//		public Long rtx_uc;
//		public Long leftrs;
//	}
	
	public String getStatus() {
		return status.status;
	}
	public String getProtocol() {
		return status.protocol;
	}
	public String getModulation() {
		return status.modulation;
	}
	public Long getUptime() {
		return status.uptime;
	}

//	public Long getDownMaxRate() {
//		return down.maxrate;
//	}
//	public Long getDownRate() {
//		return down.rate;
//	}
//	public Long getDownSnr() {
//		return down.snr;
//	}
//	public Long getDownAttn() {
//		return down.attn;
//	}
//	public Long getDownSnr10() {
//		return down.snr_10;
//	}
//	public Long getDownAttn10() {
//		return down.attn_10;
//	}
//	public Long getDownFec() {
//		return down.fec;
//	}
//	public Long getDownCrc() {
//		return down.crc;
//	}
//	public Long getDownHec() {
//		return down.hec;
//	}
//	public Long getDownEs() {
//		return down.es;
//	}
//	public Long getDownSes() {
//		return down.ses;
//	}
//	public Boolean getDownPhyR() {
//		return down.phyr;
//	}
//	public Boolean getDownGInp() {
//		return down.ginp;
//	}
//	public Boolean getDownNitro() {
//		return down.nitro;
//	}
//	public Long getDownRxmt() {
//		return down.rxmt;
//	}
//	public Long getDownRxmtCorr() {
//		return down.rxmt_corr;
//	}
//	public Long getDownRxmtUncorr() {
//		return down.rxmt_uncorr;
//	}
//	public Long getDownRtxTx() {
//		return down.rtx_tx;
//	}
//	public Long getDownRtxC() {
//		return down.rtx_c;
//	}
//	public Long getDownRtxUc() {
//		return down.rtx_uc;
//	}
	
//	public Long getUpMaxRate() {
//		return up.maxrate;
//	}
//	public Long getUpRate() {
//		return up.rate;
//	}
//	public Long getUpSnr() {
//		return up.snr;
//	}
//	public Long getUpAttn() {
//		return up.attn;
//	}
//	public Long getUpSnr10() {
//		return up.snr_10;
//	}
//	public Long getUpAttn10() {
//		return up.attn_10;
//	}
//	public Long getUpFec() {
//		return up.fec;
//	}
//	public Long getUpCrc() {
//		return up.crc;
//	}
//	public Long getUpHec() {
//		return up.hec;
//	}
//	public Long getUpEs() {
//		return up.es;
//	}
//	public Long getUpSes() {
//		return up.ses;
//	}
//	public Boolean getUpPhyR() {
//		return up.phyr;
//	}
//	public Boolean getUpGInp() {
//		return up.ginp;
//	}
//	public Boolean getUpNitro() {
//		return up.nitro;
//	}
//	public Long getUpRxmt() {
//		return up.rxmt;
//	}
//	public Long getUpRxmtCorr() {
//		return up.rxmt_corr;
//	}
//	public Long getUpRxmtUncorr() {
//		return up.rxmt_uncorr;
//	}
//	public Long getUpRtxTx() {
//		return up.rtx_tx;
//	}
//	public Long getUpRtxC() {
//		return up.rtx_c;
//	}
//	public Long getUpRtxUc() {
//		return up.rtx_uc;
//	}
}
