package org.omidbiz.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.omidbiz.component.UILovCloseButton;

public class HtmlLovCloseButton extends UILovCloseButton{

static final public  String COMPONENT_FAMILY = "org.omidbiz.LovCloseButton";

static final public  String COMPONENT_TYPE = "org.omidbiz.LovCloseButton";

/*
* This attribute assigns an access key to an element. An access key is a single character from the document character set. Note: Authors should consider the input method of the expected reader when specifying an accesskey
*/
private  String _accesskey = null;

/*
* boolean attribute which provides possibility to limit JSF tree processing(decoding, conversion/validation, value applying) 
to the component which send the request only
*/
private  boolean _ajaxSingle = false;

private  boolean _ajaxSingleSet = false;

/*
* If "true", after process validations phase it skips updates of model beans on a force render response. It can be used for validating components input
*/
private  boolean _bypassUpdates = false;

private  boolean _bypassUpdatesSet = false;

/*
* The character encoding of a resource designated by this hyperlink
*/
private  String _charset = null;

/*
* This attribute specifies the position and shape on the screen. The number and order of values depends on the shape being defined. Possible combinations:
            
            * rect: left-x, top-y, right-x, bottom-y.
            * circle: center-x, center-y, radius. Note. When the radius value is percentage value, user agents should calculate the final radius value based on the associated object's width and height. The radius should be the smaller value of the two.
            * poly: x1, y1, x2, y2, ..., xN, yN. The first x and y coordinate pair and the last should be the same to close the polygon. When these coordinate values are not the same, user agents should infer an additional coordinate pair to close the polygon.
            
            Coordinates are relative to the top, left corner of the object. All values are lengths. All values are separated by commas
*/
private  String _coords = null;

/*
* Serialized (on default with JSON) data passed on the client by a developer on AJAX request. It's accessible via "data.foo" syntax
*/
private  Object _data = null;

/*
* Direction indication for text that does not inherit
			directionality. Valid values are "LTR" (left-to-right)
			and "RTL" (right-to-left)
*/
private  String _dir = null;

/*
* If true, disable this component on page.
*/
private  boolean _disabled = false;

private  boolean _disabledSet = false;

/*
* Name of requests queue to avoid send next request before complete other from same event. Can be used to reduce number of requests of frequently events (key press, mouse move etc.)
*/
private  String _eventsQueue = null;

/*
* id of element to set focus after request completed on client side
*/
private  String _focus = null;

/*
* Base language of a resource specified with the href attribute; hreflang may only be used with href
*/
private  String _hreflang = null;

/*
* Attribute allows to ignore an Ajax Response produced by a request if the newest 'similar' request is
in a queue already. ignoreDupResponses="true" does not cancel the request while it is processed on the server,
but just allows to avoid unnecessary updates on the client side if the response isn't actual now
*/
private  boolean _ignoreDupResponses = false;

private  boolean _ignoreDupResponsesSet = false;

/*
* Code describing the language used in the generated markup for this component
*/
private  String _lang = null;

/*
* If "true", then of all AJAX-rendered on the page components only those will be updated, 
		which ID's are passed to the "reRender" attribute of the describable component. 
		"false"-the default value-means that all components with ajaxRendered="true" will be updated.
*/
private  boolean _limitToList = false;

private  boolean _limitToListSet = false;

/*
* the most important attribute use for setting and retrieving value via javascript
*/
private  String _objectName = null;

/*
* The client side script method to be called before DOM is updated
*/
private  String _onbeforedomupdate = null;

/*
* JavaScript code. The onblur event occurs when an element loses focus either by the pointing device or by tabbing navigation. It may be used with the same elements as onfocus
*/
private  String _onblur = null;

/*
* The clientside script method to be called when the element is clicked
*/
private  String _onclick = null;

/*
* The client side script method to be called after the request is completed
*/
private  String _oncomplete = null;

/*
* The client side script method to be called when the element is double-clicked
*/
private  String _ondblclick = null;

/*
* JavaScript code. The onfocus event occurs when an element gets focus
*/
private  String _onfocus = null;

/*
* The client side script method to be called when a key is pressed down over the element
*/
private  String _onkeydown = null;

/*
* The client side script method to be called when a key is pressed over the element and released
*/
private  String _onkeypress = null;

/*
* The client side script method to be called when a key is released
*/
private  String _onkeyup = null;

/*
* The client side script method to be called when a mouse button is pressed down over the element
*/
private  String _onmousedown = null;

/*
* The client side script method to be called when a pointer is moved within the element
*/
private  String _onmousemove = null;

/*
* The client side script method to be called when a pointer is moved away from the element
*/
private  String _onmouseout = null;

/*
* The client side script method to be called when a pointer is moved onto the element
*/
private  String _onmouseover = null;

/*
* The client side script method to be called when a mouse button is released
*/
private  String _onmouseup = null;

/*
* it is used to show in textbox
*/
private  String _pValueText = null;

/*
* it is used for filling hidden field
*/
private  Object _pid = null;

/*
* Id['s] (in format of call  UIComponent.findComponent()) of components, processed at the phases 2-5 in case of AjaxRequest  caused by this component. Can be single id, comma-separated list of Id's, or EL Expression  with array or Collection
*/
private  Object _process = null;

/*
* Id['s] (in format of call  UIComponent.findComponent()) of components, rendered in case of AjaxRequest  caused by this component. Can be single id, comma-separated list of Id's, or EL Expression  with array or Collection
*/
private  Object _reRender = null;

/*
* The relationship from the current document to the anchor specified by this hyperlink. The value of this attribute is a space-separated list of link types
*/
private  String _rel = null;

/*
* Attribute defines the time (in ms.) that the request will be wait in the queue before it is ready to send.
When the delay time is over, the request will be sent to the server or removed if the newest 'similar' request is in a queue already
*/
private  int _requestDelay = Integer.MIN_VALUE;

private  boolean _requestDelaySet = false;

/*
* A reverse link from the anchor specified by this hyperlink to the current document. The value of this attribute is a space-separated list of link types
*/
private  String _rev = null;

/*
* This attribute specifies the shape of a region. The possible values are "default", "rect", "circle" and "poly".
*/
private  String _shape = null;

/*
* If there are any component requests with identical IDs then these requests will be grouped.
*/
private  String _similarityGroupingId = null;

/*
* ID (in format of call UIComponent.findComponent()) of Request status component
*/
private  String _status = null;

/*
* CSS style(s) is/are to be applied when this component is rendered
*/
private  String _style = null;

/*
* Corresponds to the HTML class attribute
*/
private  String _styleClass = null;

/*
* This attribute specifies the position of the current element in the tabbing order for the current document. This value must be a number between 0 and 32767. User agents should ignore leading zeros
*/
private  String _tabindex = null;

/*
* This attribute specifies the name of a frame where a document is to be opened.
            
            By assigning a name to a frame via the name attribute, authors can refer to it as the "target" of links defined by other elements
*/
private  String _target = null;

/*
* Timeout ( in ms ) for request.
*/
private  int _timeout = Integer.MIN_VALUE;

private  boolean _timeoutSet = false;

/*
* Advisory title information about markup elements generated for this component
*/
private  String _title = null;

/*
* The content type of the resource designated by this hyperlink
*/
private  String _type = null;


public HtmlLovCloseButton(){
setRendererType("org.omidbiz.LovCloseButtonRenderer");
}

public String getAccesskey(){
	if (this._accesskey != null) {
		return this._accesskey;
	}
	ValueExpression ve = getValueExpression("accesskey");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setAccesskey(String _accesskey){
this._accesskey = _accesskey;
}

public boolean isAjaxSingle(){
	if (this._ajaxSingleSet) {
	    return (this._ajaxSingle);
	}
	ValueExpression ve = getValueExpression("ajaxSingle");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._ajaxSingle);
	    }
	    
