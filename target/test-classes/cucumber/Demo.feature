Feature: User Login

Scenario: Login with valid credintials
 Given User navigates to Login Page 
 When Uesrd enters valid Email "amotooricap9@gmail.com"
 And Enters  Valid Password"12345"
 And Clicks on Login button
 Then User Should Login Succesfully
 
Scenario: Login with invalid credintials
 Given User navigates to Login Page 
 When Uesrd enters invalid Email "Aamotooricap9@gmail.com"
 And Enters invalid Password"1245"
 And Clicks on Login button
 Then User Should get Proper Warrning Message 
    
 