package org.matmaul.freeboxos.call;

//import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.*;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class CallEntry {
	protected Long id;
	protected String type;
	protected Long timestamp;
	protected Long datetime;
	protected String number;
	protected String name;
	protected Integer duration;
	protected Long contact_id;
	protected Long line_id;	

	@JsonProperty("new")
	protected Boolean _new_;
	
	public Long getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public String getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public Integer getDuration() {
		return duration;
	}
	public Boolean is_new_() {
		return _new_;
	}
	public Long getContact_id() {
		return contact_id;
	}
	public void setNew(Boolean _new_) {
		this._new_ = _new_;
	}
	
	public Long getDateTime() {
		return datetime;
	}
	
	public Long getLine_id() {
		return line_id;
	}
	
}