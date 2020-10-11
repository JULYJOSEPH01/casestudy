@Uploadingimage
Feature: Uploading and removing image using automation testscript

 @Sc11
 Scenario: Verify  user enable to upload an image properly
 Then Verify user should login he application
 And Verify user should click on Chooseafile text
 And Verify user should select filename containing image
 When verify user should observe upload image suceessfully
 
 @Sc11
 Scenario: Verify user enable to remove image properly
 Then Verify user should click on close button 
 When Verify user should remove image successfully