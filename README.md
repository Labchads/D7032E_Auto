# D7032E_Auto
Automated tests and test coverage (deadline 30 September, 17:00)


#The functional requirements specification that you have received, that has been implemented, and that you now need to write tests for, is as follows:

Age requirements:
* [ID: 101] The student must be at least 20 years old to receive subsidiary and student loans.
* [ID: 102] The student may receive subsidiary until the year they turn 56.
* [ID: 103] The student may not receive any student loans from the year they turn 47.
Study pace requirements
* [ID: 201] The student must be studying at least half time to receive any subsidiary.
* [ID: 202] A student studying less than full time is entitled to 50% subsidiary.
* [ID: 203] A student studying full time is entitled to 100% subsidiary.
Income while studying requirements
* [ID: 301] A student who is studying full time or more is permitted to earn a maximum of 85 813SEK per year in order to receive any subsidiary or student loans.
* [ID: 302] A student who is studying less than full time is allowed to earn a maximum of 128 722SEK per year in order to receive any subsidiary or student loans.
Completion ratio requirement
* [ID: 401] A student must have completed at least 50% of previous studies in order to receive any subsidiary or student loans.
When and amount paid requirements
Full time students are entitled to:
* [ID: 501] Student loan: 7088 SEK / month
* [ID: 502] Subsidiary: 2816 SEK / month
Less than full time students are entitled to:
* [ID: 503] Student loan: 3564 SEK / month
* [ID: 504] Subsidiary: 1396 SEK / month
* [ID: 505] A person who is entitled to receive a student loan will always receive the full amount.
* [ID: 506] Student loans and subsidiary is paid on the last weekday (Monday to Friday) every month.

Requirement for passing the assignment:

* You must achieve at least 80% test coverage for PaymentImpl.java
* You must identify all the bugs that have been introduced in the updated PaymentImpl. There are a total of 6 errors, but these may of course be reported several times in your tests so identify the 6 different errors and link them to the ID in the functional requirements specification.