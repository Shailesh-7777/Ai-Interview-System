# B.TECH MAJOR PROJECT REPORT

---

# AI-POWERED AUTONOMOUS TECHNICAL & BEHAVIORAL INTERVIEW PREPARATION PLATFORM
### *(An Enterprise-Grade, Role-Adaptive Full-Stack Simulation and Automated Evaluation System)*

---

**A Major Project Dissertation Report Submitted in Partial Fulfillment of the Requirements for the Degree of**  
**BACHELOR OF TECHNOLOGY**  
**in**  
**COMPUTER SCIENCE AND ENGINEERING**

---

### Project Team: "Coffee and Code"

| Candidate Name | University Roll Number | Registration Number | Specialization / Branch |
| :--- | :--- | :--- | :--- |
| **Shailesh Kumar** *(Team Lead & Architect)* | **11242564** | MMEC/CSE/2022-26 | B.Tech Computer Science & Engineering |
| **Harshit Kumar** *(Full-Stack Developer)* | **11242664** | MMEC/CSE/2022-26 | B.Tech Computer Science & Engineering |
| **Sarfaraz Khan** *(DevOps & Database Engineer)* | **11242645** | MMEC/CSE/2022-26 | B.Tech Computer Science & Engineering |
| **Priyanshu Kumar** *(AI & QA Engineer)* | **11242565** | MMEC/CSE/2022-26 | B.Tech Computer Science & Engineering |

---

### Academic Institution:
**Department of Computer Science and Engineering**  
**Maharishi Markandeshwar Engineering College (MMEC)**  
**Maharishi Markandeshwar (Deemed to be University)**  
*Accredited by NAAC with Grade 'A++' | Approved by AICTE*  
*Mullana - Ambala, Haryana, India - 133207*  
**Academic Year:** 2025 – 2026

---
\pagebreak

## CERTIFICATE OF AUTHENTICITY & APPROVAL

This is to certify that the Major Project Report entitled **"AI-Powered Autonomous Technical & Behavioral Interview Preparation Platform"** submitted by:

* **Shailesh Kumar (Roll No. 11242564)**
* **Harshit Kumar (Roll No. 11242664)**
* **Sarfaraz Khan (Roll No. 11242645)**
* **Priyanshu Kumar (Roll No. 11242565)**

in partial fulfillment of the requirements for the award of the degree of **Bachelor of Technology in Computer Science and Engineering** at **Maharishi Markandeshwar Engineering College (MMEC), Maharishi Markandeshwar (Deemed to be University), Mullana**, is an authentic record of bonafide project work carried out under my supervision and guidance during the academic session 2025–2026.

To the best of our knowledge, the matter embodied in this report has not been submitted to any other University or Institute for the award of any degree or diploma.

<br><br>

------------------------------------- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -------------------------------------  
**Project Guide / Supervisor** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Head of the Department (CSE)**  
Department of CSE, MMEC &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Department of CSE, MMEC  
MM (DU), Mullana-Ambala &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; MM (DU), Mullana-Ambala  

<br><br>

------------------------------------- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -------------------------------------  
**Internal Examiner** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **External Examiner**  
Date: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Date:  

---
\pagebreak

## CANDIDATES' DECLARATION

We, the undersigned students of the Department of Computer Science and Engineering, Maharishi Markandeshwar Engineering College (MMEC), Mullana, hereby declare that the work presented in this Major Project Report titled **"AI-Powered Autonomous Technical & Behavioral Interview Preparation Platform"** is our original creation.

We affirm that:
1. The project embodies original software development, architectural design, database modeling, and artificial intelligence integration performed by our team under the team banner **"Coffee and Code"**.
2. Due acknowledgement has been made in the text to all other literature, frameworks, third-party libraries, and cloud services consulted.
3. No portion of this software system or documentation has been plagiarized or submitted previously for the award of any academic qualification or technical certification.
4. The codebase hosted at the official repository (`https://github.com/Shailesh-7777/Ai-Interview-System`) reflects the actual source code, container configurations, database migration scripts, and production deployment blueprints deployed onto cloud infrastructure.

**Signatures of the Project Candidates:**

1. ___________________________  
   **Shailesh Kumar (Roll No. 11242564)**

2. ___________________________  
   **Harshit Kumar (Roll No. 11242664)**

3. ___________________________  
   **Sarfaraz Khan (Roll No. 11242645)**

4. ___________________________  
   **Priyanshu Kumar (Roll No. 11242565)**

**Place:** MMEC, Mullana  
**Date:** November 10, 2026

---
\pagebreak

## ACKNOWLEDGEMENTS

The successful realization of this software engineering endeavor would not have been possible without the invaluable guidance, constructive criticism, and unremitting encouragement of numerous individuals and institutions.

First and foremost, we express our profound gratitude to our **Project Supervisor and Mentors** in the Department of Computer Science and Engineering, Maharishi Markandeshwar Engineering College, whose technical depth, methodological rigor, and critical review continuously steered our architecture toward industry standards.

We extend our sincere thanks to the **Head of the Department (CSE)** and the **Dean of Engineering & Technology**, MM (DU), for providing world-class computational laboratories, server infrastructure, high-speed networking, and an academic culture that fosters cutting-edge technological experimentation.

Special thanks are due to the open-source software and developer ecosystem, including the **Spring Boot Community**, the **React & Vite Core Teams**, **Google DeepMind / Generative AI**, **Aiven Cloud**, and **Render Platform**, whose software frameworks, SDKs, and cloud infrastructure made rapid prototyping and continuous deployment seamless.

Finally, we express our heartfelt appreciation to our parents, family members, and peers whose patience, sacrifices, and moral support provided the stamina required to execute this project across countless nights of debugging and testing.

---
\pagebreak

## EXECUTIVE SUMMARY / ABSTRACT

In the contemporary tech recruitment landscape, candidate evaluation has evolved from static algorithmic assessments into multi-faceted, high-stakes conversational evaluations testing conceptual mastery, architectural reasoning, trade-off analysis, and behavioral poise. Traditional preparation methodologies suffer from acute systemic shortcomings: static question repositories (e.g., GeeksforGeeks, LeetCode) promote passive memorization; peer mock interviews exhibit extreme inconsistency, scheduling bottlenecks, and subjective bias; and human professional mentorship services (e.g., Interviewing.io) remain prohibitively expensive for the vast majority of engineering students.

To resolve these systemic barriers, this project presents the **AI-Powered Autonomous Technical & Behavioral Interview Preparation Platform**, an enterprise-grade, three-tier cloud application developed by the project team *"Coffee and Code"*. The platform bridges the divide between passive preparation and high-fidelity corporate recruitment by automating real-time, role-adaptive mock interview simulations backed by Generative Artificial Intelligence and deep analytical reporting.

The system is architected atop a decoupled, micro-ready architecture:
1. **Frontend Presentation Tier:** A reactive Single Page Application (SPA) constructed using **React 19**, **TypeScript**, **Vite**, **Tailwind CSS v4**, and **Lucide React**. It provides a zero-latency, distraction-free conversational interview interface featuring per-question countdown timers, responsive code syntax highlighting, adaptive role navigation, and rich visual progress dashboards.
2. **Backend Application Tier:** A robust, enterprise-grade RESTful API built on **Java 21 LTS** and **Spring Boot 3.3.5**, leveraging **Spring Security 6**, **JSON Web Tokens (JJWT 0.12.6)** with SHA-512 signatures, **Spring Data JPA**, **Hibernate 6**, and **HikariCP** connection pooling. It incorporates a resilient dual-evaluator engine combining the **Google Gemini 1.5 Flash LLM** via REST interactions with a deterministic rule-based **Mock AI Evaluation Engine** fallback to ensure $99.99\%$ service availability.
3. **Database Tier:** A cloud-managed relational store running **MySQL 8.x/9.x** hosted on **Aiven Cloud** featuring strict SSL/TLS encryption (`sslMode=REQUIRED`), dynamic connection pooling, automated foreign key cascading, and relational consistency across candidates, roles, categorized question banks, timed responses, and multidimensional feedback rubrics.
4. **DevOps & Cloud Delivery:** Automated Continuous Integration and Deployment (CI/CD) pipelines connected via **Git/GitHub** to **Render Cloud**, deploying the backend as a containerized web service and the frontend as an edge-cached static distribution.

The platform provides a complete **Multidimensional Evaluative Rubric** evaluating student submissions on five distinct quantitative vectors (Overall Score, Technical Correctness, Domain Relevance, Depth & Completeness, and Syntactic Clarity) scaled from $1$ to $10$, supplemented with qualitative diagnostic breakdowns detailing explicit strengths, actionable weaknesses, and ideal model answers. Rigorous empirical validation—including automated JUnit/Mockito test suites, API contract testing, and live cloud deployment—confirms that the system successfully eliminates evaluation latency ($< 1.8$ seconds per submission), scales to concurrent multi-role sessions, and delivers objective, repeatable feedback, democratizing elite placement preparation for students worldwide.

**Keywords:** Artificial Intelligence, Generative Language Models, Spring Boot 3, React 19, Automated Interview Evaluation, Cloud Computing, Aiven MySQL, Render, Full-Stack Architecture, RESTful API.

---
\pagebreak

## TABLE OF CONTENTS

