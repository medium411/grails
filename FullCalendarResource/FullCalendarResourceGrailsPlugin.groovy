class FullCalendarResourceGrailsPlugin {
    // the plugin version
    def version = "1.5.4"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.0 > *"
	// the other plugins this plugin depends on
	/*
	 * FullCalendar has been tested with:
	 * - jQuery 1.5.2 / jQuery UI 1.8.11
	 * - jQuery 1.3.2 / jQuery UI 1.7.3
	 * - Firefox 3/4, Chrome, Safari 3/4, Opera 10, IE 6/7/8
	 * (http://arshaw.com/fullcalendar/support/)
	 * Plugin dependencies have been set to be as lenient as 
	 * possible, given the details above and available jquery & 
	 * jquery-ui plugins. 
	*/
	def dependsOn = [ 'jquery': '1.4.2.2 > *', 'jqueryUi': '1.8.2.1 > *' ]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "FullCalendar with resources" // Headline display name of the plugin
    def author = "Martin Dow + Ike Lin"
    def authorEmail = "martin.dow@gmail.com"
    def description = '''\
A wrapper for Adam Shaw's FullCalendar jquery calendar, a full page javascript calendar component using jQuery.
See http://arshaw.com/fullcalendar/ for more details.
jQuery FullCalendar by Adam Shaw is a wonderful calendar plugin.
However, one thing I needed was missing � a resource day view.
'''

    // URL to the plugin's documentation
    def documentation = "http://arshaw.com/fullcalendar/docs/"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
