/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.omidbiz.taglib;

import javax.faces.component.UIComponent ;
import java.lang.Object ;
import java.lang.String ;
import org.ajax4jsf.webapp.taglib.HtmlComponentTagBase ;
import javax.faces.el.MethodBinding ;

import javax.el.ELException;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.el.ValueExpression;
import org.richfaces.webapp.taglib.MethodBindingMethodExpressionAdaptor;
import org.richfaces.webapp.taglib.ValueBindingValueExpressionAdaptor;
import org.omidbiz.component.html.HtmlWindowPopup;

public class WindowPopupTag extends org.ajax4jsf.webapp.taglib.HtmlComponentTagBase {

		// Fields
		 	  			  		  	  
		/*
		 * accesskey
		 * This attribute assigns an access key to an element. An access key is a single character from the document character set. Note: Authors should consider the input method of the expected reader when specifying an accesskey
		 */
		private ValueExpression _accesskey;
		/**
		 * This attribute assigns an access key to an element. An access key is a single character from the document character set. Note: Authors should consider the input method of the expected reader when specifying an accesskey
		 * Setter for accesskey
		 * @param accesskey - new value
		 */
		 public void setAccesskey( ValueExpression  __accesskey ){
			this._accesskey = __accesskey;
	     }
	  
	 	 		 	  	  	  
		/*
		 * action
		 * MethodBinding pointing at the application action to be invoked,
            if this UIComponent is activated by you, during the Apply
            Request Values or Invoke Application phase of the request
            processing lifecycle, depending on the value of the immediate
            property
		 */
		private MethodExpression _action;
		/**
		 * MethodBinding pointing at the application action to be invoked,
            if this UIComponent is activated by you, during the Apply
            Request Values or Invoke Application phase of the request
            processing lifecycle, depending on the value of the immediate
            property
		 * Setter for action
		 * @param action - new value
		 */
		 public void setAction( MethodExpression  __action ){
			this._action = __action;
	     }
	  
	 	 		 		 	  	  	  
		/*
		 * actionListener
		 * MethodBinding pointing at method accepting  an ActionEvent with return type void
		 */
		private MethodExpression _actionListener;
		/**
		 * MethodBinding pointing at method accepting  an ActionEvent with return type void
		 * Setter for actionListener
		 * @param actionListener - new value
		 */
		 public void setActionListener( MethodExpression  __actionListener ){
			this._actionListener = __actionListener;
	     }
	  
	 	 		 		 		 	  			  		  	  
		/*
		 * ajaxSingle
		 * boolean attribute which provides possibility to limit JSF tree processing(decoding, conversion/validation, value applying) 
to the component which send the request only
		 */
		private ValueExpression _ajaxSingle;
		/**
		 * boolean attribute which provides possibility to limit JSF tree processing(decoding, conversion/validation, value applying) 
to the component which send the request only
		 * Setter for ajaxSingle
		 * @param ajaxSingle - new value
		 */
		 public void setAjaxSingle( ValueExpression  __ajaxSingle ){
			this._ajaxSingle = __ajaxSingle;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * bypassUpdates
		 * If "true", after process validations phase it skips updates of model beans on a force render response. It can be used for validating components input
		 */
		private ValueExpression _bypassUpdates;
		/**
		 * If "true", after process validations phase it skips updates of model beans on a force render response. It can be used for validating components input
		 * Setter for bypassUpdates
		 * @param bypassUpdates - new value
		 */
		 public void setBypassUpdates( ValueExpression  __bypassUpdates ){
			this._bypassUpdates = __bypassUpdates;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * charset
		 * The character encoding of a resource designated by this hyperlink
		 */
		private ValueExpression _charset;
		/**
		 * The character encoding of a resource designated by this hyperlink
		 * Setter for charset
		 * @param charset - new value
		 */
		 public void setCharset( ValueExpression  __charset ){
			this._charset = __charset;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * closeText
		 * 
		 */
		private ValueExpression _closeText;
		/**
		 * 
		 * Setter for closeText
		 * @param closeText - new value
		 */
		 public void setCloseText( ValueExpression  __closeText ){
			this._closeText = __closeText;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * coords
		 * This attribute specifies the position and shape on the screen. The number and order of values depends on the shape being defined. Possible combinations:
            
            * rect: left-x, top-y, right-x, bottom-y.
            * circle: center-x, center-y, radius. Note. When the radius value is percentage value, user agents should calculate the final radius value based on the associated object's width and height. The radius should be the smaller value of the two.
            * poly: x1, y1, x2, y2, ..., xN, yN. The first x and y coordinate pair and the last should be the same to close the polygon. When these coordinate values are not the same, user agents should infer an additional coordinate pair to close the polygon.
            
            Coordinates are relative to the top, left corner of the object. All values are lengths. All values are separated by commas
		 */
		private ValueExpression _coords;
		/**
		 * This attribute specifies the position and shape on the screen. The number and order of values depends on the shape being defined. Possible combinations:
            
            * rect: left-x, top-y, right-x, bottom-y.
            * circle: center-x, center-y, radius. Note. When the radius value is percentage value, user agents should calculate the final radius value based on the associated object's width and height. The radius should be the smaller value of the two.
            * poly: x1, y1, x2, y2, ..., xN, yN. The first x and y coordinate pair and the last should be the same to close the polygon. When these coordinate values are not the same, user agents should infer an additional coordinate pair to close the polygon.
            
            Coordinates are relative to the top, left corner of the object. All values are lengths. All values are separated by commas
		 * Setter for coords
		 * @param coords - new value
		 */
		 public void setCoords( ValueExpression  __coords ){
			this._coords = __coords;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * data
		 * Serialized (on default with JSON) data passed on the client by a developer on AJAX request. It's accessible via "data.foo" syntax
		 */
		private ValueExpression _data;
		/**
		 * Serialized (on default with JSON) data passed on the client by a developer on AJAX request. It's accessible via "data.foo" syntax
		 * Setter for data
		 * @param data - new value
		 */
		 public void setData( ValueExpression  __data ){
			this._data = __data;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * disabled
		 * If true, disable this component on page.
		 */
		private ValueExpression _disabled;
		/**
		 * If true, disable this component on page.
		 * Setter for disabled
		 * @param disabled - new value
		 */
		 public void setDisabled( ValueExpression  __disabled ){
			this._disabled = __disabled;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * eventsQueue
		 * Name of requests queue to avoid send next request before complete other from same event. Can be used to reduce number of requests of frequently events (key press, mouse move etc.)
		 */
		private ValueExpression _eventsQueue;
		/**
		 * Name of requests queue to avoid send next request before complete other from same event. Can be used to reduce number of requests of frequently events (key press, mouse move etc.)
		 * Setter for eventsQueue
		 * @param eventsQueue - new value
		 */
		 public void setEventsQueue( ValueExpression  __eventsQueue ){
			this._eventsQueue = __eventsQueue;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * focus
		 * id of element to set focus after request completed on client side
		 */
		private ValueExpression _focus;
		/**
		 * id of element to set focus after request completed on client side
		 * Setter for focus
		 * @param focus - new value
		 */
		 public void setFocus( ValueExpression  __focus ){
			this._focus = __focus;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * height
		 * 
		 */
		private ValueExpression _height;
		/**
		 * 
		 * Setter for height
		 * @param height - new value
		 */
		 public void setHeight( ValueExpression  __height ){
			this._height = __height;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * hreflang
		 * Base language of a resource specified with the href attribute; hreflang may only be used with href
		 */
		private ValueExpression _hreflang;
		/**
		 * Base language of a resource specified with the href attribute; hreflang may only be used with href
		 * Setter for hreflang
		 * @param hreflang - new value
		 */
		 public void setHreflang( ValueExpression  __hreflang ){
			this._hreflang = __hreflang;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * iframe
		 * 
		 */
		private ValueExpression _iframe;
		/**
		 * 
		 * Setter for iframe
		 * @param iframe - new value
		 */
		 public void setIframe( ValueExpression  __iframe ){
			this._iframe = __iframe;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * ignoreDupResponses
		 * Attribute allows to ignore an Ajax Response produced by a request if the
				newest 'similar' request is
				in a queue already. ignoreDupResponses="true" does not cancel the
				request while it is processed on the server,
				but just allows to avoid unnecessary updates on the client side if the
				response isn't actual now
		 */
		private ValueExpression _ignoreDupResponses;
		/**
		 * Attribute allows to ignore an Ajax Response produced by a request if the
				newest 'similar' request is
				in a queue already. ignoreDupResponses="true" does not cancel the
				request while it is processed on the server,
				but just allows to avoid unnecessary updates on the client side if the
				response isn't actual now
		 * Setter for ignoreDupResponses
		 * @param ignoreDupResponses - new value
		 */
		 public void setIgnoreDupResponses( ValueExpression  __ignoreDupResponses ){
			this._ignoreDupResponses = __ignoreDupResponses;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * imageSrc
		 * 
		 */
		private ValueExpression _imageSrc;
		/**
		 * 
		 * Setter for imageSrc
		 * @param imageSrc - new value
		 */
		 public void setImageSrc( ValueExpression  __imageSrc ){
			this._imageSrc = __imageSrc;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * immediate
		 * True means, that the default ActionListener should be executed
            immediately (i.e. during Apply Request Values phase of the
            request processing lifecycle), rather than waiting until the
            Invoke Application phase
		 */
		private ValueExpression _immediate;
		/**
		 * True means, that the default ActionListener should be executed
            immediately (i.e. during Apply Request Values phase of the
            request processing lifecycle), rather than waiting until the
            Invoke Application phase
		 * Setter for immediate
		 * @param immediate - new value
		 */
		 public void setImmediate( ValueExpression  __immediate ){
			this._immediate = __immediate;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * limitToList
		 * If "true", then of all AJAX-rendered on the page components only those will be updated, 
		which ID's are passed to the "reRender" attribute of the describable component. 
		"false"-the default value-means that all components with ajaxRendered="true" will be updated.
		 */
		private ValueExpression _limitToList;
		/**
		 * If "true", then of all AJAX-rendered on the page components only those will be updated, 
		which ID's are passed to the "reRender" attribute of the describable component. 
		"false"-the default value-means that all components with ajaxRendered="true" will be updated.
		 * Setter for limitToList
		 * @param limitToList - new value
		 */
		 public void setLimitToList( ValueExpression  __limitToList ){
			this._limitToList = __limitToList;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onCleanup
		 * 
		 */
		private ValueExpression _onCleanup;
		/**
		 * 
		 * Setter for onCleanup
		 * @param onCleanup - new value
		 */
		 public void setOnCleanup( ValueExpression  __onCleanup ){
			this._onCleanup = __onCleanup;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onClosed
		 * 
		 */
		private ValueExpression _onClosed;
		/**
		 * 
		 * Setter for onClosed
		 * @param onClosed - new value
		 */
		 public void setOnClosed( ValueExpression  __onClosed ){
			this._onClosed = __onClosed;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onComplete
		 * 
		 */
		private ValueExpression _onComplete;
		/**
		 * 
		 * Setter for onComplete
		 * @param onComplete - new value
		 */
		 public void setOnComplete( ValueExpression  __onComplete ){
			this._onComplete = __onComplete;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onLoad
		 * 
		 */
		private ValueExpression _onLoad;
		/**
		 * 
		 * Setter for onLoad
		 * @param onLoad - new value
		 */
		 public void setOnLoad( ValueExpression  __onLoad ){
			this._onLoad = __onLoad;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onOpen
		 * 
		 */
		private ValueExpression _onOpen;
		/**
		 * 
		 * Setter for onOpen
		 * @param onOpen - new value
		 */
		 public void setOnOpen( ValueExpression  __onOpen ){
			this._onOpen = __onOpen;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onbeforedomupdate
		 * The client side script method to be called before DOM is updated
		 */
		private ValueExpression _onbeforedomupdate;
		/**
		 * The client side script method to be called before DOM is updated
		 * Setter for onbeforedomupdate
		 * @param onbeforedomupdate - new value
		 */
		 public void setOnbeforedomupdate( ValueExpression  __onbeforedomupdate ){
			this._onbeforedomupdate = __onbeforedomupdate;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onblur
		 * JavaScript code. The onblur event occurs when an element loses focus either by the pointing device or by tabbing navigation. It may be used with the same elements as onfocus
		 */
		private ValueExpression _onblur;
		/**
		 * JavaScript code. The onblur event occurs when an element loses focus either by the pointing device or by tabbing navigation. It may be used with the same elements as onfocus
		 * Setter for onblur
		 * @param onblur - new value
		 */
		 public void setOnblur( ValueExpression  __onblur ){
			this._onblur = __onblur;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * oncomplete
		 * The client side script method to be called after the request is completed
		 */
		private ValueExpression _oncomplete;
		/**
		 * The client side script method to be called after the request is completed
		 * Setter for oncomplete
		 * @param oncomplete - new value
		 */
		 public void setOncomplete( ValueExpression  __oncomplete ){
			this._oncomplete = __oncomplete;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * onfocus
		 * JavaScript code. The onfocus event occurs when an element gets focus
		 */
		private ValueExpression _onfocus;
		/**
		 * JavaScript code. The onfocus event occurs when an element gets focus
		 * Setter for onfocus
		 * @param onfocus - new value
		 */
		 public void setOnfocus( ValueExpression  __onfocus ){
			this._onfocus = __onfocus;
	     }
	  
	 	 		 		 		 		 		 		 		 		 		 	  			  		  	  
		/*
		 * openText
		 * 
		 */
		private ValueExpression _openText;
		/**
		 * 
		 * Setter for openText
		 * @param openText - new value
		 */
		 public void setOpenText( ValueExpression  __openText ){
			this._openText = __openText;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * process
		 * Id['s] (in format of call  UIComponent.findComponent()) of components, processed at the phases 2-5 in case of AjaxRequest  caused by this component. Can be single id, comma-separated list of Id's, or EL Expression  with array or Collection
		 */
		private ValueExpression _process;
		/**
		 * Id['s] (in format of call  UIComponent.findComponent()) of components, processed at the phases 2-5 in case of AjaxRequest  caused by this component. Can be single id, comma-separated list of Id's, or EL Expression  with array or Collection
		 * Setter for process
		 * @param process - new value
		 */
		 public void setProcess( ValueExpression  __process ){
			this._process = __process;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * reRender
		 * Id['s] (in format of call  UIComponent.findComponent()) of components, rendered in case of AjaxRequest  caused by this component. Can be single id, comma-separated list of Id's, or EL Expression  with array or Collection
		 */
		private ValueExpression _reRender;
		/**
		 * Id['s] (in format of call  UIComponent.findComponent()) of components, rendered in case of AjaxRequest  caused by this component. Can be single id, comma-separated list of Id's, or EL Expression  with array or Collection
		 * Setter for reRender
		 * @param reRender - new value
		 */
		 public void setReRender( ValueExpression  __reRender ){
			this._reRender = __reRender;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * rel
		 * The relationship from the current document to the anchor specified by this hyperlink. The value of this attribute is a space-separated list of link types
		 */
		private ValueExpression _rel;
		/**
		 * The relationship from the current document to the anchor specified by this hyperlink. The value of this attribute is a space-separated list of link types
		 * Setter for rel
		 * @param rel - new value
		 */
		 public void setRel( ValueExpression  __rel ){
			this._rel = __rel;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * requestDelay
		 * Attribute defines the time (in ms.) that the request will be wait in the queue before it is ready to send.
When the delay time is over, the request will be sent to the server or removed if the newest 'similar' request is in a queue already
		 */
		private ValueExpression _requestDelay;
		/**
		 * Attribute defines the time (in ms.) that the request will be wait in the queue before it is ready to send.
When the delay time is over, the request will be sent to the server or removed if the newest 'similar' request is in a queue already
		 * Setter for requestDelay
		 * @param requestDelay - new value
		 */
		 public void setRequestDelay( ValueExpression  __requestDelay ){
			this._requestDelay = __requestDelay;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * rev
		 * A reverse link from the anchor specified by this hyperlink to the current document. The value of this attribute is a space-separated list of link types
		 */
		private ValueExpression _rev;
		/**
		 * A reverse link from the anchor specified by this hyperlink to the current document. The value of this attribute is a space-separated list of link types
		 * Setter for rev
		 * @param rev - new value
		 */
		 public void setRev( ValueExpression  __rev ){
			this._rev = __rev;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * shape
		 * This attribute specifies the shape of a region. The possible values are "default", "rect", "circle" and "poly".
		 */
		private ValueExpression _shape;
		/**
		 * This attribute specifies the shape of a region. The possible values are "default", "rect", "circle" and "poly".
		 * Setter for shape
		 * @param shape - new value
		 */
		 public void setShape( ValueExpression  __shape ){
			this._shape = __shape;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * similarityGroupingId
		 * If there are any component requests with identical IDs then these requests will be grouped.
		 */
		private ValueExpression _similarityGroupingId;
		/**
		 * If there are any component requests with identical IDs then these requests will be grouped.
		 * Setter for similarityGroupingId
		 * @param similarityGroupingId - new value
		 */
		 public void setSimilarityGroupingId( ValueExpression  __similarityGroupingId ){
			this._similarityGroupingId = __similarityGroupingId;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * status
		 * ID (in format of call UIComponent.findComponent()) of Request status component
		 */
		private ValueExpression _status;
		/**
		 * ID (in format of call UIComponent.findComponent()) of Request status component
		 * Setter for status
		 * @param status - new value
		 */
		 public void setStatus( ValueExpression  __status ){
			this._status = __status;
	     }
	  
	 	 		 		 		 	  			  		  	  
		/*
		 * tabindex
		 * This attribute specifies the position of the current element in the tabbing order for the current document. This value must be a number between 0 and 32767. User agents should ignore leading zeros
		 */
		private ValueExpression _tabindex;
		/**
		 * This attribute specifies the position of the current element in the tabbing order for the current document. This value must be a number between 0 and 32767. User agents should ignore leading zeros
		 * Setter for tabindex
		 * @param tabindex - new value
		 */
		 public void setTabindex( ValueExpression  __tabindex ){
			this._tabindex = __tabindex;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * target
		 * This attribute specifies the name of a frame where a document is to be opened.
            
            By assigning a name to a frame via the name attribute, authors can refer to it as the "target" of links defined by other elements
		 */
		private ValueExpression _target;
		/**
		 * This attribute specifies the name of a frame where a document is to be opened.
            
            By assigning a name to a frame via the name attribute, authors can refer to it as the "target" of links defined by other elements
		 * Setter for target
		 * @param target - new value
		 */
		 public void setTarget( ValueExpression  __target ){
			this._target = __target;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * timeout
		 * Response waiting time on a particular request. If a response is not received during this time, the request is aborted
		 */
		private ValueExpression _timeout;
		/**
		 * Response waiting time on a particular request. If a response is not received during this time, the request is aborted
		 * Setter for timeout
		 * @param timeout - new value
		 */
		 public void setTimeout( ValueExpression  __timeout ){
			this._timeout = __timeout;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * type
		 * 
		 */
		private ValueExpression _type;
		/**
		 * 
		 * Setter for type
		 * @param type - new value
		 */
		 public void setType( ValueExpression  __type ){
			this._type = __type;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * useImage
		 * 
		 */
		private ValueExpression _useImage;
		/**
		 * 
		 * Setter for useImage
		 * @param useImage - new value
		 */
		 public void setUseImage( ValueExpression  __useImage ){
			this._useImage = __useImage;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * value
		 * The current value for this component
		 */
		private ValueExpression _value;
		/**
		 * The current value for this component
		 * Setter for value
		 * @param value - new value
		 */
		 public void setValue( ValueExpression  __value ){
			this._value = __value;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * view
		 * 
		 */
		private ValueExpression _view;
		/**
		 * 
		 * Setter for view
		 * @param view - new value
		 */
		 public void setView( ValueExpression  __view ){
			this._view = __view;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * width
		 * 
		 */
		private ValueExpression _width;
		/**
		 * 
		 * Setter for width
		 * @param width - new value
		 */
		 public void setWidth( ValueExpression  __width ){
			this._width = __width;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		    this._accesskey = null;
	 		 		    this._action = null;
	 		 		 		    this._actionListener = null;
	 		 		 		 		    this._ajaxSingle = null;
	 		 		 		    this._bypassUpdates = null;
	 		 		    this._charset = null;
	 		 		    this._closeText = null;
	 		 		    this._coords = null;
	 		 		    this._data = null;
	 		 		 		    this._disabled = null;
	 		 		    this._eventsQueue = null;
	 		 		 		    this._focus = null;
	 		 		    this._height = null;
	 		 		    this._hreflang = null;
	 		 		 		    this._iframe = null;
	 		 		    this._ignoreDupResponses = null;
	 		 		    this._imageSrc = null;
	 		 		    this._immediate = null;
	 		 		 		    this._limitToList = null;
	 		 		    this._onCleanup = null;
	 		 		    this._onClosed = null;
	 		 		    this._onComplete = null;
	 		 		    this._onLoad = null;
	 		 		    this._onOpen = null;
	 		 		    this._onbeforedomupdate = null;
	 		 		    this._onblur = null;
	 		 		 		    this._oncomplete = null;
	 		 		 		    this._onfocus = null;
	 		 		 		 		 		 		 		 		 		 		    this._openText = null;
	 		 		    this._process = null;
	 		 		    this._reRender = null;
	 		 		    this._rel = null;
	 		 		 		    this._requestDelay = null;
	 		 		    this._rev = null;
	 		 		    this._shape = null;
	 		 		    this._similarityGroupingId = null;
	 		 		    this._status = null;
	 		 		 		 		    this._tabindex = null;
	 		 		    this._target = null;
	 		 		    this._timeout = null;
	 		 		 		    this._type = null;
	 		 		    this._useImage = null;
	 		 		    this._value = null;
	 		 		    this._view = null;
	 		 		    this._width = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlWindowPopup comp = (HtmlWindowPopup) component;
 		 			 
						if (this._accesskey != null) {
				if (this._accesskey.isLiteralText()) {
					try {
												
						java.lang.String __accesskey = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._accesskey.getExpressionString(), 
											java.lang.String.class);
					
												comp.setAccesskey(__accesskey);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("accesskey", this._accesskey);
				}
			}
					   		 			setActionProperty(comp, this._action);
		    		 			setActionListenerProperty(comp, this._actionListener);
		     		 			 
						if (this._ajaxSingle != null) {
				if (this._ajaxSingle.isLiteralText()) {
					try {
												
						Boolean __ajaxSingle = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._ajaxSingle.getExpressionString(), 
											Boolean.class);
					
												comp.setAjaxSingle(__ajaxSingle.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("ajaxSingle", this._ajaxSingle);
				}
			}
					    		 			 
						if (this._bypassUpdates != null) {
				if (this._bypassUpdates.isLiteralText()) {
					try {
												
						Boolean __bypassUpdates = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._bypassUpdates.getExpressionString(), 
											Boolean.class);
					
												comp.setBypassUpdates(__bypassUpdates.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("bypassUpdates", this._bypassUpdates);
				}
			}
					   		 			 
						if (this._charset != null) {
				if (this._charset.isLiteralText()) {
					try {
												
						java.lang.String __charset = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._charset.getExpressionString(), 
											java.lang.String.class);
					
												comp.setCharset(__charset);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("charset", this._charset);
				}
			}
					   		 			 
						if (this._closeText != null) {
				if (this._closeText.isLiteralText()) {
					try {
												
						java.lang.String __closeText = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._closeText.getExpressionString(), 
											java.lang.String.class);
					
												comp.setCloseText(__closeText);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("closeText", this._closeText);
				}
			}
					   		 			 
						if (this._coords != null) {
				if (this._coords.isLiteralText()) {
					try {
												
						java.lang.String __coords = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._coords.getExpressionString(), 
											java.lang.String.class);
					
												comp.setCoords(__coords);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("coords", this._coords);
				}
			}
					   		 			 
						if (this._data != null) {
				if (this._data.isLiteralText()) {
					try {
												
						java.lang.Object __data = (java.lang.Object) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._data.getExpressionString(), 
											java.lang.Object.class);
					
												comp.setData(__data);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("data", this._data);
				}
			}
					    		 			 
						if (this._disabled != null) {
				if (this._disabled.isLiteralText()) {
					try {
												
						Boolean __disabled = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._disabled.getExpressionString(), 
											Boolean.class);
					
												comp.setDisabled(__disabled.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("disabled", this._disabled);
				}
			}
					   		 			 
						if (this._eventsQueue != null) {
				if (this._eventsQueue.isLiteralText()) {
					try {
												
						java.lang.String __eventsQueue = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._eventsQueue.getExpressionString(), 
											java.lang.String.class);
					
												comp.setEventsQueue(__eventsQueue);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("eventsQueue", this._eventsQueue);
				}
			}
					    		 			 
						if (this._focus != null) {
				if (this._focus.isLiteralText()) {
					try {
												
						java.lang.String __focus = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._focus.getExpressionString(), 
											java.lang.String.class);
					
												comp.setFocus(__focus);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("focus", this._focus);
				}
			}
					   		 			 
						if (this._height != null) {
				if (this._height.isLiteralText()) {
					try {
												
						java.lang.String __height = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._height.getExpressionString(), 
											java.lang.String.class);
					
												comp.setHeight(__height);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("height", this._height);
				}
			}
					   		 			 
						if (this._hreflang != null) {
				if (this._hreflang.isLiteralText()) {
					try {
												
						java.lang.String __hreflang = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._hreflang.getExpressionString(), 
											java.lang.String.class);
					
												comp.setHreflang(__hreflang);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("hreflang", this._hreflang);
				}
			}
					    		 			 
						if (this._iframe != null) {
				if (this._iframe.isLiteralText()) {
					try {
												
						Boolean __iframe = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._iframe.getExpressionString(), 
											Boolean.class);
					
												comp.setIframe(__iframe.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("iframe", this._iframe);
				}
			}
					   		 			 
						if (this._ignoreDupResponses != null) {
				if (this._ignoreDupResponses.isLiteralText()) {
					try {
												
						Boolean __ignoreDupResponses = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._ignoreDupResponses.getExpressionString(), 
											Boolean.class);
					
												comp.setIgnoreDupResponses(__ignoreDupResponses.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("ignoreDupResponses", this._ignoreDupResponses);
				}
			}
					   		 			 
						if (this._imageSrc != null) {
				if (this._imageSrc.isLiteralText()) {
					try {
												
						java.lang.String __imageSrc = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._imageSrc.getExpressionString(), 
											java.lang.String.class);
					
												comp.setImageSrc(__imageSrc);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("imageSrc", this._imageSrc);
				}
			}
					   		 			 
						if (this._immediate != null) {
				if (this._immediate.isLiteralText()) {
					try {
												
						Boolean __immediate = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._immediate.getExpressionString(), 
											Boolean.class);
					
												comp.setImmediate(__immediate.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("immediate", this._immediate);
				}
			}
					    		 			 
						if (this._limitToList != null) {
				if (this._limitToList.isLiteralText()) {
					try {
												
						Boolean __limitToList = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._limitToList.getExpressionString(), 
											Boolean.class);
					
												comp.setLimitToList(__limitToList.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("limitToList", this._limitToList);
				}
			}
					   		 			 
						if (this._onCleanup != null) {
				if (this._onCleanup.isLiteralText()) {
					try {
												
						java.lang.String __onCleanup = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onCleanup.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnCleanup(__onCleanup);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onCleanup", this._onCleanup);
				}
			}
					   		 			 
						if (this._onClosed != null) {
				if (this._onClosed.isLiteralText()) {
					try {
												
						java.lang.String __onClosed = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onClosed.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnClosed(__onClosed);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onClosed", this._onClosed);
				}
			}
					   		 			 
						if (this._onComplete != null) {
				if (this._onComplete.isLiteralText()) {
					try {
												
						java.lang.String __onComplete = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onComplete.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnComplete(__onComplete);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onComplete", this._onComplete);
				}
			}
					   		 			 
						if (this._onLoad != null) {
				if (this._onLoad.isLiteralText()) {
					try {
												
						java.lang.String __onLoad = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onLoad.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnLoad(__onLoad);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onLoad", this._onLoad);
				}
			}
					   		 			 
						if (this._onOpen != null) {
				if (this._onOpen.isLiteralText()) {
					try {
												
						java.lang.String __onOpen = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onOpen.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnOpen(__onOpen);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onOpen", this._onOpen);
				}
			}
					   		 			 
						if (this._onbeforedomupdate != null) {
				if (this._onbeforedomupdate.isLiteralText()) {
					try {
												
						java.lang.String __onbeforedomupdate = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onbeforedomupdate.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnbeforedomupdate(__onbeforedomupdate);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onbeforedomupdate", this._onbeforedomupdate);
				}
			}
					   		 			 
						if (this._onblur != null) {
				if (this._onblur.isLiteralText()) {
					try {
												
						java.lang.String __onblur = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onblur.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnblur(__onblur);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onblur", this._onblur);
				}
			}
					    		 			 
						if (this._oncomplete != null) {
				if (this._oncomplete.isLiteralText()) {
					try {
												
						java.lang.String __oncomplete = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._oncomplete.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOncomplete(__oncomplete);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("oncomplete", this._oncomplete);
				}
			}
					    		 			 
						if (this._onfocus != null) {
				if (this._onfocus.isLiteralText()) {
					try {
												
						java.lang.String __onfocus = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onfocus.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnfocus(__onfocus);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onfocus", this._onfocus);
				}
			}
					           		 			 
						if (this._openText != null) {
				if (this._openText.isLiteralText()) {
					try {
												
						java.lang.String __openText = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._openText.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOpenText(__openText);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("openText", this._openText);
				}
			}
					   		 			 
						if (this._process != null) {
				if (this._process.isLiteralText()) {
					try {
												
						java.lang.Object __process = (java.lang.Object) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._process.getExpressionString(), 
											java.lang.Object.class);
					
												comp.setProcess(__process);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("process", this._process);
				}
			}
					   		 			 
						if (this._reRender != null) {
				if (this._reRender.isLiteralText()) {
					try {
												
						java.lang.Object __reRender = (java.lang.Object) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._reRender.getExpressionString(), 
											java.lang.Object.class);
					
												comp.setReRender(__reRender);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("reRender", this._reRender);
				}
			}
					   		 			 
						if (this._rel != null) {
				if (this._rel.isLiteralText()) {
					try {
												
						java.lang.String __rel = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._rel.getExpressionString(), 
											java.lang.String.class);
					
												comp.setRel(__rel);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("rel", this._rel);
				}
			}
					    		 			 
						if (this._requestDelay != null) {
				if (this._requestDelay.isLiteralText()) {
					try {
												
						Integer __requestDelay = (Integer) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._requestDelay.getExpressionString(), 
											Integer.class);
					
												comp.setRequestDelay(__requestDelay.intValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("requestDelay", this._requestDelay);
				}
			}
					   		 			 
						if (this._rev != null) {
				if (this._rev.isLiteralText()) {
					try {
												
						java.lang.String __rev = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._rev.getExpressionString(), 
											java.lang.String.class);
					
												comp.setRev(__rev);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("rev", this._rev);
				}
			}
					   		 			 
						if (this._shape != null) {
				if (this._shape.isLiteralText()) {
					try {
												
						java.lang.String __shape = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._shape.getExpressionString(), 
											java.lang.String.class);
					
												comp.setShape(__shape);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("shape", this._shape);
				}
			}
					   		 			 
						if (this._similarityGroupingId != null) {
				if (this._similarityGroupingId.isLiteralText()) {
					try {
												
						java.lang.String __similarityGroupingId = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._similarityGroupingId.getExpressionString(), 
											java.lang.String.class);
					
												comp.setSimilarityGroupingId(__similarityGroupingId);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("similarityGroupingId", this._similarityGroupingId);
				}
			}
					   		 			 
						if (this._status != null) {
				if (this._status.isLiteralText()) {
					try {
												
						java.lang.String __status = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._status.getExpressionString(), 
											java.lang.String.class);
					
												comp.setStatus(__status);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("status", this._status);
				}
			}
					     		 			 
						if (this._tabindex != null) {
				if (this._tabindex.isLiteralText()) {
					try {
												
						java.lang.String __tabindex = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._tabindex.getExpressionString(), 
											java.lang.String.class);
					
												comp.setTabindex(__tabindex);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("tabindex", this._tabindex);
				}
			}
					   		 			 
						if (this._target != null) {
				if (this._target.isLiteralText()) {
					try {
												
						java.lang.String __target = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._target.getExpressionString(), 
											java.lang.String.class);
					
												comp.setTarget(__target);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("target", this._target);
				}
			}
					   		 			 
						if (this._timeout != null) {
				if (this._timeout.isLiteralText()) {
					try {
												
						Integer __timeout = (Integer) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._timeout.getExpressionString(), 
											Integer.class);
					
												comp.setTimeout(__timeout.intValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("timeout", this._timeout);
				}
			}
					    		 			 
						if (this._type != null) {
				if (this._type.isLiteralText()) {
					try {
												
						java.lang.String __type = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._type.getExpressionString(), 
											java.lang.String.class);
					
												comp.setType(__type);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("type", this._type);
				}
			}
					   		 			 
						if (this._useImage != null) {
				if (this._useImage.isLiteralText()) {
					try {
												
						Boolean __useImage = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._useImage.getExpressionString(), 
											Boolean.class);
					
												comp.setUseImage(__useImage.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("useImage", this._useImage);
				}
			}
					   		 			 
						if (this._value != null) {
				if (this._value.isLiteralText()) {
					try {
												
						java.lang.Object __value = (java.lang.Object) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._value.getExpressionString(), 
											java.lang.Object.class);
					
												comp.setValue(__value);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("value", this._value);
				}
			}
					   		 			 
						if (this._view != null) {
				if (this._view.isLiteralText()) {
					try {
												
						java.lang.String __view = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._view.getExpressionString(), 
											java.lang.String.class);
					
												comp.setView(__view);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("view", this._view);
				}
			}
					   		 			 
						if (this._width != null) {
				if (this._width.isLiteralText()) {
					try {
												
						java.lang.String __width = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._width.getExpressionString(), 
											java.lang.String.class);
					
												comp.setWidth(__width);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("width", this._width);
				}
			}
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.omidbiz.WindowPopup";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.omidbiz.WindowPopupRenderer";
			}

}