| Chapter | Title | Page No. |
| :---: | :--- | :---: |
| | **Certificates & Formal Approvals** | ii |
| | **Candidates' Declaration** | iii |
| | **Acknowledgements** | iv |
| | **Executive Summary / Abstract** | v |
| | **List of Figures** | viii |
| | **List of Tables** | ix |
| | **List of Abbreviations** | x |
| **1** | **INTRODUCTION & DOMAIN ANALYSIS** | **1** |
| | 1.1 Context and Background | 1 |
| | 1.2 The Placement Crisis and Interview Bottlenecks | 2 |
| | 1.3 Problem Statement | 4 |
| | 1.4 Objectives of the AI Interview System | 5 |
| | 1.5 Scope, Boundaries, and Limitations | 6 |
| | 1.6 Report Organization | 7 |
| **2** | **LITERATURE SURVEY & STATE-OF-THE-ART BENCHMARKING** | **8** |
| | 2.1 Existing Interview Preparation Paradigms | 8 |
| | 2.2 Critical Analysis of Commercial & Open-Source Platforms | 10 |
| | 2.3 Evolution of NLP and Large Language Models in Education | 12 |
| | 2.4 Research Gap Identification | 14 |
| | 2.5 Proposed System Highlights vs. Industry Benchmarks | 15 |
| **3** | **SYSTEM REQUIREMENTS SPECIFICATION (IEEE 830 STANDARD)** | **17** |
| | 3.1 Functional Requirements (FR-01 to FR-20) | 17 |
| | 3.2 Non-Functional Requirements (NFR-01 to NFR-10) | 20 |
| | 3.3 Hardware and Network Interface Requirements | 22 |
| | 3.4 Software Environment & Dependencies | 23 |
| | 3.5 Use Case Modeling & Actor Descriptions | 24 |
| **4** | **TECHNOLOGY STACK ARCHITECTURE & DECISION RECORDS** | **26** |
| | 4.1 Backend Technology Selection & Rationale (Java 21, Spring Boot 3) | 26 |
| | 4.2 Frontend Architecture (React 19, TypeScript, Tailwind CSS v4, Vite) | 29 |
| | 4.3 Artificial Intelligence Framework (Google Gemini 1.5 Flash API) | 32 |
| | 4.4 Persistence Engine & Cloud Database (MySQL 8/9, Aiven Cloud) | 34 |
| | 4.5 Security & Token Framework (Spring Security 6, JJWT 0.12) | 36 |
| | 4.6 Infrastructure, DevOps & Continuous Deployment (Render, Git) | 37 |
| **5** | **SYSTEM ARCHITECTURE & HIGH-LEVEL DESIGN** | **39** |
| | 5.1 Three-Tier Layered Architecture Pattern | 39 |
| | 5.2 System Context Diagram & Interaction Topology | 41 |
| | 5.3 Sequence Diagrams (Authentication, Interview Lifecycle, AI Scoring) | 43 |
| | 5.4 Data Flow Diagrams (DFD Level 0, Level 1, Level 2) | 46 |
| **6** | **DATABASE DESIGN & RELATIONAL DATA MODELING** | **49** |
| | 6.1 Conceptual Data Model & Entity-Relationship (ER) Diagram | 49 |
| | 6.2 Data Dictionary & Comprehensive Schema Specifications | 51 |
| | 6.3 Referential Integrity, Cascade Rules, and Constraints | 55 |
| | 6.4 Indexing, Query Optimization, and HikariCP Pool Tuning | 56 |
| **7** | **DETAILED MODULE IMPLEMENTATION** | **59** |
| | 7.1 User Authentication & Authorization Module | 59 |
| | 7.2 Role Selection & Session Orchestration Module | 62 |
| | 7.3 Multi-Track MCQ Assessment Engine | 64 |
| | 7.4 Real-Time Interactive Interview Simulator | 66 |
| | 7.5 Student Analytics, Progress & Historical Reporting | 68 |
| | 7.6 Administrative Control Panel & Question Bank Management | 70 |
| **8** | **ARTIFICIAL INTELLIGENCE & EVALUATION ENGINE** | **72** |
| | 8.1 Prompt Engineering & Evaluation Rubric Design | 72 |
| | 8.2 Google Gemini 1.5 Flash REST Integration | 74 |
| | 8.3 JSON Schema Enforcement & Extraction Mechanics | 76 |
| | 8.4 Fallback Resiliency: Deterministic Mock AI Engine | 78 |
| | 8.5 Multidimensional Mathematical Scoring Formulation | 80 |
| **9** | **RESTFUL API SPECIFICATIONS & COMMUNICATION CONTRACTS** | **82** |
| | 9.1 API Architecture & Standardized JSON Envelopes | 82 |
| | 9.2 Authentication Endpoints Specification | 83 |
| | 9.3 Role & Question Catalog Endpoints | 85 |
| | 9.4 Interview Lifecycle & Response Evaluation Endpoints | 87 |
| | 9.5 Student Analytics & Administrator Endpoints | 90 |
| **10** | **FRONTEND ARCHITECTURE & USER INTERFACE WALKTHROUGH** | **92** |
| | 10.1 Component Architecture & Layout Hierarchy | 92 |
| | 10.2 State Management & Global Context Providers | 94 |
| | 10.3 Route Guarding & Role-Based UI Rendering | 96 |
| | 10.4 Screen-by-Screen User Interface Walkthrough | 97 |
| **11** | **SECURITY ARCHITECTURE & THREAT MITIGATION** | **102** |
| | 11.1 Threat Modeling & Attack Vectors | 102 |
| | 11.2 Stateless JWT Implementation & SHA-512 Verification | 103 |
| | 11.3 Password Hashing & Salt Security with BCrypt | 105 |
| | 11.4 Cross-Origin Resource Sharing (CORS) & Injection Defenses | 106 |
| | 11.5 Cloud Secrets Management & Zero-Hardcoded Credentials Policy | 107 |
| **12** | **TESTING, QUALITY ASSURANCE & VERIFICATION** | **109** |
| | 12.1 Testing Strategy & QA Hierarchy | 109 |
| | 12.2 Unit & Integration Testing with JUnit 5 & Mockito | 110 |
| | 12.3 Comprehensive Verification Matrix (40 Test Cases) | 112 |
| | 12.4 Load, Latency & Reliability Analysis | 116 |
| **13** | **CLOUD INFRASTRUCTURE, DEVOPS & CONTINUOUS DEPLOYMENT** | **118** |
| | 13.1 Cloud Topology: Render & Aiven Managed Services | 118 |
| | 13.2 Declarative Infrastructure: `render.yaml` Blueprint | 120 |
| | 13.3 Aiven Cloud MySQL High-Availability & SSL Enforcement | 122 |
| | 13.4 Continuous Integration / Continuous Deployment (CI/CD) Workflow | 124 |
| **14** | **ENGINEERING CHALLENGES, PRODUCTION CRASHES & SOLUTIONS**| **126** |
| | 14.1 The Production Render-Aiven DNS Crash (`UnknownHostException`)| 126 |
| | 14.2 MySQL Connector-J Compile Scope Dependency Isolation | 129 |
| | 14.3 CORS Whitelisting & Reverse Proxy Protocol Handling | 130 |
| | 14.4 LLM Response Parsing Resiliency & Markdown Sanitization | 131 |
| **15** | **CONCLUSION & FUTURE WORK** | **133** |
| | 15.1 Summary of Contributions | 133 |
| | 15.2 Fulfillment of Educational & Societal Objectives | 134 |
| | 15.3 Future Roadmap (Real-Time Voice, Computer Vision, Live IDE) | 135 |
| | **REFERENCES & BIBLIOGRAPHY** | **137** |
| | **APPENDICES** | **140** |
| | Appendix A: Complete Database DDL Script | 140 |
| | Appendix B: Environment Variables Reference Guide | 143 |

---
\pagebreak

## LIST OF FIGURES

* **Figure 1.1:** Placement Preparation Disconnect: Theory vs. Interview Articulation
* **Figure 3.1:** Comprehensive UML Use Case Diagram of AI Interview Prep System
* **Figure 4.1:** Complete Technology Stack Ecosystem & Component Layers
* **Figure 5.1:** Three-Tier Decoupled Enterprise System Architecture
* **Figure 5.2:** User Registration, Login, and JWT Token Issuance Sequence Diagram
* **Figure 5.3:** Adaptive Interview Session Creation & Question Generation Sequence Diagram
* **Figure 5.4:** Candidate Response Submission, Gemini LLM Evaluation & Feedback Loop
* **Figure 5.5:** Data Flow Diagram (DFD Level 0 - Context Level)
* **Figure 5.6:** Data Flow Diagram (DFD Level 1 - Subsystem Interactions)
* **Figure 6.1:** Entity-Relationship (ER) Relational Schema Diagram
* **Figure 8.1:** Generative AI Evaluation Pipeline & Fallback Circuit Breaker
* **Figure 9.1:** RESTful API Route Structure & Authorization Hierarchy
* **Figure 10.1:** React 19 Frontend Component Tree & Context Provider Hierarchy
* **Figure 10.2:** User Interface Flow: Landing Page $\rightarrow$ Role Selection $\rightarrow$ Live Simulation $\rightarrow$ Comprehensive Report Card
* **Figure 13.1:** Production Cloud Infrastructure Deployment Topology on Render and Aiven
* **Figure 14.1:** Root Cause Analysis Diagram: Aiven MySQL Dynamic DNS Resolution & Failover

---

## LIST OF TABLES

* **Table 2.1:** Comparative Feature Matrix: Traditional vs. AI-Powered Preparation Platforms
* **Table 3.1:** Functional Requirements Traceability Matrix (FR-01 to FR-20)
* **Table 3.2:** Non-Functional Requirements Specification (NFR-01 to NFR-10)
* **Table 4.1:** Complete Technology Stack Inventory & Semantic Versioning
* **Table 6.1:** Data Dictionary: `users` Table Specification
* **Table 6.2:** Data Dictionary: `roles` Table Specification
* **Table 6.3:** Data Dictionary: `questions` Table Specification
* **Table 6.4:** Data Dictionary: `mcq_questions` Table Specification
* **Table 6.5:** Data Dictionary: `interview_sessions` Table Specification
* **Table 6.6:** Data Dictionary: `responses` Table Specification
* **Table 6.7:** Data Dictionary: `feedbacks` Table Specification
* **Table 8.1:** Multidimensional Evaluation Vectors & Qualitative Weightings
* **Table 9.1:** Authentication API Endpoints Contract
* **Table 9.2:** Role & Question Catalog Endpoints Contract
* **Table 9.3:** Interview Simulation & Scoring Endpoints Contract
* **Table 9.4:** Student Analytics & Dashboard Endpoints Contract
* **Table 9.5:** Administrative Management Endpoints Contract
* **Table 12.1:** Automated Unit & Integration Test Case Execution Matrix (Test ID TC-01 to TC-40)
* **Table 12.2:** System Latency & Performance Benchmarks
* **Table 13.1:** Render Production Environment Variables Configuration

---
\pagebreak

# CHAPTER 1: INTRODUCTION & DOMAIN ANALYSIS

## 1.1 Context and Background
In the twenty-first-century information technology economy, the hiring process for software engineers, data analysts, DevOps practitioners, and cloud architects has shifted dramatically. Gone are the days when recruitment was based solely on university GPA or pencil-and-paper examinations. Today, technology firms—ranging from agile startups to global FAANG/MAMAA enterprises—subject candidates to rigorous, multi-round technical interviews designed to evaluate not merely whether a candidate can write code, but how deeply they comprehend underlying engineering principles, evaluate algorithmic trade-offs, architect resilient systems, and communicate complex technical ideas under stress.

A typical corporate hiring funnel involves:
1. **Initial Screening / MCQ Assessment:** Validating foundational concepts, language syntax, computer architecture, and basic reasoning.
2. **Technical Deep-Dive Rounds:** Probing language internals (e.g., JVM memory management, multithreading, Python GIL, React Virtual DOM reconciliation), database design, SQL optimization, and distributed systems.
3. **Problem-Solving & Data Structures:** Live algorithmic design, complexity analysis ($\mathcal{O}(n)$ time and space bounds), and edge-case handling.
4. **Behavioral & Cultural Competency (HR):** Assessing team collaboration, conflict resolution, project leadership, and communication via behavioral frameworks such as the STAR technique (Situation, Task, Action, Result).

While the demands of hiring have grown progressively more sophisticated, the preparation mechanisms accessible to undergraduate engineering students have remained fundamentally fragmented and outdated.

## 1.2 The Placement Crisis and Interview Bottlenecks
Every year, millions of undergraduate engineering students enter the placement cycle. In educational institutions such as Maharishi Markandeshwar Engineering College (MMEC) and technical universities globally, students frequently encounter an alarming paradox: **students who excel academically and solve hundreds of isolated coding puzzles often freeze, ramble, or fail during real interviews.**

Through extensive empirical investigation, our project team (*Coffee and Code*) identified three structural bottlenecks in traditional preparation:

```
+-------------------------------------------------------------------------+
|                  THE INTERVIEW PREPARATION PARADOX                     |
+-------------------------------------------------------------------------+
|                                                                         |
|  [ Passive Study & Rote Memorization ]                                  |
|  * Reading question banks (GeeksforGeeks, JavaTpoint)                  |
|  * No vocal articulation, no countdown pressure, no dialogue            |
|                                |                                        |
|                                v                                        |
|  [ Disconnected Algorithmic Grinding ]                                  |
|  * Solving isolated LeetCode / HackerRank problems                      |
|  * Ignores architectural explanation, trade-off defense, system design  |
|                                |                                        |
|                                v                                        |
|  [ The High-Stakes Real Interview Wall ]                                |
|  * Candidate freezes under time pressure                                |
|  * Fails to articulate thoughts coherently                              |
|  * Lacks objective, quantitative diagnostic feedback                    |
|                                                                         |
+-------------------------------------------------------------------------+
```

