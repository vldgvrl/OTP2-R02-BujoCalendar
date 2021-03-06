/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetropoliaAMKgroup02.BujoCalendar.utils;

import MetropoliaAMKgroup02.BujoCalendar.controller.AppController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author heikki
 */
public class StringToCalConverter {
        private String date;
        private String time;
        private Locale locale;
        private String hour;
        private String minute;

        public StringToCalConverter() {
                locale = AppController.getInstance().getLocale();
        }

        public void setDate(String date) {
                this.date = date;
        }

        public void setTime(String time) {
                this.time = time;
        }

        public void setHour(String hour) {
                this.hour = hour;
        }

        public void setMinute(String minute) {
                this.minute = minute;
        }

        public Calendar getCalendar() {

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm",
                        locale);

                Calendar date = AppController.getInstance().getDates().getCurrentDate();
                try {
                        date.setTime(sdf.parse(this.date + " " + this.getTime()));
                } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                }

                return date;
        }

        private String getTime() {
                if(this.time == null) {
                        this.time = this.hour + ":" + this.minute;
                }
                return this.time;
        }
}
