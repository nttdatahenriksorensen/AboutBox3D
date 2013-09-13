package com.github.mjvesa.aboutbox.widgetset.client.ui;

import com.github.mjvesa.aboutbox.moviescroller.MovieScroller;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ui.LegacyConnector;
import com.vaadin.shared.ui.Connect;

@Connect(MovieScroller.class)
public class MovieScrollerConnector extends LegacyConnector {

	
	private static final long serialVersionUID = 2806690516431516035L;

	@Override
	public VMovieScroller getWidget() {
		return (VMovieScroller)super.getWidget();
	}
}