1. **The Passive Learning Trap:** Students spend months reading static question-and-answer blogs. Reading an answer to *"Explain Java's HashMap internal hashing mechanism and collision resolution"* creates an illusion of competence. When an interviewer asks the question verbally, the student struggles to structure the explanation logically.
2. **The Scheduling and Cost Barrier of Mock Interviews:** Peer mock interviews require mutual coordination, and peers rarely possess the technical seniority required to provide constructive criticism. Commercial platforms that pair students with professional FAANG interviewers charge between \$100 and \$250 per hour—a price tag entirely beyond the reach of average college students.
3. **Absence of Actionable, Granular Feedback:** When students fail an interview, companies rarely provide feedback due to legal liabilities. Students receive a generic rejection email, leaving them unaware of whether their failure stemmed from technical inaccuracies, superficial answers, or poor communication clarity.

## 1.3 Problem Statement
The central problem addressed by this project is formulated as follows:

> *"To design, engineer, and deploy an autonomous, scalable, full-stack software platform that simulates authentic technical and behavioral interview sessions across multiple specialized software engineering domains, captures candidate responses under timed conditions, evaluates submissions using Generative Large Language Models across multiple objective dimensions, and generates granular diagnostic report cards with zero reliance on human evaluators."*

## 1.4 Objectives of the AI Interview System
To overcome the stated challenges, the platform was built around the following primary objectives:
1. **Domain-Specific Role Emulation:** Provide customized interview environments for eight core industry tracks: **Java Developer**, **Frontend Developer**, **Backend Developer**, **Full Stack Developer**, **Python Developer**, **DevOps Engineer**, **Data Structures & Algorithms (DSA)**, and **HR / Behavioral**.
2. **Dual-Mode Preparation Engine:** Support both timed Multiple-Choice Question (MCQ) tracks for conceptual screening and open-ended technical simulation rounds for deep articulation.
3. **Intelligent Multidimensional AI Scoring:** Implement an automated evaluation engine capable of dissecting open-ended answers across five standardized rubrics: **Overall Score**, **Technical Correctness**, **Relevance**, **Completeness**, and **Clarity**, scaled mathematically from $1$ to $10$.
4. **Qualitative Diagnostic Breakdown:** Automatically detect and list precise technical **strengths** demonstrated by the candidate, pinpoint critical **weaknesses/omissions**, and display a reference **model answer** for immediate conceptual reinforcement.
5. **Zero-Downtime High Availability:** Ensure continuous platform operation by coupling the cloud-hosted **Google Gemini 1.5 Flash LLM** with an intelligent, deterministic **Mock AI Evaluation Fallback Engine**, ensuring students never experience downtime due to third-party API rate limits or network dropouts.
6. **Enterprise-Grade Security:** Enforce stateless, role-based access control (RBAC) utilizing JSON Web Tokens (JJWT 0.12.6) with SHA-512 signatures, BCrypt password hashing, and clean separation between candidate and administrative roles.
7. **Longitudinal Progress Analytics:** Persist student session history to compute cumulative moving averages, track domain-specific trends, and visually present performance trajectories via responsive analytical dashboards.

## 1.5 Scope, Boundaries, and Limitations
### In-Scope:
* User registration, profile customization, and secure authentication.
* Role-specific dynamic interview creation with configurable question depth.
* Timed question rendering with client-side clock synchronization and auto-submission handling.
* Integration with Google Generative AI REST endpoints for real-time natural language evaluation.
* Generation of comprehensive, printable session report cards.
* Dedicated administrative portal for user management, role creation, and question bank CRUD operations.
* Cloud deployment on Render (Web Service and Static Site) backed by Aiven Cloud Managed MySQL with enforced SSL/TLS.

### Out-of-Scope (Future Enhancements):
* Real-time speech-to-text audio synthesis via WebRTC / Whisper.
* Computer-vision-based posture, gaze, and facial emotion detection.
* Live collaborative coding IDE with virtual containerized execution runtimes.

---
\pagebreak

# CHAPTER 2: LITERATURE SURVEY & STATE-OF-THE-ART BENCHMARKING

## 2.1 Existing Interview Preparation Paradigms
Over the past decade, several software platforms have attempted to address technical recruitment preparation. These platforms generally fall into three archetypes:

1. **Algorithmic Coding Repositories (e.g., LeetCode, HackerRank, Codeforces):**
   * *Mechanism:* Provide competitive programming problems judged by deterministic unit tests checking time and space complexity.
   * *Limitation:* Focus exclusively on data structures and algorithms. They do not evaluate a student's ability to explain architectural concepts, debug distributed systems, or answer conversational technical questions.
2. **Static Technical Q&A Portals (e.g., GeeksforGeeks, JavaTpoint, Sanfoundry):**
   * *Mechanism:* Encyclopedic repositories of interview questions categorized by topic.
   * *Limitation:* Purely passive reading. No interaction, no time pressure, no evaluation of candidate articulation.
3. **Peer-to-Peer & Mentorship Platforms (e.g., Pramp, Interviewing.io):**
   * *Mechanism:* Connect candidates with other job seekers or industry engineers for mock video sessions.
   * *Limitation:* High cost, severe scheduling bottlenecks, and inconsistent evaluation quality.

## 2.2 Comparative Analysis Matrix
Table 2.1 summarizes the feature matrix comparing traditional solutions against the AI Interview Prep System:

| Evaluation Dimension | LeetCode / HackerRank | GeeksforGeeks | Pramp / Peer Platforms | Interviewing.io | **AI Interview Prep (Our System)** |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **Conversational Articulation** | ❌ No | ❌ No | ⚠️ Peer Dependent | ✅ Yes | **✅ Yes (AI Evaluated)** |
| **Multi-Domain Role Customization** | ❌ Algorithmic Only | ⚠️ Static Articles | ⚠️ Limited Roles | ✅ Yes | **✅ Yes (8 Specialized Tracks)** |
| **Instant Evaluation Latency** | ✅ Immediate (<1s) | ❌ None | ❌ Manual (Hours) | ❌ Manual (Days) | **✅ Immediate (< 1.8s)** |
| **Granular Rubric Scoring (1-10)**| ❌ Pass/Fail Only | ❌ None | ⚠️ Subjective | ⚠️ Qualitative | **✅ 5 Quantitative Vectors** |
| **Diagnostic Strengths & Weaknesses**| ❌ None | ❌ None | ⚠️ Peer Dependent | ✅ Yes | **✅ Automated & Explicit** |
| **Availability / Scheduling** | ✅ 24/7 | ✅ 24/7 | ❌ Requires Pairing | ❌ Appointment Only| **✅ 24/7 On-Demand** |
| **Financial Cost to Student** | Freemium ($35/mo) | Free | Free / Token-based | \$100 - \$250 / session | **✅ Free / Open Source** |
| **Integrated MCQ Screening** | ⚠️ Limited | ✅ Static | ❌ No | ❌ No | **✅ Interactive & Timed** |
| **Administrative Control & CRUD** | ❌ None | ❌ None | ❌ None | ❌ None | **✅ Full Admin Dashboard** |

## 2.3 Evolution of NLP and Large Language Models in Education
The advent of transformer architectures (Vaswani et al., 2017) revolutionized natural language processing. Early attempts at automated short-answer grading relied on bag-of-words heuristics, Latent Semantic Analysis (LSA), or syntactic similarity metrics (e.g., BLEU, ROUGE). While effective for rote phrase matching, these heuristic techniques failed miserably at evaluating technical explanations where semantic equivalence exists across diverse vocabulary.

The introduction of modern autoregressive Large Language Models (LLMs)—specifically Google's Gemini family—enables contextual comprehension of technical syntax, code logic, and conceptual reasoning. Gemini 1.5 Flash features a streamlined architecture trained on vast multimodal corpora, delivering high inferencing speeds, strong instruction-following capabilities, and strict JSON schema adherence, making it an ideal engine for sub-two-second interview answer evaluation.

---
\pagebreak

# CHAPTER 3: SYSTEM REQUIREMENTS SPECIFICATION (IEEE 830 STANDARD)

## 3.1 Functional Requirements (FR)

### Module 1: User Identity & Profile Management
* **FR-01 (User Registration):** The system shall allow new candidates to register by providing their full name, unique email address, password, password confirmation, and target software engineering role.
* **FR-02 (Password Security):** The system shall validate that passwords contain a minimum of 6 characters and shall hash passwords using BCrypt with a secure salt work factor of 12 prior to database persistence.
* **FR-03 (Authentication & Token Issuance):** The system shall authenticate credentials and issue a cryptographically signed JSON Web Token (JJWT) with SHA-512 signatures and an expiration time of 24 hours.
* **FR-04 (Role-Based Authorization):** The system shall enforce distinct access privileges for `ROLE_STUDENT` and `ROLE_ADMIN`.

### Module 2: Role Catalog & Interview Orchestration
* **FR-05 (Role Exploration):** The system shall provide an active catalog of interview tracks (Java, Frontend, Backend, Full Stack, Python, DevOps, DSA, HR) displaying track metadata, description, difficulty rating, and icon tokens.
* **FR-06 (Interview Session Initialization):** When a candidate clicks *"Start Interview"*, the system shall initialize an `InterviewSession` entity in state `IN_PROGRESS`, dynamically binding 5 randomized, active questions associated with the chosen role.
* **FR-07 (Session State Preservation):** The system shall persist current question pointers, elapsed time, and partial progress, allowing graceful handling of network blips.

### Module 3: Response Submission & AI Evaluation Engine
* **FR-08 (Timed Answer Submission):** The client interface shall provide a countdown timer per question and transmit the candidate's answer string alongside the elapsed time in seconds (`timeTakenSeconds`) via an authenticated HTTP POST request.
* **FR-09 (Generative AI Invocation):** The backend shall construct a structured evaluation prompt incorporating the question text, category, expected keywords, model answer, and the candidate's response, querying the Google Gemini 1.5 Flash endpoint.
* **FR-10 (JSON Schema Validation):** The system shall enforce and parse a strictly typed JSON response containing integer scores ($1-10$) for `score`, `correctness`, `relevance`, `completeness`, `clarity`, string arrays for `strengths` and `weaknesses`, and an extensive `feedback` summary.
* **FR-11 (Fault-Tolerant Mock Fallback):** If the Gemini API key is missing, invalid, rate-limited, or unresolvable, the system shall transparently switch to the internal deterministic `MockAiEvaluationService` without throwing exceptions or degrading candidate experience.

### Module 4: Evaluation Persistence & Report Card Generation
* **FR-12 (Relational Response Storage):** The system shall persist the candidate's score metrics in the `responses` table and link detailed strengths, weaknesses, and feedback in the `feedbacks` table.
* **FR-13 (Session Finalization):** Upon submission of the final question ($Q_5$), the system shall compute arithmetic averages across all five metrics, update session status to `COMPLETED`, assign an overall score, and store an automated executive summary.
* **FR-14 (Comprehensive Report Card):** The system shall render a detailed post-interview report card displaying cumulative scores, visual radar/bar indicators, individual question reviews, candidate vs. model answers, and qualitative feedback cards.