	    return value;
	} else {
	    return (this._ajaxSingle);
	}

}

public void setAjaxSingle(boolean _ajaxSingle){
this._ajaxSingle = _ajaxSingle;
this._ajaxSingleSet = true;
}

public boolean isBypassUpdates(){
	if (this._bypassUpdatesSet) {
	    return (this._bypassUpdates);
	}
	ValueExpression ve = getValueExpression("bypassUpdates");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._bypassUpdates);
	    }
	    
	    return value;
	} else {
	    return (this._bypassUpdates);
	}

}

public void setBypassUpdates(boolean _bypassUpdates){
this._bypassUpdates = _bypassUpdates;
this._bypassUpdatesSet = true;
}

public String getCharset(){
	if (this._charset != null) {
		return this._charset;
	}
	ValueExpression ve = getValueExpression("charset");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setCharset(String _charset){
this._charset = _charset;
}

public String getCoords(){
	if (this._coords != null) {
		return this._coords;
	}
	ValueExpression ve = getValueExpression("coords");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setCoords(String _coords){
this._coords = _coords;
}

public Object getData(){
	if (this._data != null) {
		return this._data;
	}
	ValueExpression ve = getValueExpression("data");
	if (ve != null) {
	    Object value = null;
	    
	    try {
			value = (Object) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setData(Object _data){
this._data = _data;
}

public String getDir(){
	if (this._dir != null) {
		return this._dir;
	}
	ValueExpression ve = getValueExpression("dir");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setDir(String _dir){
this._dir = _dir;
}

public boolean isDisabled(){
	if (this._disabledSet) {
	    return (this._disabled);
	}
	ValueExpression ve = getValueExpression("disabled");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._disabled);
	    }
	    
	    return value;
	} else {
	    return (this._disabled);
	}

}

public void setDisabled(boolean _disabled){
this._disabled = _disabled;
this._disabledSet = true;
}

public String getEventsQueue(){
	if (this._eventsQueue != null) {
		return this._eventsQueue;
	}
	ValueExpression ve = getValueExpression("eventsQueue");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setEventsQueue(String _eventsQueue){
this._eventsQueue = _eventsQueue;
}

public String getFocus(){
	if (this._focus != null) {
		return this._focus;
	}
	ValueExpression ve = getValueExpression("focus");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setFocus(String _focus){
this._focus = _focus;
}

public String getHreflang(){
	if (this._hreflang != null) {
		return this._hreflang;
	}
	ValueExpression ve = getValueExpression("hreflang");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setHreflang(String _hreflang){
this._hreflang = _hreflang;
}

public boolean isIgnoreDupResponses(){
	if (this._ignoreDupResponsesSet) {
	    return (this._ignoreDupResponses);
	}
	ValueExpression ve = getValueExpression("ignoreDupResponses");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._ignoreDupResponses);
	    }
	    
	    return value;
	} else {
	    return (this._ignoreDupResponses);
	}

}

public void setIgnoreDupResponses(boolean _ignoreDupResponses){
this._ignoreDupResponses = _ignoreDupResponses;
this._ignoreDupResponsesSet = true;
}

public String getLang(){
	if (this._lang != null) {
		return this._lang;
	}
	ValueExpression ve = getValueExpression("lang");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setLang(String _lang){
this._lang = _lang;
}

public boolean isLimitToList(){
	if (this._limitToListSet) {
	    return (this._limitToList);
	}
	ValueExpression ve = getValueExpression("limitToList");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._limitToList);
	    }
	    
	    return value;
	} else {
	    return (this._limitToList);
	}

}

public void setLimitToList(boolean _limitToList){
this._limitToList = _limitToList;
this._limitToListSet = true;
}

public String getObjectName(){
	if (this._objectName != null) {
		return this._objectName;
	}
	ValueExpression ve = getValueExpression("objectName");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setObjectName(String _objectName){
this._objectName = _objectName;
}

public String getOnbeforedomupdate(){
	if (this._onbeforedomupdate != null) {
		return this._onbeforedomupdate;
	}
	ValueExpression ve = getValueExpression("onbeforedomupdate");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnbeforedomupdate(String _onbeforedomupdate){
this._onbeforedomupdate = _onbeforedomupdate;
}

public String getOnblur(){
	if (this._onblur != null) {
		return this._onblur;
	}
	ValueExpression ve = getValueExpression("onblur");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnblur(String _onblur){
this._onblur = _onblur;
}

public String getOnclick(){
	if (this._onclick != null) {
		return this._onclick;
	}
	ValueExpression ve = getValueExpression("onclick");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnclick(String _onclick){
this._onclick = _onclick;
}

public String getOncomplete(){
	if (this._oncomplete != null) {
		return this._oncomplete;
	}
	ValueExpression ve = getValueExpression("oncomplete");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOncomplete(String _oncomplete){
this._oncomplete = _oncomplete;
}

public String getOndblclick(){
	if (this._ondblclick != null) {
		return this._ondblclick;
	}
	ValueExpression ve = getValueExpression("ondblclick");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOndblclick(String _ondblclick){
this._ondblclick = _ondblclick;
}

public String getOnfocus(){
	if (this._onfocus != null) {
		return this._onfocus;
	}
	ValueExpression ve = getValueExpression("onfocus");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnfocus(String _onfocus){
this._onfocus = _onfocus;
}

public String getOnkeydown(){
	if (this._onkeydown != null) {
		return this._onkeydown;
	}
	ValueExpression ve = getValueExpression("onkeydown");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnkeydown(String _onkeydown){
this._onkeydown = _onkeydown;
}

public String getOnkeypress(){
	if (this._onkeypress != null) {
		return this._onkeypress;
	}
	ValueExpression ve = getValueExpression("onkeypress");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnkeypress(String _onkeypress){
this._onkeypress = _onkeypress;
}

public String getOnkeyup(){
	if (this._onkeyup != null) {
		return this._onkeyup;
	}
	ValueExpression ve = getValueExpression("onkeyup");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnkeyup(String _onkeyup){
this._onkeyup = _onkeyup;
}

public String getOnmousedown(){
	if (this._onmousedown != null) {
		return this._onmousedown;
	}
	ValueExpression ve = getValueExpression("onmousedown");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnmousedown(String _onmousedown){
this._onmousedown = _onmousedown;
}

public String getOnmousemove(){
	if (this._onmousemove != null) {
		return this._onmousemove;
	}
	ValueExpression ve = getValueExpression("onmousemove");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnmousemove(String _onmousemove){
this._onmousemove = _onmousemove;
}

public String getOnmouseout(){
	if (this._onmouseout != null) {
		return this._onmouseout;
	}
	ValueExpression ve = getValueExpression("onmouseout");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnmouseout(String _onmouseout){
this._onmouseout = _onmouseout;
}

public String getOnmouseover(){
	if (this._onmouseover != null) {
		return this._onmouseover;
	}
	ValueExpression ve = getValueExpression("onmouseover");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnmouseover(String _onmouseover){
this._onmouseover = _onmouseover;
}

public String getOnmouseup(){
	if (this._onmouseup != null) {
		return this._onmouseup;
	}
	ValueExpression ve = getValueExpression("onmouseup");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setOnmouseup(String _onmouseup){
this._onmouseup = _onmouseup;
}

public String getPValueText(){
	if (this._pValueText != null) {
		return this._pValueText;
	}
	ValueExpression ve = getValueExpression("pValueText");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setPValueText(String _pValueText){
this._pValueText = _pValueText;
}

public Object getPid(){
	if (this._pid != null) {
		return this._pid;
	}
	ValueExpression ve = getValueExpression("pid");
	if (ve != null) {
	    Object value = null;
	    
	    try {
			value = (Object) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setPid(Object _pid){
this._pid = _pid;
}

public Object getProcess(){
	if (this._process != null) {
		return this._process;
	}
	ValueExpression ve = getValueExpression("process");
	if (ve != null) {
	    Object value = null;
	    
	    try {
			value = (Object) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setProcess(Object _process){
this._process = _process;
}

public Object getReRender(){
	if (this._reRender != null) {
		return this._reRender;
	}
	ValueExpression ve = getValueExpression("reRender");
	if (ve != null) {
	    Object value = null;
	    
	    try {
			value = (Object) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setReRender(Object _reRender){
this._reRender = _reRender;
}

public String getRel(){
	if (this._rel != null) {
		return this._rel;
	}
	ValueExpression ve = getValueExpression("rel");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setRel(String _rel){
this._rel = _rel;
}

public int getRequestDelay(){
	if (this._requestDelaySet) {
	    return (this._requestDelay);
	}
	ValueExpression ve = getValueExpression("requestDelay");
	if (ve != null) {
	    Integer value = null;
	    
	    try {
			value = (Integer) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._requestDelay);
	    }
	    
	    return value;
	} else {
	    return (this._requestDelay);
	}

}

public void setRequestDelay(int _requestDelay){
this._requestDelay = _requestDelay;
this._requestDelaySet = true;
}

public String getRev(){
	if (this._rev != null) {
		return this._rev;
	}
	ValueExpression ve = getValueExpression("rev");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setRev(String _rev){
this._rev = _rev;
}

public String getShape(){
	if (this._shape != null) {
		return this._shape;
	}
	ValueExpression ve = getValueExpression("shape");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setShape(String _shape){
this._shape = _shape;
}

public String getSimilarityGroupingId(){
	if (this._similarityGroupingId != null) {
		return this._similarityGroupingId;
	}
	ValueExpression ve = getValueExpression("similarityGroupingId");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setSimilarityGroupingId(String _similarityGroupingId){
this._similarityGroupingId = _similarityGroupingId;
}

public String getStatus(){
	if (this._status != null) {
		return this._status;
	}
	ValueExpression ve = getValueExpression("status");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setStatus(String _status){
this._status = _status;
}

public String getStyle(){
	if (this._style != null) {
		return this._style;
	}
	ValueExpression ve = getValueExpression("style");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setStyle(String _style){
this._style = _style;
}

public String getStyleClass(){
	if (this._styleClass != null) {
		return this._styleClass;
	}
	ValueExpression ve = getValueExpression("styleClass");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setStyleClass(String _styleClass){
this._styleClass = _styleClass;
}

public String getTabindex(){
	if (this._tabindex != null) {
		return this._tabindex;
	}
	ValueExpression ve = getValueExpression("tabindex");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setTabindex(String _tabindex){
this._tabindex = _tabindex;
}

public String getTarget(){
	if (this._target != null) {
		return this._target;
	}
	ValueExpression ve = getValueExpression("target");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setTarget(String _target){
this._target = _target;
}

public int getTimeout(){
	if (this._timeoutSet) {
	    return (this._timeout);
	}
	ValueExpression ve = getValueExpression("timeout");
	if (ve != null) {
	    Integer value = null;
	    
	    try {
			value = (Integer) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._timeout);
	    }
	    
	    return value;
	} else {
	    return (this._timeout);
	}

}

public void setTimeout(int _timeout){
this._timeout = _timeout;
this._timeoutSet = true;
}

public String getTitle(){
	if (this._title != null) {
		return this._title;
	}
	ValueExpression ve = getValueExpression("title");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setTitle(String _title){
this._title = _title;
}

public String getType(){
	if (this._type != null) {
		return this._type;
	}
	ValueExpression ve = getValueExpression("type");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setType(String _type){
this._type = _type;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[54];
state[0] = super.saveState(context);
state[1] = _accesskey;
state[2] = Boolean.valueOf(_ajaxSingle);
state[3] = Boolean.valueOf(_ajaxSingleSet);
state[4] = Boolean.valueOf(_bypassUpdates);
state[5] = Boolean.valueOf(_bypassUpdatesSet);
state[6] = _charset;
state[7] = _coords;
state[8] = saveAttachedState(context, _data);
state[9] = _dir;
state[10] = Boolean.valueOf(_disabled);
state[11] = Boolean.valueOf(_disabledSet);
state[12] = _eventsQueue;
state[13] = _focus;
state[14] = _hreflang;
state[15] = Boolean.valueOf(_ignoreDupResponses);
state[16] = Boolean.valueOf(_ignoreDupResponsesSet);
state[17] = _lang;
state[18] = Boolean.valueOf(_limitToList);
state[19] = Boolean.valueOf(_limitToListSet);
state[20] = _objectName;
state[21] = _onbeforedomupdate;
state[22] = _onblur;
state[23] = _onclick;
state[24] = _oncomplete;
state[25] = _ondblclick;
state[26] = _onfocus;
state[27] = _onkeydown;
state[28] = _onkeypress;
state[29] = _onkeyup;
state[30] = _onmousedown;
state[31] = _onmousemove;
state[32] = _onmouseout;
state[33] = _onmouseover;
state[34] = _onmouseup;
state[35] = _pValueText;
state[36] = saveAttachedState(context, _pid);
state[37] = saveAttachedState(context, _process);
state[38] = saveAttachedState(context, _reRender);
state[39] = _rel;
state[40] = Integer.valueOf(_requestDelay);
state[41] = Boolean.valueOf(_requestDelaySet);
state[42] = _rev;
state[43] = _shape;
state[44] = _similarityGroupingId;
state[45] = _status;
state[46] = _style;
state[47] = _styleClass;
state[48] = _tabindex;
state[49] = _target;
state[50] = Integer.valueOf(_timeout);
state[51] = Boolean.valueOf(_timeoutSet);
state[52] = _title;
state[53] = _type;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_accesskey = (String)states[1];;
		_ajaxSingle = ((Boolean)states[2]).booleanValue();
		_ajaxSingleSet = ((Boolean)states[3]).booleanValue();
		_bypassUpdates = ((Boolean)states[4]).booleanValue();
		_bypassUpdatesSet = ((Boolean)states[5]).booleanValue();
		_charset = (String)states[6];;
		_coords = (String)states[7];;
		_data = (Object)restoreAttachedState(context, states[8]);
		_dir = (String)states[9];;
		_disabled = ((Boolean)states[10]).booleanValue();
		_disabledSet = ((Boolean)states[11]).booleanValue();
		_eventsQueue = (String)states[12];;
		_focus = (String)states[13];;
		_hreflang = (String)states[14];;
		_ignoreDupResponses = ((Boolean)states[15]).booleanValue();
		_ignoreDupResponsesSet = ((Boolean)states[16]).booleanValue();
		_lang = (String)states[17];;
		_limitToList = ((Boolean)states[18]).booleanValue();
		_limitToListSet = ((Boolean)states[19]).booleanValue();
		_objectName = (String)states[20];;
		_onbeforedomupdate = (String)states[21];;
		_onblur = (String)states[22];;
		_onclick = (String)states[23];;
		_oncomplete = (String)states[24];;
		_ondblclick = (String)states[25];;
		_onfocus = (String)states[26];;
		_onkeydown = (String)states[27];;
		_onkeypress = (String)states[28];;
		_onkeyup = (String)states[29];;
		_onmousedown = (String)states[30];;
		_onmousemove = (String)states[31];;
		_onmouseout = (String)states[32];;
		_onmouseover = (String)states[33];;
		_onmouseup = (String)states[34];;
		_pValueText = (String)states[35];;
		_pid = (Object)restoreAttachedState(context, states[36]);
		_process = (Object)restoreAttachedState(context, states[37]);
		_reRender = (Object)restoreAttachedState(context, states[38]);
		_rel = (String)states[39];;
		_requestDelay = ((Integer)states[40]).intValue();
		_requestDelaySet = ((Boolean)states[41]).booleanValue();
		_rev = (String)states[42];;
		_shape = (String)states[43];;
		_similarityGroupingId = (String)states[44];;
		_status = (String)states[45];;
		_style = (String)states[46];;
		_styleClass = (String)states[47];;
		_tabindex = (String)states[48];;
		_target = (String)states[49];;
		_timeout = ((Integer)states[50]).intValue();
		_timeoutSet = ((Boolean)states[51]).booleanValue();
		_title = (String)states[52];;
		_type = (String)states[53];;
	
}

}
