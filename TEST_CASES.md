# Test Cases for Smart Appointment Scheduling System  

### Functional Test Cases

| Test Case ID | Requirement ID | Description                         | Steps                                                       | Expected Result                                        | Actual Result                                      | Status     |
|--------------|----------------|-------------------------------------|-------------------------------------------------------------|--------------------------------------------------------|----------------------------------------------------|------------|
| **TC001**    | **FR-001**      | User logs into the system           | 1. Open login page 2. Enter valid credentials 3. Click "Login" | User is logged in and redirected to the dashboard      | User successfully logged in and redirected to the dashboard | Pass       |
| **TC002**    | **FR-002**      | Patient schedules an appointment     | 1. Login as Patient 2. Select doctor and time 3. Click "Confirm" | Appointment is scheduled, and confirmation is sent     | Appointment scheduled successfully, confirmation sent | Pass       |
| **TC003**    | **FR-003**      | Doctor views upcoming appointments  | 1. Login as Doctor 2. Click "Appointments" tab               | List of scheduled appointments is displayed            | List of upcoming appointments displayed correctly   | Pass       |
| **TC004**    | **FR-004**      | Patient cancels an appointment      | 1. Login as Patient 2. Click "Cancel" on an existing appointment | Appointment is removed, and slot is freed              | Appointment removed, slot freed successfully        | Pass       |
| **TC005**    | **FR-005**      | System sends appointment reminders  | 1. Wait for reminder time to arrive                          | Notification is sent to patient                        | Reminder notification sent to patient               | Pass       |
| **TC008**    | **FR-006**      | Patient views upcoming appointments | 1. Login as Patient 2. Click "My Appointments" tab           | List of upcoming appointments is displayed             | Upcoming appointments displayed as expected         | Pass       |
| **TC009**    | **FR-007**      | Patient edits personal information  | 1. Login as Patient 2. Go to "Profile" section 3. Edit contact information | Patient's contact information is updated successfully  | Contact information updated successfully            | Pass       |
| **TC010**    | **FR-008**      | Doctor cancels an appointment       | 1. Login as Doctor 2. Go to "Appointments" tab 3. Click "Cancel" on an existing appointment | Appointment is canceled and slot is freed              | Appointment canceled successfully, slot freed       | Pass       |
| **TC011**    | **FR-009**      | Admin manages doctor availability   | 1. Login as Admin 2. Go to "Manage Doctors" section 3. Set doctor’s availability for the week | Doctor's availability is updated                      | Doctor’s availability updated successfully          | Pass       |
| **TC012**    | **FR-010**      | Admin views all appointments        | 1. Login as Admin 2. Go to "All Appointments" tab           | List of all appointments across all doctors is displayed | All appointments listed successfully                | Pass       |

### Non-Functional Test Cases

| Test Case ID | Requirement ID | Description                         | Steps                                                       | Expected Result                                        | Actual Result                                      | Status     |
|--------------|----------------|-------------------------------------|-------------------------------------------------------------|--------------------------------------------------------|----------------------------------------------------|------------|
| **TC006**    | **NFR-001**     | System performance under high load  | Simulate 1,000 users scheduling appointments at once         | Response time ≤ 2 sec                                   | Response time was 1.5 seconds                      | Pass       |
| **TC007**    | **NFR-002**     | System security - unauthorized access | Try logging in with incorrect credentials multiple times    | System locks user after 3 failed attempts               | System locked user after 3 failed attempts         | Pass       |
| **TC013**    | **NFR-003**     | System scalability                  | Simulate 2,000 users accessing the system concurrently      | System should maintain stability with a response time ≤ 5 seconds | Response time was 4.8 seconds, system stable     | Pass       |
| **TC014**    | **NFR-004**     | System data integrity               | Simulate concurrent updates to the same appointment slot by multiple users | The system should handle the race condition and update data without conflicts | Data updated successfully, no conflicts detected | Pass       |
| **TC015**    | **NFR-005**     | System security - Data encryption   | Try accessing sensitive data without proper authorization  | Data should be encrypted, and unauthorized access should be blocked | Unauthorized access blocked, data encrypted      | Pass       |
