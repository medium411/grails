package com.arshaw.fullcalendar

import java.util.concurrent.atomic.AtomicInteger

class CalendarTagLib {

	static namespace = "fullcal"

	private static final AtomicInteger calendarId = new AtomicInteger(0)

	def resources = { attributes ->
		out << '<link rel="stylesheet" href="' + g.resource(plugin:'full-calendar', dir:'css', file:'fullcalendar.css') + '" />\n'
		out << '<link rel="stylesheet" href="' + g.resource(plugin:'full-calendar', dir:'css', file:'fullcalendar.print.css') + '" media="print"/>\n'
		out << g.javascript(plugin:'jquery', library: 'jquery')
		out << jqui.resources()
		out << g.javascript(plugin:'full-calendar', src: attributes.debug ? 'fullcalendar.js' : 'fullcalendar.min.js')
		if (attributes.gcal) {
			out << g.javascript(plugin:'full-calendar', src: 'gcal.js')
		}
	}

	def calendar = { attributes, body ->
		def divId = (attributes?.id) ?: "fullCalendar${calendarId.incrementAndGet()}"
		out << '<div id="' + divId + '"></div>'
		out << '\n<script type="text/javascript">'
		out << '\n$(document).ready(function() {'
		out << '\n  $("#' + divId + '").fullCalendar({'
		out << body()
		out << '  \n});'
		out << '\n});'
		out << '\n</script>'

		// out << '\n'
	}
}
