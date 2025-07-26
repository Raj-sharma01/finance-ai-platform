# 🧾 Project Implementation Checklist

## 🔹 Phase 1: Core Setup & User Auth (Most Critical)
- [x] Project setup (Spring Boot, modules/services)
- [ ] DB integration (MySQL/Postgres)
- [ ] Entity & DTO design (`User`, etc.)
- [ ] User Registration
- [ ] Email/Username uniqueness check
- [ ] Password encryption (BCrypt)
- [ ] User Login
- [ ] JWT generation on login
- [ ] JWT verification middleware (Interceptor/Filter)
- [ ] View current user profile (`/me`)
- [ ] Basic input validation (DTO validation with annotations)

## 🔹 Phase 2: Account Management & Security Enhancements
- [ ] Session logout
- [ ] JWT refresh (with refresh token endpoint)
- [ ] Forgot/reset password (token/OTP via email)
- [ ] Change password (from profile or reset)
- [ ] Edit profile
- [ ] Deactivate/Delete account (soft/hard delete)
- [ ] Global exception handling (`@ControllerAdvice`)
- [ ] Centralized error response format

## 🔹 Phase 3: Bank Account Linking & Transaction Management
- [ ] Link bank account (mock or Plaid)
- [ ] List linked accounts
- [ ] Unlink bank account
- [ ] Get account details/balance
- [ ] Sync/import transactions
- [ ] List/filter transactions
- [ ] Add manual transaction
- [ ] Edit/delete transaction
- [ ] Real-time updates (WebSocket/SSE)

## 🔹 Phase 4: Budgeting, Goals, Preferences
- [ ] Create/Edit/Delete budget
- [ ] View budget status
- [ ] Set/Edit/Delete goals
- [ ] Get goal progress
- [ ] Set/view preferences (e.g., notification toggles)
- [ ] Platform settings per user

## 🔹 Phase 5: Analytics, AI/ML Features
- [ ] Dashboard/overview (net worth, spending)
- [ ] Monthly reports (downloadable)
- [ ] Notifications (budget exceeded, etc.)
- [ ] Auto-categorize transactions
- [ ] Spending predictions
- [ ] Personalized insights
- [ ] Conversational AI advisor

## 🔹 Phase 6: Platform Infrastructure
- [ ] API Gateway
- [ ] Service discovery (e.g., Eureka/Consul)
- [ ] Microservices separation (User, Bank, Transaction, Analytics, AI)
- [ ] Rate limiting/security filters
- [ ] Centralized logging (e.g., ELK or structured logs)

## 🔹 Phase 7: Quality, Testing, DevOps
- [ ] Unit tests (service/controller layers)
- [ ] Integration tests (API-level)
- [ ] API documentation (OpenAPI/Swagger)
- [ ] Dockerize services
- [ ] CI/CD pipeline (GitHub Actions/GitLab CI)