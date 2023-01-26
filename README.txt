Compeleted automation exercises at http://uitestingplayground.com/ using maven, selenium, cucumber, testng, log4j, allure, jenkins

Run from command line:

All exercises (default thread-count = 3):
mvn -Dbrowser="chrome" clean test

Dynamic id exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@DynamicID clean test

ClassAttribute exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@ClassAttribute clean test

HiddenLayers exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@HiddenLayers clean test

LoadDelay exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@LoadDelay clean test

AJAXData exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@AJAXData clean test

ClientSideDelay exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@ClientSideDelay clean test

Click exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@Click clean test

TextInput exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@TextInput clean test

ScrollBars exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@ScrollBars clean test

DynamicTable exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@DynamicTable clean test

ProgressBar exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@ProgressBar clean test

Visibility exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@Visibility clean test

SampleApp exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@SampleApp clean test

MouseOver exercise:
mvn -Dbrowser="chrome" -Dcucumber.filter.tags=@MouseOver clean test