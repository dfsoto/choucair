#Author : Daniel
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course

  @scenario1
  Scenario: Search for a automation course
    Given than Daniel wants to learn automation at the academy choucair
    | strUser  | strPassword  |
    | YourUser | YourPassword |
    When he search for the course on the choucair academy platform
    | strCourse |
    | Metodologia Bancolombia |
    Then he finds the course called resources
    | strCourse |
    | Metodologia Bancolombia |