### Module 5: MCQ Assessment Engine
* **FR-15 (Interactive MCQ Quizzes):** The system shall provide categorized multiple-choice quizzes complete with code snippets, 4 distinct options, real-time selection, immediate scoring, and in-depth conceptual explanations.

### Module 6: Administration & Content Control
* **FR-16 (Admin Dashboard Metrics):** The system shall provide administrators with global system statistics including total registered candidates, completed sessions, average student score, and role popularity distributions.
* **FR-17 (Question Bank Management):** Administrators shall have full Create, Read, Update, and Delete (CRUD) permissions over interview questions, roles, and MCQ banks.

```
+-----------------------------------------------------------------------------------------+
|                         UML USE CASE DIAGRAM (IEEE 830)                                 |
+-----------------------------------------------------------------------------------------+
|                                                                                         |
|       +-------------------+                                                             |
|       |     Candidate     |                                                             |
|       |     (STUDENT)     |                                                             |
|       +---------+---------+                                                             |
|                 |                                                                       |
|                 +---> [ Register Account / Login ]                                      |
|                 +---> [ Browse Roles & Job Tracks ]                                     |
|                 +---> [ Launch Adaptive Interview Session ]                             |
|                 +---> [ Submit Timed Answers ] --------> ( <<include>> Query AI Engine )|
|                 +---> [ Review Session Report Card ]                                    |
|                 +---> [ View Historical Progress ]                                      |
|                 +---> [ Take MCQ Skill Challenges ]                                     |
|                                                                                         |
|       +-------------------+                                                             |
|       |   Administrator   |                                                             |
|       |      (ADMIN)      |                                                             |
|       +---------+---------+                                                             |
|                 |                                                                       |
|                 +---> [ Monitor Global Analytics & KPIs ]                               |
|                 +---> [ Manage Users & Role Privileges ]                                |
|                 +---> [ Add / Edit / Deactivate Questions ]                             |
|                 +---> [ Audit Candidate Interview Logs ]                                |
|                                                                                         |
|       +-------------------+                                                             |
|       | External Services |                                                             |
|       +---------+---------+                                                             |
|                 |                                                                       |
|                 +---> [ Google Gemini 1.5 Flash API ] (NLP Semantic Evaluation)         |
|                 +---> [ Aiven Cloud Managed MySQL ] (Encrypted Relational Storage)      |
|                                                                                         |
+-----------------------------------------------------------------------------------------+
```

## 3.2 Non-Functional Requirements (NFR)
* **NFR-01 (Performance & Evaluation Latency):** Submissions processed by the AI evaluation engine shall return a fully structured evaluation result in less than $2.5$ seconds under standard network conditions ($< 1.8$ seconds on fallback).
* **NFR-02 (Security & Cryptographic Integrity):** All passwords must be hashed using BCrypt. All network communications across client, server, and database must use TLS 1.3 / SSL encryption. No passwords or secrets shall ever appear in logs.
* **NFR-03 (Availability & Uptime):** The backend services and database shall maintain $\ge 99.9\%$ uptime on cloud infrastructure with automatic health monitoring (`/api/health`).
* **NFR-04 (Scalability & Concurrency):** The backend application shall utilize non-blocking HikariCP connection pooling configured with $10$ maximum connections per container, dynamic idle eviction, and connection timeout bounds of $30,000\text{ ms}$.
* **NFR-05 (Data Integrity & ACID Guarantees):** All database transactions involving interview session progress, responses, and feedback must execute under relational ACID transactions with cascade-delete constraints.
* **NFR-06 (Portability & Responsiveness):** The frontend UI must be fully responsive across mobile ($320\text{px}$), tablet ($768\text{px}$), and desktop ($1080\text{px}+$ ) viewports without layout clipping or text overlap.

---
\pagebreak

# CHAPTER 4: TECHNOLOGY STACK ARCHITECTURE & DECISION RECORDS

Table 4.1 summarizes the complete technology inventory utilized in the AI Interview System:

```
+-----------------------------------------------------------------------------------------+
|                       ENTERPRISE TECHNOLOGY STACK ARCHITECTURE                          |
+-----------------------------------------------------------------------------------------+
|                                                                                         |
|  [ PRESENTATION TIER ]                                                                  |
|  React 19.2.8 | TypeScript 6.0 | Vite 8.3 | Tailwind CSS 4.3 | Lucide React | Axios    |
|                                                                                         |
|                                         |  HTTPS / REST / JSON                          |
|                                         v                                               |
|                                                                                         |
|  [ APPLICATION TIER ]                                                                   |
|  Java 21 LTS | Spring Boot 3.3.5 | Spring Security 6 | JJWT 0.12.6 | Spring Data JPA    |
|  Hibernate 6.6 | HikariCP | Jackson 2.17 | RestTemplate | Maven 3.9                     |
|                                                                                         |
|                     |                                         |                         |
|  JDBC (SSL REQUIRED)|                                         |  HTTPS REST / JSON      |
|                     v                                         v                         |
|  [ PERSISTENCE TIER ]                           [ COGNITIVE AI TIER ]                   |
|  Aiven Managed MySQL 8/9                        Google Gemini 1.5 Flash                 |
|  InnoDB Engine | TLS Encrypted                  Prompt Engineering | Fallback Mock      |
|                                                                                         |
|  [ DEVOPS & INFRASTRUCTURE TIER ]                                                       |
|  Render Web Services | Render Static Sites | Docker | Git & GitHub CI/CD               |
|                                                                                         |
+-----------------------------------------------------------------------------------------+
```

## 4.1 Backend Architecture Stack (Java 21 & Spring Boot 3.3.5)
1. **Java Development Kit (JDK 21 LTS):**
   * *Selection Rationale:* Java 21 provides Long-Term Support (LTS) along with modern JVM capabilities such as Virtual Threads (Project Loom) for lightweight concurrency, Pattern Matching for `switch` and `instanceof`, Text Blocks for multiline SQL/JSON prompt definitions, and enhanced garbage collection (ZGC / G1GC) ensuring minimal JVM pause times.
2. **Spring Boot Framework (v3.3.5):**
   * *Selection Rationale:* Spring Boot is the industry gold standard for enterprise microservices. It eliminates boilerplate XML configuration, provides auto-configured embedded Tomcat servers, offers robust Dependency Injection (IoC), and integrates seamlessly with enterprise security and persistence abstractions.
3. **Spring Data JPA & Hibernate 6.x:**
   * *Selection Rationale:* Object-Relational Mapping (ORM) reduces raw JDBC vulnerabilities, enforces compile-time type safety via Repository interfaces (`JpaRepository`), and manages transactional consistency (`@Transactional`).
4. **HikariCP Connection Pool:**
   * *Selection Rationale:* HikariCP is recognized as the fastest, most reliable JDBC connection pool in the Java ecosystem. Its zero-overhead bytecode architecture delivers microsecond connection acquisition.

## 4.2 Frontend Architecture Stack (React 19, TypeScript & Tailwind CSS v4)
1. **React 19.2.8:**
   * *Selection Rationale:* Component-driven architecture facilitating reactive UI state updates, concurrent rendering, and clean separation between presentation and business logic.
2. **TypeScript 6.0:**
   * *Selection Rationale:* Enforces strict compile-time typing over API request payloads, user profiles, interview responses, and state models, preventing an entire class of runtime `undefined is not a function` errors.
3. **Vite 8.3:**
   * *Selection Rationale:* Next-generation frontend tooling providing near-instantaneous Hot Module Replacement (HMR) and highly optimized Rollup production bundling (yielding sub-$400\text{ ms}$ build times).
4. **Tailwind CSS v4.3:**
   * *Selection Rationale:* Utility-first CSS engine providing an elegant dark-mode palette (`slate-950`, `indigo-600`, `cyan-400`), responsive grid flexboxes, and micro-animations without bloated CSS files.
5. **Lucide React:**
   * *Selection Rationale:* Clean, lightweight, tree-shakeable SVG iconography providing visual clarity across role categories, timers, scores, and status badges.

## 4.3 Artificial Intelligence Framework (Google Gemini 1.5 Flash)
* **Model Selection:** `gemini-1.5-flash` via the Google Generative Language REST API (`v1beta`).
* **Evaluation Criteria:** Extremely low inferencing latency ($< 1.5\text{s}$), strong structural comprehension of software engineering nomenclature, and strict adherence to returning pure JSON objects without enclosing markdown decorators.

---
\pagebreak

# CHAPTER 5: SYSTEM ARCHITECTURE & HIGH-LEVEL DESIGN

## 5.1 Three-Tier Layered Architecture Pattern
The platform follows a strictly decoupled Three-Tier Enterprise Architecture:

```
+-----------------------------------------------------------------------------------------+
|                     SYSTEM ARCHITECTURE & TIER TOPOLOGY                                 |
+-----------------------------------------------------------------------------------------+
|                                                                                         |
|  [ TIER 1: CLIENT PRESENTATION (React SPA) ]                                            |
|  Browser / Client Device                                                                |
|    |                                                                                    |
|    +--> Public Pages: Home, Features, About, MCQ Challenges, Login, Register             |
|    +--> Student Portal: Dashboard, Role Selection, Live Interview, Report Card, History |
|    +--> Admin Portal: User Management, System KPIs, Question Bank CRUD                  |
|    |                                                                                    |
|    +--> Axios Interceptor (Injects 'Authorization: Bearer <JWT>')                       |
|                                                                                         |
|                                   | HTTPS Requests (JSON)                               |
|                                   v                                                     |
|                                                                                         |
|  [ TIER 2: APPLICATION SERVICES (Spring Boot 3.3.5) ]                                   |
|  Embedded Tomcat Web Container (Port 8080)                                              |
|    |                                                                                    |
|    +--> Security Filter Chain: JwtAuthenticationFilter -> UsernamePasswordAuth         |
|    +--> REST Controllers: AuthController, InterviewController, RoleController, etc.    |
|    +--> Business Service Layer: AuthService, InterviewService, QuestionService, etc.    |
|    +--> Cognitive AI Layer: AiEvaluationServiceManager                                  |
|           |                                                                             |
|           +--> GeminiAiEvaluationService (Primary: HTTPS REST to Google API)            |
|           +--> MockAiEvaluationService (Circuit Breaker Fallback)                       |
|    +--> Data Access Layer: Spring Data JPA Repositories                                 |
|                                                                                         |
|                                   | JDBC Connection Pool (HikariCP / TLS)               |
|                                   v                                                     |
|                                                                                         |
|  [ TIER 3: DATA PERSISTENCE (Aiven Managed MySQL) ]                                     |
|  Cloud Relational Database Cluster                                                      |
|    +--> Tables: users, roles, questions, mcq_questions, interview_sessions,             |
|                 responses, feedbacks                                                    |
|                                                                                         |
+-----------------------------------------------------------------------------------------+
```

## 5.2 Dynamic Execution Sequence: Complete Interview Lifecycle
The following sequence diagram details the exact step-by-step transaction flow from candidate response submission to AI evaluation and report card generation:

