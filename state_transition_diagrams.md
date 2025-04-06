# 📘 State Transition Diagrams

Below are the state transition diagrams for critical objects in the Smart Appointment Scheduling System.

---

## 1. Appointment

```mermaid
stateDiagram-v2
    [*] --> Requested
    Requested --> Confirmed: Doctor approves
    Requested --> Canceled: User cancels
    Confirmed --> Completed: Appointment ends
    Confirmed --> Missed: User fails to show
    Canceled --> [*]
    Completed --> [*]
    Missed --> [*]
```

**Explanation:**  
- **States:** Requested, Confirmed, Completed, Missed, Canceled  
- **Transitions:** Triggered by user or doctor actions.  
- **FR Mapping:** This addresses *FR-001: Users can request appointments* and *FR-005: Appointments can be cancelled.*

---

## 2. UserAccount

```mermaid
stateDiagram-v2
    [*] --> Registered
    Registered --> Active: Email verified
    Registered --> Suspended: Admin action
    Active --> Suspended: Policy violation
    Suspended --> Active: Admin reactivates
    Active --> Deleted: User deletes account
```

**Explanation:**  
- Shows lifecycle from registration to deletion.  
- **FR Mapping:** Aligns with *FR-002: User account lifecycle management.*

---

## 3. Doctor

```mermaid
stateDiagram-v2
    [*] --> Available
    Available --> Busy: Appointment assigned
    Busy --> Available: Appointment ends
    Available --> Inactive: Doctor sets status
    Inactive --> Available: Doctor reactivates
```

**Explanation:**  
- Reflects doctor’s availability for appointments.  
- **FR Mapping:** Supports *FR-003: Doctors manage availability.*

---

## 4. Notification

```mermaid
stateDiagram-v2
    [*] --> Generated
    Generated --> Sent: System sends
    Sent --> Read: User opens
    Sent --> Expired: Time elapsed
    Read --> [*]
    Expired --> [*]
```

**Explanation:**  
- Notifications lifecycle for events like confirmations.  
- **FR Mapping:** Matches *FR-006: Notifications for booking status.*

---

## 5. BookingRequest

```mermaid
stateDiagram-v2
    [*] --> Initiated
    Initiated --> PendingApproval: Submitted
    PendingApproval --> Approved: Admin/Doctor approves
    PendingApproval --> Rejected: Admin/Doctor rejects
    Approved --> Confirmed: Auto-transition
    Rejected --> [*]
    Confirmed --> [*]
```

**Explanation:**  
- Tracks booking approval lifecycle.  
- **FR Mapping:** Covers *FR-004: Admin/Doctor approval workflows.*

---

## 6. AdminApproval

```mermaid
stateDiagram-v2
    [*] --> Created
    Created --> Approved: Admin approves
    Created --> Declined: Admin rejects
    Approved --> [*]
    Declined --> [*]
```

**Explanation:**  
- Simple flow for admin approvals on slot or user requests.  
- **FR Mapping:** Supports *FR-004 and Sprint 2 US-05.*

---

## 7. ScheduleSlot

```mermaid
stateDiagram-v2
    [*] --> Open
    Open --> Booked: User selects
    Booked --> Completed: Appointment done
    Booked --> Canceled: User or doctor cancels
    Completed --> [*]
    Canceled --> Open: Reschedule allowed
```

**Explanation:**  
- Represents a slot's availability lifecycle.  
- **FR Mapping:** Maps to *FR-003 and Agile Sprint 1 tasks.*

---
