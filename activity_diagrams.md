# 🧭 Activity Diagrams - Smart Appointment Scheduling System

---

## 1. User Registration

```mermaid
graph TD
    A[Start] --> B[Enter details]
    B --> C[Validate input]
    C --> D{Details valid?}
    D -- Yes --> E[Create account]
    D -- No --> F[Show error]
    E --> G[Send confirmation email]
    G --> H[End]
    F --> A
```

**Explanation:**  
Handles user onboarding. Supports *FR-002*. Ensures clean data and user confirmation.

---

## 2. Book Appointment

```mermaid
graph TD
    A[Start] --> B[Login]
    B --> C[Search available slots]
    C --> D[Select slot]
    D --> E[Confirm appointment]
    E --> F[Notify doctor & user]
    F --> G[End]
```

**Explanation:**  
Main workflow for booking. Links with *FR-001*, and *Use Case: Book Appointment*.

---

## 3. Cancel Appointment

```mermaid
graph TD
    A[Start] --> B[User views bookings]
    B --> C[Select appointment]
    C --> D[Click cancel]
    D --> E[Check if within allowed time]
    E -- Yes --> F[Cancel appointment]
    E -- No --> G[Show error message]
    F --> H[Notify doctor]
    H --> I[End]
    G --> I
```

**Explanation:**  
Includes rules around cancellation time (e.g., 24 hours). Addresses *FR-005*.

---

## 4. Approve Appointment (Doctor)

```mermaid
graph TD
    A[Start] --> B[Doctor logs in]
    B --> C[View pending requests]
    C --> D[Select request]
    D --> E[Click Approve or Reject]
    E --> F[Notify user]
    F --> G[End]
```

**Explanation:**  
Supports admin/doctor workflows. Aligned with *FR-004*.

---

## 5. Send Notification

```mermaid
graph TD
    A[Trigger Event] --> B[System checks notification settings]
    B --> C[Create message content]
    C --> D[Send to user]
    D --> E[Update notification status]
    E --> F[End]
```

**Explanation:**  
Automated process for reminders, updates. Maps to *FR-006*.

---

## 6. System Login (User/Doctor/Admin)

```mermaid
graph TD
    A[Start] --> B[Enter credentials]
    B --> C[System authenticates]
    C --> D{Valid credentials?}
    D -- Yes --> E[Redirect to dashboard]
    D -- No --> F[Show error]
    E --> G[End]
    F --> A
```

**Explanation:**  
Common login flow. Relevant to multiple actors. Linked to *security NFR*.

---

## 7. Generate Report (Admin)

```mermaid
graph TD
    A[Start] --> B[Admin logs in]
    B --> C[Select report type]
    C --> D[Fetch data]
    D --> E[Generate report]
    E --> F[Display/Export]
    F --> G[End]
```

**Explanation:**  
Supports system monitoring. Linked to *Admin role use cases*.

---

## 8. Update Availability (Doctor)

```mermaid
graph TD
    A[Start] --> B[Doctor logs in]
    B --> C[View schedule]
    C --> D[Modify available slots]
    D --> E[Save changes]
    E --> F[Notify system]
    F --> G[End]
```

**Explanation:**  
Ensures real-time slot management. Linked to *Doctor availability (FR-003)*.

---
