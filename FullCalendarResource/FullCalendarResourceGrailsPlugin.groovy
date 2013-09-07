class FullCalendarResourceGrailsPlugin {
    def version = "1.5.4"
    def grailsVersion = "2.0 > *"

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

    def title = "FullCalendar with resources"
    def description = '''\
A wrapper for Adam Shaw's FullCalendar jquery calendar, a full page javascript calendar component using jQuery.
See http://arshaw.com/fullcalendar/ for more details.
jQuery FullCalendar by Adam Shaw is a wonderful calendar plugin.
However, one thing I needed was missing - a resource day view.
'''

    def documentation = "http://arshaw.com/fullcalendar/docs/"

    def license = 'APACHE'
    def developers = [
        [name: 'Martin Dow', email: 'martin.dow@gmail.com'],
        [name: 'Ike Lin']
    ]
    def issueManagement = [system: 'GITHUB', url: 'https://github.com/medium411/grails']
    def scm = [url: 'https://github.com/medium411/grails']
}
