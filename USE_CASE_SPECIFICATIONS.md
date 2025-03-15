# **Use Case Specifications**

## **1. Book Appointment**
**Actor:** Patient  
**Description:** Allows a patient to book an appointment with a doctor.  
**Preconditions:** Patient must be logged in.  
**Postconditions:** Appointment is created and stored in the system.  

**Basic Flow:**  
1. Patient selects "Book Appointment."
2. System displays available time slots.
3. Patient selects a time slot and confirms details.
4. System saves the appointment and sends confirmation.

**Alternative Flows:**  
- **(A1) No available slots:** System notifies patient and suggests alternative dates.
- **(A2) Network error:** System displays an error message and allows retry.

---
## **2. Cancel Appointment**
**Actor:** Patient  
**Description:** Allows a patient to cancel an existing appointment.  
**Preconditions:** Patient must have a scheduled appointment.  
**Postconditions:** Appointment is removed from the system.  

**Basic Flow:**  
1. Patient selects "Cancel Appointment."
2. System displays upcoming appointments.
3. Patient selects an appointment to cancel.
4. System asks for confirmation.
5. System cancels the appointment and sends notification.

**Alternative Flows:**  
- **(A1) Late cancellation:** System displays a warning if the cancellation is too close to the appointment time.

---
## **3. View Appointment History**
**Actor:** Patient  
**Description:** Allows a patient to view past and upcoming appointments.  
**Preconditions:** Patient must be logged in.  
**Postconditions:** System displays past and future appointments.  

**Basic Flow:**  
1. Patient selects "View Appointment History."
2. System fetches and displays appointment records.

---
## **4. Approve/Reject Appointment**
**Actor:** Doctor  
**Description:** Allows a doctor to accept or reject a patient's booking request.  
**Preconditions:** Doctor must be logged in.  
**Postconditions:** Appointment status is updated in the system.  

**Basic Flow:**  
1. Doctor views appointment requests.
2. Doctor selects "Approve" or "Reject."
3. System updates status and notifies patient.

**Alternative Flows:**  
- **(A1) Double booking:** System prevents approval if the slot is already taken.

---
## **5. Modify Appointment**
**Actor:** Receptionist  
**Description:** Allows a receptionist to reschedule or change appointment details.  
**Preconditions:** Appointment must exist.  
**Postconditions:** Updated appointment is saved.  

**Basic Flow:**  
1. Receptionist selects "Modify Appointment."
2. System displays appointment details.
3. Receptionist updates the appointment and confirms.
4. System saves the changes and notifies the patient.

**Alternative Flows:**  
- **(A1) Invalid modification:** System prevents changes that conflict with other appointments.

---
## **6. Manage Users**
**Actor:** Administrator  
**Description:** Allows an admin to add, edit, or remove user accounts.  
**Preconditions:** Admin must be logged in.  
**Postconditions:** User database is updated.  

**Basic Flow:**  
1. Admin selects "Manage Users."
2. Admin adds/edits/deletes user information.
3. System updates records accordingly.

---
## **7. Send Reminders**
**Actor:** Notification System (External)  
**Description:** Automatically sends reminders to patients about upcoming appointments.  
**Preconditions:** Appointment must be scheduled.  
**Postconditions:** Patient receives a reminder.  

**Basic Flow:**  
1. System checks upcoming appointments.
2. System sends reminder notifications.

---
## **8. Retrieve Patient Records**
**Actor:** Healthcare System (External)  
**Description:** Fetches medical records for doctors before an appointment.  
**Preconditions:** Patient must have prior medical records.  
**Postconditions:** Doctor can view medical history.  

**Basic Flow:**  
1. Doctor requests patient records.
2. System retrieves and displays relevant data.

---
