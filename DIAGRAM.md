# Architecture Overview: Smart Appointment Scheduling System
## C4 Context Diagram

```mermaid
graph LR
 A[Patient] -->|Books Appointment| B[Appointment System]
    C[Healthcare Provider] -->|Manages Schedule| B[Appointment System]
    B[Appointment System] --> D[Database]
    B[Appointment System] --> E[Notification System]

