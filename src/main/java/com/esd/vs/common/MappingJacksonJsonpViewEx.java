package com.esd.vs.common;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MappingJacksonJsonpViewEx extends MappingJacksonJsonViewEx {

	/**
	 * Default content type. Overridable as bean property.
	 */
	public static final String DEFAULT_CONTENT_TYPE = "application/javascript";

	@Override
	public String getContentType() {
		return DEFAULT_CONTENT_TYPE;
	}

	/**
	 * Prepares the view given the specified model, merging it with static
	 * attributes and a RequestContext attribute, if necessary. Delegates to
	 * renderMergedOutputModel for the actual rendering.
	 * 
	 * @see #renderMergedOutputModel
	 */
	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		if ("GET".equals(request.getMethod().toUpperCase())) {
			Map<String, String[]> params = request.getParameterMap();

			if (params.containsKey("callback")) {
				response.getOutputStream().write((params.get("callback")[0] + "(").getBytes());
				super.render(model, request, response);
				response.getOutputStream().write(");".getBytes());
				response.setContentType(DEFAULT_CONTENT_TYPE);
			} else {
				super.render(model, request, response);
			}
		} else {
			super.render(model, request, response);
		}
	}
}
