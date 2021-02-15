import java.text.SimpleDateFormat

import org.apache.commons.lang.time.DateUtils

Date date = new Date();
def startDate = new SimpleDateFormat("yyyy-MM-dd").format(date)
endDate = DateUtils.addYears(date,10);
def enddate = new SimpleDateFormat("yyyy-MM-dd").format(endDate)

println "Print date :::::: "+date 
println "Start date is : "+startDate
println "Print end date :::::::: "+enddate

Date date1 = new Date()
SimpleDateFormat sdf = new SimpleDateFormat('YYYY-MM-dd')
def dateAndHour = sdf.format(date1)+7
endDate = dateAndHour
endDate = DateUtils.addYears(date1,10);
println dateAndHour
println "Print end date :::::::: "+endDate

Date date = new Date()
String datePart = date.format("dd/MM/yyyy")
String time = date.format("HH:mm")
println "\ttimePart : " + time

def dateFormat = "dd/MMM/yyyy"
def date = new Date()
startDate = date.format(dateFormat)
def endDate = date + 7
duration = endDate.format(dateFormat)

println('Today = ' + date)
println('Today = ' + startDate)
println('TodayPlus1Week = ' + duration)

def dateFormat = "HH:mm"
def date = new Date()
startDate = date.format(dateFormat)
def endDate = date + 15
duration = endDate.format(dateFormat)
println endDate

use(groovy.time.TimeCategory) {
	def twoAndHalfHourFromNow = new Date() + 40.minutes
	println twoAndHalfHourFromNow.format("HH:mm")
}










