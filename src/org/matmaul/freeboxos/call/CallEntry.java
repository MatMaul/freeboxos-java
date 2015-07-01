package org.matmaul.freeboxos.call;

//import org.codehaus.jackson.annotate.JsonAutoDetect;
import java.util.Calendar;

import org.codehaus.jackson.annotate.*;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class CallEntry {
	protected long id;
	protected String type; // missed, accepted, outgoing
	protected long datetime;
	protected String number;
	protected String name;
	protected long duration;
	protected long contact_id;
	protected long line_id;	

	@JsonProperty("new")
	protected Boolean _new_;
	
	public long getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public long getDuration() {
		return duration;
	}
	
	public Boolean is_new_() {
		return _new_;
	}
	
	public long getContact_id() {
		return contact_id;
	}
	
	public void setNew(Boolean _new_) {
		this._new_ = _new_;
	}
	
	public long getDateTime() {
		return datetime;
	}
	
	public Calendar getTimeStamp() {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(datetime * 1000);
		return c;
	}
	
	public long getLine_id() {
		return line_id;
	}
	
}
