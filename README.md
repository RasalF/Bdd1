# Bdd1

# How to run the test
mvn verify -Denv=qa -Dbrowser=ch

# How to run the test using test tag
mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@smoke"