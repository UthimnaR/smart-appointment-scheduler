# Product Backlog

| Story ID | User Story | Priority (MoSCoW) | Effort Estimate | Dependencies | Milestone |
|----------|------------|------------------|-----------------|--------------|-----------|
| US-001   | As a patient, I want to book an appointment online | Must-have | 3 | None | Must-have |
| US-002   | As a patient, I want to receive appointment reminders | Must-have | 2 | None | Must-have |
| US-003   | As a doctor, I want to view my appointment schedule | Must-have | 4 | US-001 | Must-have |
| US-004   | As a receptionist, I want to modify appointments | Should-have | 3 | US-003 | Should-have |
| US-005   | As a patient, I want to cancel or reschedule my appointment | Must-have | 3 | US-001 | Must-have |
| US-006   | As an admin, I want to generate appointment reports | Should-have | 4 | US-002 | Should-have |
| US-007   | As an admin, I want the system to prevent double booking | Must-have | 4 | US-001 | Must-have |
| US-008   | As an admin, I want user data encrypted for security | Must-have | 5 | None | Must-have |
| US-009   | As a patient, I want to view available appointment slots | Could-have | 2 | US-001 | Could-have |
| US-010   | As a doctor, I want to view patient medical history during appointments | Could-have | 4 | US-003 | Could-have |
| US-011   | As a patient, I want the ability to rate my doctor | Won’t-have | 3 | US-005 | Won’t-have |
| US-012   | As an admin, I want to implement a feedback system for appointments | Won’t-have | 4 | US-006 | Won’t-have |
