# 🧠 Domain Model – Smart Appointment Scheduling System

---

## 📌 Key Domain Entities and Attributes

| Entity      | Attributes                                 | Methods                                  | Relationships                                |
|-------------|--------------------------------------------|------------------------------------------|----------------------------------------------|
| User        | userId, name, email, password, role        | login(), logout(), updateProfile()       | Has Appointments, Messages                   |
| Appointment | appointmentId, date, time, status, notes   | book(), cancel(), reschedule()           | Linked to User, Doctor                        |
| Doctor      | doctorId, name, specialty, availability    | updateAvailability(), approveAppointment()| Receives Appointments                         |
| Admin       | adminId, name, contact                     | viewReports(), manageUsers()             | Monitors system                               |
| Notification| notificationId, message, sentAt, type      | send(), schedule()                       | Sent to User                                  |
| Schedule    | scheduleId, doctorId, availableSlots       | updateSlots(), viewAvailability()        | Belongs to Doctor                             |
| Report      | reportId, generatedAt, content             | generate(), export()                     | Created by Admin                              |

---

## 🧾 Business Rules

- A **user** can only have **1 active appointment at a time**.
- A **doctor** can **approve or reject appointments**.
- A **user** can only **cancel/reschedule an appointment at least 24 hours in advance**.
- Notifications are sent **24 hours before** an appointment.
- Only **Admins** can **view system reports**.
