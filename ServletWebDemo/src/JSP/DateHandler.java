package JSP;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateHandler extends TagSupport {

	public int doStartTag()
	{
		return SKIP_BODY;
		
	}
	public int doEndTag()
	{
		try{
			
		
		JspWriter out = pageContext.getOut();
		out.write(new java.util.Date().toString());
		}catch(Exception e )
		{
			
		}
		return EVAL_PAGE;
	}
}