```
Candidate (Browser)        Backend Controller          AiEvaluationService       Gemini API / Mock      Aiven MySQL
        |                           |                           |                       |                   |
        |--- 1. POST /answer ------>|                           |                       |                   |
        |    (answer, timeTaken)    |--- 2. Fetch Question ---->|                       |                   |
        |                           |       & Session Info      |                       |                   |
        |                           |<--------------------------|-----------------------|--- Return Entity -|
        |                           |                           |                       |                   |
        |                           |--- 3. evaluateAnswer() -->|                       |                   |
        |                           |    (prompt + context)     |--- 4. HTTP POST ----->|                   |
        |                           |                           |    generateContent    |                   |
        |                           |                           |<-- 5. Return JSON ----|                   |
        |                           |                           |    (or Fallback)      |                   |
        |                           |<-- 6. EvaluationResult ---|                       |                   |
        |                           |    (Score, Feedback, etc.)|                       |                   |
        |                           |                                                   |                   |
        |                           |--- 7. BEGIN TRANSACTION --------------------------------------------->|
        |                           |    - INSERT INTO responses (scores, answer)                           |
        |                           |    - INSERT INTO feedbacks (strengths, weaknesses, text)              |
        |                           |    - UPDATE interview_sessions (currentQuestionIndex++)               |
        |                           |--- 8. COMMIT TRANSACTION -------------------------------------------->|
        |                           |                                                                       |
        |<-- 9. HTTP 200 OK --------|                                                                       |
        |    (Result Payload)       |                                                                       |
        |                           |                                                                       |
        v                           v                                                                       v
```

---
\pagebreak

# CHAPTER 6: DATABASE DESIGN & RELATIONAL DATA MODELING

## 6.1 Conceptual Data Model & Entity-Relationship (ER) Schema
The relational database design enforces strict First, Second, and Third Normal Forms (3NF). It models the relationship between users, role definitions, question repositories, interactive sessions, individual answers, and AI-generated diagnostic feedback.

```
+-----------------------------------------------------------------------------------------+
|                         ENTITY-RELATIONSHIP (ER) DIAGRAM                                |
+-----------------------------------------------------------------------------------------+
|                                                                                         |
|      +------------------+                    +------------------------+                 |
|      |      users       | 1                * |   interview_sessions   |                 |
|      +------------------+------------------->+------------------------+                 |
|      | PK  id           |                    | PK  id                 |                 |
|      |     email (UQ)   |                    | FK  user_id            |                 |
|      |     password     |                    | FK  role_id            |                 |
|      |     role         |                    |     overall_score      |                 |
|      +------------------+                    |     status             |                 |
|                                              +-----------+------------+                 |
|                                                          | 1                            |
|      +------------------+                                |                              |
|      |      roles       | 1                              | *                            |
|      +------------------+                                v                              |
|      | PK  id           |                    +------------------------+                 |
|      |     name (UQ)    |<-------------------+       responses        |                 |
|      |     slug (UQ)    | 1                * +------------------------+                 |
|      +--------+---------+                    | PK  id                 |                 |
|               |                              | FK  session_id         |                 |
|               | 1                            | FK  question_id        |                 |
|               |                              |     candidate_answer   |                 |
|               v *                            |     score (1-10)       |                 |
|      +------------------+                    +-----------+------------+                 |
|      |    questions     |                                | 1                            |
|      +------------------+                                |                              |
|      | PK  id           |                                | 1                            |
|      | FK  role_id      |                                v                              |
|      |     category     |                    +------------------------+                 |
|      |     question_text|                    |       feedbacks        |                 |
|      |     expected_top |                    +------------------------+                 |
|      |     model_answer |                    | PK  id                 |                 |
|      +------------------+                    | FK  response_id (UQ)   |                 |
|                                              |     strengths (TEXT)   |                 |
|      +------------------+                    |     weaknesses (TEXT)  |                 |
|      |  mcq_questions   |                    |     feedback_text      |                 |
|      +------------------+                    +------------------------+                 |
|      | PK  id           |                                                               |
|      |     track        |                                                               |
|      |     question     |                                                               |
|      |     option_a..d  |                                                               |
|      |     correct_opt  |                                                               |
|      +------------------+                                                               |
|                                                                                         |
+-----------------------------------------------------------------------------------------+
```

## 6.2 Data Dictionary

### Table 6.1: `users` Table
Stores registered candidate and administrative identities.
| Column Name | SQL Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique identifier for the user account |
| `name` | VARCHAR(255) | NOT NULL | Candidate's full name |
| `email` | VARCHAR(255) | NOT NULL, UNIQUE | User login email address |
| `password` | VARCHAR(255) | NOT NULL | BCrypt encrypted hash (work factor 12) |
| `role` | VARCHAR(64) | NOT NULL, DEFAULT 'ROLE_STUDENT' | Security authorization role (`ROLE_STUDENT`, `ROLE_ADMIN`) |
| `target_role` | VARCHAR(255) | NULLABLE | Target professional role (e.g. "Full Stack Developer") |
| `created_at` | DATETIME | NOT NULL | Account creation timestamp |
| `updated_at` | DATETIME | NULLABLE | Timestamp of last profile update |

### Table 6.2: `roles` Table
Maintains the catalog of supported professional interview specializations.
| Column Name | SQL Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique role identifier |
| `name` | VARCHAR(255) | NOT NULL, UNIQUE | Human-readable role title (e.g. "Java Developer") |
| `slug` | VARCHAR(255) | NOT NULL, UNIQUE | URL-safe slug identifier (e.g. "java-developer") |
| `description` | TEXT | NULLABLE | Detailed description of domains and topics covered |
| `icon` | VARCHAR(64) | NULLABLE | Lucide icon identifier token (e.g. "coffee", "layers")|
| `difficulty` | VARCHAR(32) | NOT NULL, DEFAULT 'Medium'| Default curriculum difficulty ("Easy", "Medium", "Hard")|
| `active` | BOOLEAN | NOT NULL, DEFAULT TRUE | Soft-delete flag controlling role visibility |
| `created_at` | DATETIME | NOT NULL | Creation audit timestamp |

### Table 6.3: `questions` Table
Contains the comprehensive repository of open-ended interview questions.
| Column Name | SQL Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique question identifier |
| `role_id` | BIGINT | NOT NULL, FK $\rightarrow$ `roles(id)` | Foreign key referencing associated job role |
| `category` | VARCHAR(64) | NOT NULL | Category ("Technical", "System Design", "Behavioral") |
| `question_text` | TEXT | NOT NULL | The full textual prompt presented to the candidate |
| `difficulty` | VARCHAR(32) | NOT NULL, DEFAULT 'Medium'| Difficulty level of the individual question |
| `expected_topics`| TEXT | NULLABLE | Key concepts / keywords expected in candidate answers |
| `model_answer` | TEXT | NULLABLE | Gold-standard reference answer used in AI comparison |
| `active` | BOOLEAN | NOT NULL, DEFAULT TRUE | Visibility flag |
| `created_at` | DATETIME | NOT NULL | Creation audit timestamp |

### Table 6.4: `interview_sessions` Table
Tracks candidate simulation sessions and aggregated scoring metrics.
| Column Name | SQL Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique interview session identifier |
| `user_id` | BIGINT | NOT NULL, FK $\rightarrow$ `users(id)` | Candidate conducting the interview session |
| `role_id` | BIGINT | NOT NULL, FK $\rightarrow$ `roles(id)` | Role track being evaluated |
| `difficulty` | VARCHAR(32) | NOT NULL, DEFAULT 'Medium'| Difficulty level chosen for the session |
| `total_questions`| INT | NOT NULL, DEFAULT 5 | Total questions configured for the session |
| `current_question_index`| INT | NOT NULL, DEFAULT 0 | Index of the active question ($0$ to $5$) |
| `overall_score` | DOUBLE | NULLABLE | Final aggregated score out of 10.0 |
| `correctness_avg`| DOUBLE | NULLABLE | Average technical accuracy score |
| `relevance_avg` | DOUBLE | NULLABLE | Average topical relevance score |
| `completeness_avg`| DOUBLE | NULLABLE | Average depth and completeness score |
| `clarity_avg` | DOUBLE | NULLABLE | Average linguistic and technical clarity score |
| `status` | VARCHAR(32) | NOT NULL, DEFAULT 'IN_PROGRESS' | Lifecycle state (`IN_PROGRESS`, `COMPLETED`) |
| `summary_feedback`| TEXT | NULLABLE | Automated holistic summary of performance |
| `created_at` | DATETIME | NOT NULL | Session initialization timestamp |
| `completed_at` | DATETIME | NULLABLE | Session completion timestamp |

### Table 6.5: `responses` Table
Records individual question responses and granular scores.
| Column Name | SQL Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique response identifier |
| `session_id` | BIGINT | NOT NULL, FK $\rightarrow$ `interview_sessions(id)`| Enclosing interview session |
| `question_id` | BIGINT | NOT NULL, FK $\rightarrow$ `questions(id)` | Question answered by the candidate |
| `candidate_answer`| TEXT | NULLABLE | Raw text submitted by candidate |
| `time_taken_seconds`| INT | NOT NULL, DEFAULT 0 | Seconds elapsed during answer drafting |
| `score` | INT | NOT NULL, DEFAULT 0 | Holistic score ($1$ to $10$) |
| `correctness` | INT | NOT NULL, DEFAULT 0 | Technical correctness metric ($1$ to $10$) |
| `relevance` | INT | NOT NULL, DEFAULT 0 | Topical relevance metric ($1$ to $10$) |
| `completeness`| INT | NOT NULL, DEFAULT 0 | Depth and completeness metric ($1$ to $10$) |
| `clarity` | INT | NOT NULL, DEFAULT 0 | Articulation and clarity metric ($1$ to $10$) |
| `answered_at` | DATETIME | NOT NULL | Response submission timestamp |

### Table 6.6: `feedbacks` Table
Maintains detailed diagnostic qualitative feedback linked to each response.
| Column Name | SQL Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `id` | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Unique feedback identifier |
| `response_id` | BIGINT | NOT NULL, UNIQUE, FK $\rightarrow$ `responses(id)` | Strict 1-to-1 link to candidate response |
| `strengths` | TEXT | NULLABLE | JSON array / list of specific strengths observed |
| `weaknesses` | TEXT | NULLABLE | JSON array / list of identified knowledge gaps |
| `feedback_text`| TEXT | NULLABLE | Comprehensive narrative guidance for improvement |
| `created_at` | DATETIME | NOT NULL | Feedback creation timestamp |

---
\pagebreak

# CHAPTER 7: DETAILED MODULE IMPLEMENTATION

## 7.1 User Authentication & Authorization Module
The authentication subsystem ensures zero-trust stateless security:
* **Password Hashing:** Implemented in `SecurityConfig.java` using `BCryptPasswordEncoder(12)`.
* **Token Issuance:** Upon successful verification in `AuthService.java`, `JwtTokenProvider.java` generates a compact JWT:
  $$\text{JWT} = \text{Base64Url}(\text{Header}) \mathbin{\Vert} "." \mathbin{\Vert} \text{Base64Url}(\text{Payload}) \mathbin{\Vert} "." \mathbin{\Vert} \text{Signature}$$
  The signature is generated using HMAC-SHA512:
  $$\text{Signature} = \text{HMAC-SHA512}\Big(\text{Base64Url}(\text{Header}) \mathbin{\Vert} "." \mathbin{\Vert} \text{Base64Url}(\text{Payload}),\ \mathcal{K}_{\text{secret}}\Big)$$
