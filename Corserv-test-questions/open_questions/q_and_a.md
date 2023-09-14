> In order to reduce code duplication, describe how you would handle code 
that is shared among multiple test classes and methods. 
  I would create a utils directory with a helper script file (ex: utils/helper.js), and then reference that code there. 


> How would you handle selecting the desired option in a drop-down element 
that is not a normal HTML select element?
  It depends on how the html is structured. In a previous role, there weren't normal select elements in specific dropdowns. They were <li> elements. We did a count of the <li> elements and then referenced them by index. Could also do a search of child elements that contain specific text. 