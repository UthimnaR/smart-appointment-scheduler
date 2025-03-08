# Functional Requirements  

## 1. User Registration & Authentication  
- The system shall allow **patients and doctors** to register and log in securely.  
- **Acceptance Criteria:** Users must verify their accounts via **email** before the first login.  

## 2. Appointment Booking  
- The system shall allow **patients** to view available time slots and book appointments.  
- **Acceptance Criteria:** Booking should **update availability in real time**.  

## 3. Appointment Rescheduling & Cancellation  
- The system shall allow **patients** to reschedule or cancel appointments.  
- **Acceptance Criteria:** Cancellations must be **confirmed via email/SMS**.  

## 4. Doctor Dashboard  
- The system shall provide **doctors** with a dashboard to **view and manage appointments**.  
- **Acceptance Criteria:** Doctors should be able to **filter appointments by date and patient**.  

## 5. Admin Panel  
- The system shall provide an **admin panel** to oversee all appointments.  
- **Acceptance Criteria:** Admins should be able to **add, remove, or update schedules**.  

## 6. Notification System  
- The system shall send **reminders** for upcoming appointments via **email/SMS**.  
- **Acceptance Criteria:** Notifications must be sent **24 hours before an appointment**.  

## 7. Search & Filtering  
- The system shall allow users to **search for doctors** based on **specialty and availability**.  
- **Acceptance Criteria:** Search results should **load within 2 seconds**.  

## 8. User Profile Management  
- The system shall allow users to **update personal information and preferences**.  
- **Acceptance Criteria:** Profile updates should be **reflected immediately**.  

## 9. Access Control  
- The system shall **restrict access** based on **user roles** (patients, doctors, admins).  
- **Acceptance Criteria:** Patients **cannot access admin/doctor features**.  

## 10. Audit Logs  
- The system shall maintain **logs** of all **booking activities**.  
- **Acceptance Criteria:** Logs must be **accessible only by authorized personnel**.  

---

# Non-Functional Requirements  

| **Category**       | **Requirement** |
|--------------------|----------------------------------------------------------------|
| **Usability**     | The system UI shall be **user-friendly** and accessible, following **WCAG 2.1 standards**. |
| **Deployability**  | The system shall be **deployable** on both **Windows and Linux servers**. |
| **Maintainability** | Documentation shall include **API guides and system workflows**. |
| **Scalability**    | The system shall support up to **1000 concurrent users**. |
| **Security**      | User data shall be **encrypted** using **AES-256 encryption**. |
| **Performance**   | Appointment booking responses shall **not exceed 2 seconds**. |
| **Availability**  | The system shall maintain **99.9% uptime**. |
| **Compliance**    | The system shall comply with **healthcare data protection laws**. |
