@wip
Feature: Login Functionality

  Background: User is already on the login page
    Given User is on the login page

  @AGIL-1611
  Scenario Outline:AC1 - User should be able to login as HR user with Valid Credentials
    When HR user types a valid username "<username>"
    When HR user types a valid password "<password>"
    When HR user click the login button
    Then HR user should log in on the homepage
    Examples:
      | username                | password |
      | hr11@cybertekschool.com | UserUser |
      | hr21@cybertekschool.com | UserUser |
      | hr31@cybertekschool.com | UserUser |
      | hr41@cybertekschool.com | UserUser |
      | hr54@cybertekschool.com | UserUser |
      | hr65@cybertekschool.com | UserUser |
      | hr87@cybertekschool.com | UserUser |
      | hr98@cybertekschool.com | UserUser |

  Scenario Outline: AC2 - User should be able to login as Helpdesk user with Valid Credentials
    When Helpdesk user types a valid username "<username>"
    When Helpdesk user types a valid password "<password>"
    When Helpdesk user click the login button
    Then Helpdesk user should log in on the homepage
    Examples:
      | username                      | password |
      | helpdesk43@cybertekschool.com | UserUser |
      | helpdesk11@cybertekschool.com | UserUser |
      | helpdesk45@cybertekschool.com | UserUser |
      | helpdesk89@cybertekschool.com | UserUser |
      | helpdesk12@cybertekschool.com | UserUser |
      | helpdesk51@cybertekschool.com | UserUser |
      | helpdesk56@cybertekschool.com | UserUser |
      | helpdesk99@cybertekschool.com | UserUser |

  Scenario Outline: AC3 - User should be able to login as Marketing user with Valid Credentials
    When Marketing user types a valid username "<username>"
    When Marketing user types a valid password "<password>"
    When Marketing user click the login button
    Then Marketing user should log in on the homepage
    Examples:
      | username                       | password |
      | marketing43@cybertekschool.com | UserUser |
      | marketing11@cybertekschool.com | UserUser |
      | marketing45@cybertekschool.com | UserUser |
      | marketing89@cybertekschool.com | UserUser |
      | marketing12@cybertekschool.com | UserUser |
      | marketing51@cybertekschool.com | UserUser |
      | marketing56@cybertekschool.com | UserUser |
      | marketing99@cybertekschool.com | UserUser |

  Scenario Outline: Users should not be able to login with invalid credentials
    When User types invalid username "<username>"
    When User types invalid password "<password>"
    When User click the login button
    Then User should not log in in the homepage
    Examples:
      | username                       | password   |
      | marketing43@cybertekschool.com | Invalid    |
      | helpdesk89@cybertekschool.com  | Invalid    |
      | hr98@cybertekschool.com        | Invalid    |
      | Invalid31@cybertekschool.com   | Invalid    |
      | Invalid@cybertekschool.com     | UserUser   |






