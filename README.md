# GmailTestFramework
Gmail testing framework based on:

Tool to automate web browsers:
- Selenium WebDriver

Test tool:
- TestNG

Report tool:
- log4j

Build tool:
- Maven

##The test designed to cover the simple case one of the gmail users workflows. Scenario steps:
1. Open gmail & login
2. Click “Compose” button
3. Fill “To”, “Subject” & “message” fields
4. Click “send” button
5. Verify that message is in “sent” folder
6. Remove message from the “sent” folder