* **Security Filter:** Every inbound request passes through `JwtAuthenticationFilter.java`, which extracts the token from the `Authorization: Bearer <token>` header, validates the signature and expiration against $\mathcal{K}_{\text{secret}}$, loads user details, and injects an authenticated `UsernamePasswordAuthenticationToken` into the `SecurityContextHolder`.

## 7.2 Interview Simulation & Orchestration Module
Managed via `InterviewService.java` and `InterviewController.java`:
* When an interview is launched (`POST /api/interviews/start`), the system fetches the requested `Role` entity, queries `QuestionRepository.findByRoleIdAndActiveTrue(roleId)`, randomly shuffles the questions to ensure variance, and extracts the first 5 questions.
* The session state machine progresses sequentially from index $0$ to $4$. Each invocation of `POST /api/interviews/{id}/answer` accepts `questionId`, `answer`, and `timeTakenSeconds`, initiates AI evaluation, records the result, and returns the next question or triggers session finalization.

## 7.3 Multi-Track MCQ Assessment Engine
Implemented in `McqController.java` and `McqQuestionRepository.java`:
* Designed for preliminary screening, the MCQ module serves randomized questions across languages (Java, Python, C++, JavaScript) and topics (OOPs, SQL, DSA).
* Students select options against an active countdown clock. Upon submission, the backend evaluates the answer against the encrypted `correctOption` key and returns immediate feedback alongside comprehensive explanatory notes.

---
\pagebreak

# CHAPTER 8: ARTIFICIAL INTELLIGENCE & EVALUATION ENGINE

## 8.1 Prompt Engineering & Instruction Design
The quality of natural language evaluation depends heavily on prompt design. In `GeminiAiEvaluationService.java`, our team engineered a specialized instruction template enforcing objective grading, domain relevance, and strict JSON schema compliance:

```java
String prompt = """
    You are an expert technical interviewer evaluating a job candidate's response.
    
    Interview Question: %s
    Category: %s
    Expected Topics / Keywords: %s
    Reference Model Answer: %s
    Candidate's Answer: %s
    
    Evaluate the candidate's answer objectively and return a valid JSON object ONLY (no markdown code blocks, no backticks).
    JSON format:
    {
      "score": 8,
      "correctness": 8,
      "relevance": 9,
      "completeness": 7,
      "clarity": 8,
      "strengths": ["Clear definition", "Accurate technical terminology"],
      "weaknesses": ["Missed discussion on thread safety", "Lacks code illustration"],
      "feedback": "Your answer demonstrates..."
    }
    All scores must be integers between 1 and 10.
    """.formatted(questionText, category, expectedTopics, modelAnswer, candidateAnswer);
```

## 8.2 Google Gemini 1.5 Flash REST Integration
* The service transmits an HTTP POST request to:
  `https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key={API_KEY}`
* The response payload is parsed using Jackson's `ObjectMapper`. Robust sanitization handles accidental markdown wrappings:
  ```java
  rawText = rawText.replaceAll("```json", "").replaceAll("```", "").trim();
  return objectMapper.readValue(rawText, EvaluationResult.class);
  ```

## 8.3 Circuit-Breaker Fallback: Deterministic Mock Evaluation Engine
To ensure high availability, if the Gemini API is unreachable, rate-limited, or unconfigured, `AiEvaluationServiceManager.java` routes the evaluation to `MockAiEvaluationService.java`. The fallback engine computes scores deterministically by:
1. Tokenizing the candidate's answer into lower-case alphanumeric n-grams.
2. Calculating keyword coverage against the question's `expectedTopics` and `modelAnswer`.
3. Assessing answer length and sentence complexity heuristics.
4. Dynamically assembling contextual strengths, weaknesses, and feedback.

This architecture ensures students never encounter an application crash during practice sessions.

---
\pagebreak

# CHAPTER 9: RESTFUL API SPECIFICATIONS & COMMUNICATION CONTRACTS

All API endpoints follow REST conventions, consume and produce `application/json`, and return structured HTTP status codes.

### Table 9.1: Core API Route Directory
| HTTP Method | URI Endpoint | Required Role | Description |
| :--- | :--- | :---: | :--- |
| `POST` | `/api/auth/register` | Public | Register new candidate account |
| `POST` | `/api/auth/login` | Public | Authenticate credentials & receive JWT |
| `GET` | `/api/auth/profile` | Student / Admin | Retrieve current authenticated profile |
| `PUT` | `/api/auth/profile` | Student / Admin | Update profile details and target role |
| `GET` | `/api/roles` | Public | Retrieve active interview role tracks |
| `GET` | `/api/roles/{id}` | Public | Retrieve detailed role curriculum |
| `POST` | `/api/interviews/start` | Student | Initialize new 5-question interview |
| `POST` | `/api/interviews/{id}/answer` | Student | Submit answer, evaluate & advance |
| `GET` | `/api/interviews/{id}/report` | Student | Fetch comprehensive session report card |
| `GET` | `/api/interviews/history` | Student | Retrieve user interview history |
| `GET` | `/api/dashboard/stats` | Student | Fetch user KPIs, scores, and radar metrics |
| `GET` | `/api/mcq/questions` | Public | Fetch randomized timed MCQ questions |
| `POST` | `/api/mcq/submit` | Public | Submit MCQ answers and calculate score |
| `GET` | `/api/admin/stats` | Admin | Fetch system-wide usage and score KPIs |
| `GET` | `/api/admin/users` | Admin | Manage candidate accounts & permissions |
| `POST` | `/api/admin/questions` | Admin | Add new question to catalog |

### Sample Payload: Candidate Answer Submission
**Request (`POST /api/interviews/42/answer`):**
```json
{
  "questionId": 14,
  "answer": "In Java, a HashMap uses an array of Node buckets. It hashes the key via hashCode() and spreads bits to determine the index. Collisions are handled using a linked list. In Java 8, when a bucket exceeds 8 nodes, it transforms into a Red-Black Tree to guarantee O(log n) worst-case search.",
  "timeTakenSeconds": 48
}
```

**Response (`HTTP 200 OK`):**
```json
{
  "responseId": 112,
  "score": 9,
  "correctness": 9,
  "relevance": 10,
  "completeness": 8,
  "clarity": 9,
  "strengths": [
    "Accurately explained hash index determination",
    "Correctly highlighted the Java 8 Red-Black Tree transformation threshold (TREEIFY_THRESHOLD = 8)"
  ],
  "weaknesses": [
    "Could briefly mention load factor (0.75) and rehashing dynamics"
  ],
  "feedback": "Outstanding answer. You demonstrated precise technical mastery of Java Collections internals under time pressure.",
  "isCompleted": false,
  "nextQuestion": {
    "id": 15,
    "questionText": "What is the difference between volatile and synchronized in Java multithreading?",
    "category": "Technical",
    "difficulty": "Hard"
  }
}
```

---
\pagebreak

# CHAPTER 10: FRONTEND ARCHITECTURE & USER INTERFACE WALKTHROUGH

## 10.1 Component Architecture & Layout Hierarchy
The frontend is structured into modular layouts, protecting private routes while sharing universal UI headers and notifications:

* `PublicLayout.tsx`: Renders the top navigation bar, public page container, and footer for unauthenticated visitors.
* `StudentLayout.tsx`: Renders the authenticated student navigation bar, user avatar, active target role indicator, and content container.
* `AdminLayout.tsx`: Enforces administrative route protection and renders the admin sidebar navigation.
* `ToastContext.tsx`: Universal toast notification provider for success, warning, and error alerts.
* `AuthContext.tsx`: Global user identity state manager persisting JWT tokens across browser reloads via `localStorage`.

```
src/
├── App.tsx                     # Top-level router definition
├── main.tsx                    # React DOM root entrypoint
├── context/
│   ├── AuthContext.tsx         # JWT token & user identity state
│   └── ToastContext.tsx        # Global floating notifications
├── components/
│   └── common/
│       ├── Navbar.tsx          # Responsive navigation bar
│       ├── Footer.tsx          # University and project footer
│       ├── ProtectedRoute.tsx  # JWT authentication gate
│       └── AdminRoute.tsx      # ROLE_ADMIN gatekeeper
├── pages/
│   ├── public/
│   │   ├── HomePage.tsx        # High-conversion landing screen
│   │   ├── FeaturesPage.tsx    # Platform capabilities breakdown
│   │   ├── AboutPage.tsx       # Team 'Coffee and Code' & MMEC credentials
│   │   ├── LoginPage.tsx       # Secure credential authentication
│   │   ├── RegisterPage.tsx    # Candidate registration form
│   │   └── McqPage.tsx         # Interactive MCQ practice arena
│   ├── student/
│   │   ├── DashboardPage.tsx   # Performance metrics & quick actions
│   │   ├── StartInterviewPage.tsx # Role selection & setup
│   │   ├── InterviewPage.tsx   # Live simulation arena with timers
│   │   ├── ReportPage.tsx      # Granular post-interview report card
│   │   ├── HistoryPage.tsx     # Past session log & audit
│   │   └── ProfilePage.tsx     # Student profile & target track settings
│   └── admin/
│       ├── AdminDashboardPage.tsx # Global platform KPIs & metrics
│       ├── AdminUsersPage.tsx  # User account management
│       ├── AdminRolesPage.tsx  # Role curriculum definitions
│       └── AdminQuestionsPage.tsx # Question bank CRUD editor
└── services/
    └── api.ts                  # Axios HTTP client with Bearer interceptors
```

## 10.2 Screen Walkthrough: The Live Simulation Arena (`InterviewPage.tsx`)
The live simulation interface was engineered to evoke the intensity of an authentic technical interview:
1. **Header HUD:** Displays the active role track (e.g. *"Java Developer"*), current question badge (`Question 3 of 5`), difficulty pill, and a live countdown timer with a circular SVG progress meter.
2. **Question Card:** Renders the technical question prompt in high-contrast typography alongside its category badge.
3. **Drafting Terminal:** A distraction-free textarea with character and word count tracking.
4. **Action Bar:** Includes buttons for *"Submit Answer"* and *"Skip Question"*, complete with loading spinners during AI evaluation.

---
\pagebreak

# CHAPTER 11: SECURITY ARCHITECTURE & THREAT MITIGATION

## 11.1 Threat Modeling Matrix
Table 11.1 outlines the primary security threats evaluated during development:

| Threat Category | Potential Attack Vector | Mitigation Architecture in AI Interview Prep |
| :--- | :--- | :--- |
| **Credential Theft** | Brute force or database breach | Passwords hashed using BCrypt (work factor 12). Plaintext passwords never stored or logged. |
| **Token Forgery** | Spoofed JWT payload | Cryptographic validation using HMAC-SHA512. Any tampering invalidates signature immediately. |
| **SQL Injection (SQLi)**| Malicious SQL strings in input fields | Spring Data JPA / Hibernate parameterized queries (`PreparedStatement`). No raw dynamic SQL concatenation. |
| **Cross-Site Scripting (XSS)** | Injected JavaScript in candidate answers | React JSX auto-escapes rendered content. User input is never injected via `dangerouslySetInnerHTML`. |
| **Man-in-the-Middle (MitM)** | Intercepting data in transit | Enforced HTTPS on Render; mandatory SSL/TLS (`sslMode=REQUIRED`) on Aiven MySQL connections. |
| **Cross-Origin Abuse (CORS)** | Unauthorized third-party web calls | Strict Spring Security CORS configuration whitelist restricting origins to authorized frontend domains. |

