Feature: Purchase of books in Sahi Training Site
  I, as a customer
  Require adding books to the shopping cart
  To make the purchase of the books.

  Background:
    Given that Geovanny enter the user "test" and password "secret" to the login page

    @test1
  Scenario Outline: Verify the total cost of a purchase
      When  add <java_core> java core books, <ruby> ruby for rails books and <python> python cookbooks to the shopping cart
      Then  verify the total cost of the books
    Examples:
      | java_core | ruby | python |
      |3          |5     |2       |