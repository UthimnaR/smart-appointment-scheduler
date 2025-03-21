# Agile Planning Document

## Introduction
This document outlines the Agile planning process for the Smart Appointment Booking Scheduler project. It includes user stories, sprint goals, and a product backlog, all organized according to Agile principles.The milestones and user stories were managed and tracked using GitHub Issues and Milestones to ensure smooth progress and efficient project management.

## Mapping User Stories to Requirements (Assignment 4)

| **User Story ID** | **User Story Title**                          | **Mapped Requirement from Assignment 4**                               |
|-------------------|-----------------------------------------------|------------------------------------------------------------------------|
| US-001            | Book an Appointment Online                    | Requirement 1: Appointment scheduling system with doctor availability  |
| US-002            | Receive Appointment Reminders                 | Requirement 2: Notification system for reminders                       |
| US-003            | View Appointment Schedule                     | Requirement 3: Doctor's appointment calendar                           |
| US-004            | Modify Appointments as a Receptionist         | Requirement 4: Admin panel for manual appointment management           |
| US-005            | Cancel or Reschedule an Appointment           | Requirement 5: Functionality for patient cancellations and rescheduling |
| US-006            | Generate Appointment Reports                  | Requirement 6: Report generation system for appointments trends        |
| US-007            | Prevent Double Booking                        | Requirement 7: Conflict management for booking appointments           |
| US-008            | Encrypt User Data                            | Requirement 8: Data security and encryption for user information      |

## User Stories

| **User Story ID** | **User Story**                     | **Priority**     | **Effort Estimate** | **Dependencies** |
|-------------------|------------------------------------|------------------|---------------------|------------------|
| US-001            | Book an Appointment Online         | Must-have        | 5                   | None             |
| US-002            | Receive Appointment Reminders      | Must-have        | 3                   | US-001           |
| US-003            | View Appointment Schedule          | Must-have        | 4                   | None             |
| US-004            | Modify Appointments as a Receptionist | Should-have      | 3                   | US-001           |
| US-005            | Cancel or Reschedule an Appointment | Must-have        | 4                   | US-001, US-003   |

## Sprint Planning

| **Task ID** | **Task Description**             | **Assigned To** | **Estimated Hours** | **Status**     |
|-------------|----------------------------------|-----------------|---------------------|----------------|
| T-001       | Develop search API endpoint      | Dev Team        | 8                   | To Do          |
| T-002       | Design UI for booking page       | Frontend Team   | 6                   | To Do          |
| T-003       | Set up appointment scheduling logic | Backend Team  | 10                  | In Progress    |

## Conclusion
This document provides an overview of the planning process and the Agile methodology used for the Smart Appointment Booking Scheduler project. All tasks, user stories, and priorities are organized to ensure successful implementation of the MVP.