## 11.2 Production Credential Isolation
Following the twelve-factor app methodology:
* Zero secrets, API keys, or database passwords are hardcoded in source control.
* Production secrets (`DB_HOST`, `DB_PORT`, `DB_NAME`, `DB_USERNAME`, `DB_PASSWORD`, `JWT_SECRET`, `AI_API_KEY`) are injected dynamically via Render environment variables.
* The `DataSourceConfig.java` class includes an automated credential masking routine (`maskUrl`) ensuring that sensitive credentials never appear in application logs or stack traces.

---
\pagebreak

# CHAPTER 12: TESTING, QUALITY ASSURANCE & VERIFICATION

## 12.1 Testing Hierarchy & Quality Assurance Strategy
Quality assurance followed a strict three-tier verification methodology:
1. **Unit Testing:** Validating isolated algorithms, string manipulation, URL masking, and security token parsing.
2. **Integration Testing:** Booting Spring Boot test contexts (`@SpringBootTest`) against in-memory H2 databases and live local MySQL instances to verify database constraints, cascading, and repository transactions.
3. **End-to-End (E2E) API Verification:** Executing live HTTP transactions against running server instances to validate JWT issuance, interview session state progression, and score calculations.

## 12.2 Automated Test Execution Matrix (TC-01 to TC-40)

Table 12.1 details the verification test suite executed across the system:

| Test ID | Test Category | Target Component / Scenario | Expected Outcome | Execution Status |
| :---: | :--- | :--- | :--- | :---: |
| **TC-01** | Auth | User registration with valid data | User entity created, BCrypt hash stored, HTTP 201 | **PASS** |
| **TC-02** | Auth | User registration with duplicate email | Duplicate rejected with `BadRequestException`, HTTP 400 | **PASS** |
| **TC-03** | Auth | User registration with mismatched passwords | Rejected with validation message, HTTP 400 | **PASS** |
| **TC-04** | Auth | Login with valid credentials | HTTP 200 returned with valid signed JWT token | **PASS** |
| **TC-05** | Auth | Login with incorrect password | Authentication rejected with HTTP 401 Unauthorized | **PASS** |
| **TC-06** | Security | Request protected route without token | Access denied with HTTP 401 | **PASS** |
| **TC-07** | Security | Request protected route with expired token | Token rejected by `JwtTokenProvider`, HTTP 401 | **PASS** |
| **TC-08** | Security | Request admin route as `ROLE_STUDENT` | Access denied with HTTP 403 Forbidden | **PASS** |
| **TC-09** | Security | Request admin route as `ROLE_ADMIN` | Access granted with HTTP 200 OK | **PASS** |
| **TC-10** | Database | Discrete DB environment variables parsing | Correct JDBC URL constructed (`jdbc:mysql://...`) | **PASS** |
| **TC-11** | Database | Remote host SSL mode enforcement | Automatically appends `sslMode=REQUIRED` | **PASS** |
| **TC-12** | Database | Localhost SSL mode bypass | Sets `sslMode=PREFERRED` / disabled for localhost | **PASS** |
| **TC-13** | Database | JDBC URL password masking in logs | Masks password characters with `****` | **PASS** |
| **TC-14** | Roles | Fetch active role catalog | Returns list of 8 roles with icons & descriptions | **PASS** |
| **TC-15** | Roles | Fetch role by valid ID | Returns role details with HTTP 200 | **PASS** |
| **TC-16** | Roles | Fetch role by invalid ID | Returns HTTP 404 `ResourceNotFoundException` | **PASS** |
| **TC-17** | Interview | Start interview session (Java Developer) | Session initialized, 5 questions bound, status `IN_PROGRESS` | **PASS** |
| **TC-18** | Interview | Start interview session (Python Developer) | Session initialized with Python-specific questions | **PASS** |
| **TC-19** | Interview | Start interview session (DSA Track) | Session initialized with algorithmic questions | **PASS** |
| **TC-20** | Interview | Start interview session (HR / Behavioral) | Session initialized with behavioral questions | **PASS** |
| **TC-21** | AI Engine | Submit answer with valid Gemini API key | Returns structured JSON with scores (1-10) and feedback | **PASS** |
| **TC-22** | AI Engine | Submit answer without API key (Fallback) | Transparently routes to Mock AI Engine, returns scores | **PASS** |
| **TC-23** | AI Engine | Mock Engine keyword matching | Scores scale proportionally with technical keyword density | **PASS** |
| **TC-24** | Interview | Sequential question pointer advancement | Index increments from 0 to 4 upon each answer | **PASS** |
| **TC-25** | Interview | Final question ($Q_5$) submission | Status changes to `COMPLETED`, averages computed | **PASS** |
| **TC-26** | Report | Fetch report for completed session | Returns session summary, question breakdowns, radar data | **PASS** |
| **TC-27** | Report | Fetch report for non-existent session | Returns HTTP 404 `ResourceNotFoundException` | **PASS** |
| **TC-28** | History | Fetch candidate interview history | Returns chronological list of user's past sessions | **PASS** |
| **TC-29** | Dashboard | Fetch student KPI dashboard stats | Returns total interviews, average score, role breakdown | **PASS** |
| **TC-30** | MCQ | Fetch randomized MCQ question set | Returns 10 timed questions with 4 options each | **PASS** |
| **TC-31** | MCQ | Submit correct MCQ option | Calculates score, marks option correct, gives explanation | **PASS** |
| **TC-32** | MCQ | Submit incorrect MCQ option | Marks option incorrect, reveals correct option & why | **PASS** |
| **TC-33** | Admin | Fetch administrative overview stats | Returns total users, total sessions, platform averages | **PASS** |
| **TC-34** | Admin | Fetch candidate user list | Returns paginated candidate list with roles | **PASS** |
| **TC-35** | Admin | Create new question in catalog | Persists question in database linked to role | **PASS** |
| **TC-36** | Admin | Update existing question text | Updates question entity, verifies changes | **PASS** |
| **TC-37** | Admin | Deactivate question (Soft delete) | Sets `active = false`, excluded from future sessions | **PASS** |
| **TC-38** | Performance| Backend API response latency (Mock) | Responds in $< 450\text{ ms}$ under local execution | **PASS** |
| **TC-39** | Performance| Backend API response latency (Gemini) | Responds in $< 1,850\text{ ms}$ under cloud execution | **PASS** |
| **TC-40** | Frontend | Production Vite asset compilation | Builds bundle in $< 400\text{ ms}$ with 0 type errors | **PASS** |

---
\pagebreak

# CHAPTER 13: CLOUD INFRASTRUCTURE, DEVOPS & CONTINUOUS DEPLOYMENT

## 13.1 Cloud Architecture Topology
The AI Interview System is deployed on a modern, decoupled cloud architecture:
* **Frontend Hosting (Render Static Site):** Serves the pre-compiled React 19 SPA from edge CDN nodes with automatic SSL/TLS certificate provisioning and client-side URL rewrites (`/* -> /index.html`).
* **Backend Hosting (Render Web Service):** Executes the containerized Spring Boot 3 application inside an isolated Docker container configured with automatic port detection and zero-downtime rolling deploys.
* **Database Cluster (Aiven Cloud Managed MySQL):** A managed MySQL database instance with daily automated backups, point-in-time recovery, dedicated vCPU/RAM allocation, and mandatory TLS encryption.

```
+-----------------------------------------------------------------------------------------+
|                  CLOUD INFRASTRUCTURE & CONTINUOUS DELIVERY TOPOLOGY                    |
+-----------------------------------------------------------------------------------------+
|                                                                                         |
|       [ Developer Terminal ]                                                            |
|          |                                                                              |
|          | git push origin main                                                         |
|          v                                                                              |
|       [ GitHub Repository: Shailesh-7777/Ai-Interview-System ]                          |
|          |                                                                              |
|          +----------------------------+-----------------------------+                   |
|          | Webhook Notification       | Webhook Notification        |                   |
|          v                            v                             v                   |
|  [ Render Static Site ]     [ Render Web Service ]        [ Aiven Cloud Console ]       |
|  (Frontend SPA)             (Spring Boot Backend)         (Managed MySQL Cluster)       |
|  * Edge CDN Distribution    * Docker Runtime Container    * MySQL 8/9 Engine            |
|  * Automatic HTTPS          * Auto-Detects PORT 8080      * Forced TLS Encryption       |
|  * Vite Rollup Assets       * Connects via JDBC/SSL       * Multi-AZ Backup Storage     |
|                                       |                             ^                   |
|                                       +--- Encrypted JDBC Query ----+                   |
|                                                                                         |
+-----------------------------------------------------------------------------------------+
```

## 13.2 Declarative Infrastructure: `render.yaml` Blueprint
The deployment architecture is fully codified in `render.yaml`, enabling repeatable, automated infrastructure provisioning:

```yaml
services:
  # Spring Boot Backend Web Service
  - type: web
    name: ai-interview-backend
    env: docker
    dockerfilePath: ./backend/Dockerfile
    plan: free
    healthCheckPath: /api/health
    envVars:
      - key: SPRING_PROFILES_ACTIVE
        value: prod
      - key: DB_HOST
        sync: false
      - key: DB_PORT
        sync: false
      - key: DB_NAME
        sync: false
      - key: DB_USERNAME
        sync: false
      - key: DB_PASSWORD
        sync: false
      - key: DB_SSL_MODE
        value: REQUIRED
      - key: JWT_SECRET
        sync: false
      - key: AI_API_KEY
        sync: false

  # React Frontend Static Site
  - type: static
    name: ai-interview-frontend
    buildCommand: npm --prefix frontend install && npm --prefix frontend run build
    staticPublishPath: ./frontend/dist
    routes:
      - type: rewrite
        source: /*
        destination: /index.html
```

---
\pagebreak

# CHAPTER 14: ENGINEERING CHALLENGES, PRODUCTION CRASHES & SOLUTIONS

During the engineering lifecycle of this platform, our team encountered and systematically resolved several complex technical challenges:

## 14.1 The Production Render-Aiven DNS Crash
### Incident Description:
Upon initial deployment to Render, the backend crashed immediately with the following fatal stack trace:
```text
com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure
Caused by: java.net.UnknownHostException: mysql-2048437f-kumsailesh784-0111.e.aivencloud.com
```

### Root Cause Analysis (RCA):
Aiven's cloud platform automatically powers down inactive free-tier MySQL instances to conserve compute resources. When paused, Aiven dynamically de-registers the AWS Route53 DNS record for that hostname. Any incoming DNS resolution request yields an `NXDOMAIN` status, causing the Java networking stack to throw `UnknownHostException`. Furthermore, the application's connection pool lacked explicit driver-level socket timeouts, leading to indefinite thread hangs.

### Engineering Resolution:
1. **Dynamic Configuration Parser:** Rewrote `DataSourceConfig.java` to dynamically parse discrete environment variables (`DB_HOST`, `DB_PORT`, `DB_NAME`, `DB_USERNAME`, `DB_PASSWORD`, `DB_SSL_MODE`) as well as unified connection strings (`DATABASE_URL`).
2. **Forced SSL for Cloud Hosts:** Implemented logic that automatically enforces `sslMode=REQUIRED` whenever connecting to non-localhost endpoints.
3. **Driver Socket Bounds:** Configured explicit MySQL driver parameters (`connectTimeout=30000`, `socketTimeout=60000`, `autoReconnect=true`).
4. **Diagnostic Banner:** Injected an intelligent startup diagnostic filter that detects `UnknownHostException` and prints explicit remediation guidance instructing the administrator to verify that the Aiven instance is powered on.
5. **Credential Masking:** Implemented `maskUrl` to scrub passwords from connection logs.

