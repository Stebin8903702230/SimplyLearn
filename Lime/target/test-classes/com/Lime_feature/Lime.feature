Feature: School
  Scenario Outline: Student MarkList
    Given HalfYearly Exam
    When Student Present
    And User Enters <Subjects>
    And User Enters <Marks>
    Then Generate Total Marks

    Examples:
    			|Subjects		| Marks	|
    			|Physics 		| 56	|
    			|Maths 			| 85	|
    			|Science		| 60	|
    			|Chemistry 		| 75	|
    			|English		| 75	|
    			|Tamil	 		| 75	|
    			|Economics 		| 75	|
    		