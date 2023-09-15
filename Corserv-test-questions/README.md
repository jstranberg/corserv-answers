## Notes

  

Welcome to John Tranberg's submission for the Automation Test Engineer Postion.

  

## Folder Structure

  

The workspace contains three folders:

  

-  `corserv`: the folder with the selenium project

-  `mysql`: the folder with the sql question/answer

-  `open_questions`: responses to the open ended questions.

  

## corserv project

[High level overview video recording](https://drive.google.com/file/d/1p9aZt_R97H3MA5iYb_vx30gGHGxUtPnC/view?usp=sharing)
  
#### Additional notes:

 - For me, this was partially an exercise in setting up an automation
   framework from scratch. 
 - I did not have Java, webdriver, project dependencies, etc installed
   on my new mac. 
  - No webdriver for current chrome version (117). Had to downgrade to 114. 
  - I retrofitted [an open source repo I found](https://github.com/sdetAutomation/seleniumJava)
   - I chose this because it used the POM as this project structure is one I'm most familiar
   with.


The corserv selenium script was not able to completely run.
Possible culprits: 

 1. old repo/framework that I broke with the retrofit
 2. Selector I chose was just off 
 3. bot detection stuff from Discover. 