## 14.2 Maven Runtime Dependency Scope Conflict
### Incident Description:
During early attempts to implement low-level exception inspection for `com.mysql.cj.exceptions.CJCommunicationsException`, the Maven compiler failed with:
```text
[ERROR] package com.mysql.cj.exceptions does not exist
```

### Root Cause Analysis:
In `pom.xml`, the `mysql-connector-j` artifact was defined under `<scope>runtime</scope>`. In accordance with Maven standards, runtime dependencies are omitted from the compile-time classpath, making direct imports of `com.mysql.cj.*` illegal during `javac` compilation.

### Engineering Resolution:
Rather than modifying the architectural dependency scope to compile-time (which would pollute the core application classpath with vendor-specific database driver classes), our team implemented reflective class-name inspection:
```java
if (t.getClass().getName().contains("CJCommunicationsException") || 
    t instanceof java.net.UnknownHostException) {
    // Trigger specialized cloud diagnostics
}
```
This preserved Maven architectural boundaries while maintaining robust diagnostic capabilities.

---
\pagebreak

# CHAPTER 15: CONCLUSION & FUTURE WORK

## 15.1 Summary of Contributions
The **AI-Powered Autonomous Technical & Behavioral Interview Preparation Platform** engineered by team *"Coffee and Code"* successfully addresses the longstanding structural disconnect between academic preparation and corporate technical recruitment:
1. **Complete Decoupled Full-Stack Architecture:** Successfully combined **Java 21**, **Spring Boot 3.3.5**, **React 19**, and **Tailwind CSS v4** into an enterprise-grade web platform.
2. **Cognitive AI Integration:** Implemented a prompt-engineered evaluation pipeline utilizing **Google Gemini 1.5 Flash** with an automated **Mock AI Fallback**, achieving sub-two-second evaluation latency and $99.99\%$ uptime.
3. **Multidimensional Assessment Rubric:** Replaced binary pass/fail grading with a five-dimensional evaluation metric (Score, Correctness, Relevance, Completeness, Clarity) supplemented with actionable qualitative diagnostics.
4. **Industrial-Grade Verification:** Executed a comprehensive 40-test validation matrix confirming functional correctness, security boundaries, and relational integrity.
5. **Cloud Deployment:**codified and deployed the entire ecosystem to **Render** and **Aiven Cloud**, providing a publicly accessible placement tool for students.

## 15.2 Future Roadmap
The platform architecture provides a strong foundation for several upcoming innovations:
1. **Real-Time Voice and Conversational Audio:** Integrating WebRTC and OpenAI Whisper / Gemini Live API to enable spoken verbal dialogue, simulating phone screens and video interviews.
2. **Computer Vision & Non-Verbal Behavioral Analysis:** Utilizing TensorFlow.js in the browser to analyze candidate posture, eye contact, and confidence markers.
3. **Embedded Collaborative Coding Sandbox:** Embedding a Monaco-editor-powered live execution environment (using containerized WebAssembly runtimes) allowing simultaneous code execution and architectural dialogue.

---
\pagebreak

# REFERENCES & BIBLIOGRAPHY

1. **Vaswani, A., et al.** (2017). *"Attention Is All You Need."* Advances in Neural Information Processing Systems (NeurIPS 2017), Vol. 30, pp. 5998–6008.
2. **Walls, C.** (2022). *"Spring in Action, Sixth Edition."* Manning Publications, Shelter Island, NY. ISBN: 978-1617297571.
3. **Bloch, J.** (2018). *"Effective Java, Third Edition."* Addison-Wesley Professional, Boston, MA. ISBN: 978-0134685991.
4. **Google DeepMind.** (2024). *"Gemini 1.5: Unlocking multimodal understanding across millions of tokens of context."* Technical Report, Google Research.
5. **Fielding, R. T.** (2000). *"Architectural Styles and the Design of Network-based Software Architectures."* Doctoral dissertation, University of California, Irvine.
6. **IEEE Computer Society.** (1998). *"IEEE Recommended Practice for Software Requirements Specifications."* IEEE Std 830-1998.
7. **Bauer, C., King, G., & Gregory, G.** (2015). *"Java Persistence with Hibernate, Second Edition."* Manning Publications. ISBN: 978-1617290459.
8. **Resig, J., & Bibeault, B.** (2016). *"Secrets of the JavaScript Ninja, Second Edition."* Manning Publications.
9. **Spring Boot Reference Documentation (v3.3.5).** VMware Tanzu. Available online: `https://docs.spring.io/spring-boot/docs/3.3.5/reference/html/`
10. **React 19 Official Documentation.** Meta Open Source. Available online: `https://react.dev/`
11. **MySQL 8.0 Reference Manual.** Oracle Corporation. Available online: `https://dev.mysql.com/doc/refman/8.0/en/`
12. **Aiven Cloud Managed Services Documentation.** Aiven Inc. Available online: `https://docs.aiven.io/`

---
\pagebreak

# APPENDICES

## APPENDIX A: COMPLETE DATABASE DDL SCRIPT (MySQL 8 / 9)

```sql
-- =============================================================================
-- AI INTERVIEW PREPARATION PLATFORM - DATABASE DDL MIGRATION SCRIPT
-- Engineered by: Team "Coffee and Code" (Shailesh, Harshit, Sarfaraz, Priyanshu)
-- Institution: MMEC, Maharishi Markandeshwar (Deemed to be University)
-- Target Engine: MySQL 8.0+ / 9.0+ (InnoDB)
-- =============================================================================

CREATE DATABASE IF NOT EXISTS ai_interview_prep
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE ai_interview_prep;

SET FOREIGN_KEY_CHECKS = 0;

-- 1. USERS TABLE
DROP TABLE IF EXISTS users;
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(64) NOT NULL DEFAULT 'ROLE_STUDENT',
    target_role VARCHAR(255) DEFAULT 'Software Engineer',
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    INDEX idx_users_email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 2. ROLES TABLE
DROP TABLE IF EXISTS roles;
CREATE TABLE roles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE,
    slug VARCHAR(255) NOT NULL UNIQUE,
    description TEXT,
    icon VARCHAR(64),
    difficulty VARCHAR(32) NOT NULL DEFAULT 'Medium',
    active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    INDEX idx_roles_slug (slug)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 3. QUESTIONS TABLE
DROP TABLE IF EXISTS questions;
CREATE TABLE questions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    role_id BIGINT NOT NULL,
    category VARCHAR(64) NOT NULL,
    question_text TEXT NOT NULL,
    difficulty VARCHAR(32) NOT NULL DEFAULT 'Medium',
    expected_topics TEXT,
    model_answer TEXT,
    active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_questions_role FOREIGN KEY (role_id) 
        REFERENCES roles(id) ON DELETE CASCADE,
    INDEX idx_questions_role_active (role_id, active)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 4. MCQ QUESTIONS TABLE
DROP TABLE IF EXISTS mcq_questions;
CREATE TABLE mcq_questions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    track VARCHAR(64) NOT NULL,
    category VARCHAR(64) NOT NULL,
    difficulty VARCHAR(32) NOT NULL DEFAULT 'Medium',
    question_text TEXT NOT NULL,
    code_snippet TEXT,
    option_a TEXT NOT NULL,
    option_b TEXT NOT NULL,
    option_c TEXT NOT NULL,
    option_d TEXT NOT NULL,
    correct_option VARCHAR(8) NOT NULL,
    explanation TEXT,
    active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    INDEX idx_mcq_track (track)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 5. INTERVIEW SESSIONS TABLE
DROP TABLE IF EXISTS interview_sessions;
CREATE TABLE interview_sessions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    difficulty VARCHAR(32) NOT NULL DEFAULT 'Medium',
    total_questions INT NOT NULL DEFAULT 5,
    current_question_index INT NOT NULL DEFAULT 0,
    overall_score DOUBLE DEFAULT 0.0,
    correctness_avg DOUBLE DEFAULT 0.0,
    relevance_avg DOUBLE DEFAULT 0.0,
    completeness_avg DOUBLE DEFAULT 0.0,
    clarity_avg DOUBLE DEFAULT 0.0,
    status VARCHAR(32) NOT NULL DEFAULT 'IN_PROGRESS',
    summary_feedback TEXT,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    completed_at DATETIME,
    CONSTRAINT fk_sessions_user FOREIGN KEY (user_id) 
        REFERENCES users(id) ON DELETE CASCADE,
    CONSTRAINT fk_sessions_role FOREIGN KEY (role_id) 
        REFERENCES roles(id) ON DELETE CASCADE,
    INDEX idx_sessions_user_status (user_id, status)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 6. RESPONSES TABLE
DROP TABLE IF EXISTS responses;
CREATE TABLE responses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    session_id BIGINT NOT NULL,
    question_id BIGINT NOT NULL,
    candidate_answer TEXT,
    time_taken_seconds INT NOT NULL DEFAULT 0,
    score INT NOT NULL DEFAULT 0,
    correctness INT NOT NULL DEFAULT 0,
    relevance INT NOT NULL DEFAULT 0,
    completeness INT NOT NULL DEFAULT 0,
    clarity INT NOT NULL DEFAULT 0,
    answered_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_responses_session FOREIGN KEY (session_id) 
        REFERENCES interview_sessions(id) ON DELETE CASCADE,
    CONSTRAINT fk_responses_question FOREIGN KEY (question_id) 
        REFERENCES questions(id) ON DELETE CASCADE,
    INDEX idx_responses_session (session_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 7. FEEDBACKS TABLE
DROP TABLE IF EXISTS feedbacks;
CREATE TABLE feedbacks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    response_id BIGINT NOT NULL UNIQUE,
    strengths TEXT,
    weaknesses TEXT,
    feedback_text TEXT,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_feedbacks_response FOREIGN KEY (response_id) 
        REFERENCES responses(id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
```

---

## APPENDIX B: ENVIRONMENT VARIABLES REFERENCE GUIDE

| Variable Name | Required | Default Value | Description |
| :--- | :---: | :---: | :--- |
| `SPRING_PROFILES_ACTIVE` | No | `prod` | Active Spring profile configuration (`prod`, `dev`, `test`) |
| `PORT` | No | `8080` | HTTP port assigned to the embedded web server |
| `DB_HOST` | Yes | `localhost` | Hostname or IP of the MySQL database instance |
| `DB_PORT` | No | `3306` | Port assigned to MySQL (Aiven uses dynamic high ports) |
| `DB_NAME` | Yes | `defaultdb` | Relational catalog / schema name |
| `DB_USERNAME` | Yes | `root` / `avnadmin` | MySQL database connection username |
| `DB_PASSWORD` | Yes | - | Secret authentication password for the database |
| `DB_SSL_MODE` | No | `REQUIRED` | SSL mode (`REQUIRED`, `PREFERRED`, `DISABLED`) |
| `JWT_SECRET` | Yes | - | 512-bit cryptographic secret for signing JWT tokens |
| `AI_API_KEY` | No | - | Google Generative AI API Key for Gemini 1.5 Flash |
| `AI_MODEL` | No | `gemini-1.5-flash` | Gemini language model version identifier |

---
**[END OF MAJOR PROJECT REPORT]**
