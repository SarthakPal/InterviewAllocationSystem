Interviewer Allocation System

Description:
Your task is to build a simple Interviewer Allocation System for HRs (Human Resources) to efficiently allocate interviewers to interviewees for job interviews. The system should help HRs manage the interview process smoothly by ensuring fair distribution of interviewers and optimizing their availability.

Features:
1. Register Interviewers: HRs can register interviewers with their names, All types of interviews he prefers to take(Consider 2 types as of now Machine Coding and PSDS), years of experience and availability over slots.
2. Register Interviewees: HRs can register interviewees with their names, and preferred interview time slots. (Consider slots as number from 1 to 8)
3. Every Interviewee has to go through 2 rounds Machine Coding and PSDS (order doesn't matter)
4. Allocate Interviewers: The system should automatically allocate interviewers to interviewees based on interview type and availability. Ensure that same interviewer is not assigned both Machine Coding and PSDS for a certain interviewee. This would be the Default Allocation strategy.
7. View Interview Schedule: HRs should be able to view the interview schedule, showing which interviewers are assigned to which interviewees and the respective time slots.

Requirements:
1 - RegisterInterviewer()
2 - RegisterInterviewee()
3 - HR should be able to Allocate()
4 - View Interview Schedule.()

4. Write a driver class to demonstrate the above functionalities of the Interviewer Allocation System,

Bonus:
1 - While allocating, prefer to distribute in a fair share manner so that all the interviewers are allocated fairly well instead of few being heavily loaded. Example do the next assignment to the interviewer with the least assignment till then. This would be an extension of the existing allocation strategy.
Sample Test Case:
registerInterviewer(‘In1’, [‘MC’, ‘PSDS’], 7, [1, 2, 3, 4])
registerInterviewer(‘In2’, [MC’, ‘PSDS’’], 7, [1, 2, 3, 4])
registerInterviewee(‘C1’, [1, 2, 3, 7, 8])
registerInterviewee(‘C2’, [1, 2, 3, 7, 8])
After Allocation (Default) - 1 set of possible values
Show Allocations
C1 , MC, In1, 1
C1, PSDS, In2, 2
C2, MC, In1, 2
C2, PSDS, In2, 1

registerInterviewer(‘In1’, [‘MC’, ‘PSDS’], 7, [1, 2, 3, 4])
registerInterviewer(‘In2’, [MC’, ‘PSDS’’], 7, [2, 3, 4]) (<-changed from 1st test case)
registerInterviewee(‘C1’, [1, 2, 3, 7, 8])
registerInterviewee(‘C2’, [1, 2, 3, 7, 8])
After Allocation (Default) - 1 set of possible value
Show Allocations
C1, MC, In1, 1
C1, PSDS, In2, 2
C2, MC, In1, 3,
C2, PSDS Not possible

Note - This is one possible set of values, there can be other values depending on how you
Start assigning.
Things to take care:
1. Do not use any database or NoSQL store, use in-memory data structures for now.
2. Do not create any UI for the application.
3. Write a driver class for demo purposes that executes all the commands in one place in the code and includes test cases.
   4 - Put necessary validations/exceptions in place.
5. Please prioritize code compilation, execution, and completion.
6. Code should be modular, with Object-Oriented design. Maintain good separation of concerns.
7. Code should be extensible. It should be easy to add/remove functionality without rewriting the entire codebase.
8. Code should handle edge cases properly and fail gracefully.
9. Code should be readable. Follow good coding practices: use intuitive variable names, function names, class names, etc. and indent code properly.
10. Concurrent handling is not needed, also not expected to solve using algorithms and can simply go for brute force approach.
11. Expected time to solve it is 90 minutes.

This exercise assesses the candidates' ability to design and implement an allocation system, considering preferences and availability. It aims to test their proficiency in object-oriented programming.

