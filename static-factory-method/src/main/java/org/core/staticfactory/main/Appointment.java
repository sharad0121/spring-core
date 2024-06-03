package org.core.staticfactory.main;

import java.util.Calendar;
import java.util.Date;

public class Appointment {
    private int appointmentNo;
    private String subject;
    private Calendar createdDate;
    private String status;

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentNo=" + appointmentNo +
                ", subject='" + subject + '\'' +
                ", createdDate=" + createdDate +
                ", status='" + status + '\'' +
                '}';
    }
}
