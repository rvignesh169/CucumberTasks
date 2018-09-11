$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/toolsQA/cucumber/testfeatures/netflix.feature");
formatter.feature({
  "name": "Netflix home page check",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Netflix"
    }
  ]
});
formatter.scenario({
  "name": "Netflix terms of use scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Netflix"
    },
    {
      "name": "@termsofuse"
    }
  ]
});
formatter.step({
  "name": "the user is in netflix home page",
  "keyword": "Given "
});
formatter.match({
  "location": "NetFlixTest.the_user_is_in_netflix_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the terms of use link",
  "keyword": "When "
});
formatter.match({
  "location": "NetFlixTest.the_user_clicks_the_terms_of_use_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies the various points in terms of use",
  "rows": [
    {
      "cells": [
        "1",
        "Membership"
      ]
    },
    {
      "cells": [
        "2",
        "Free Trials"
      ]
    },
    {
      "cells": [
        "3",
        "Billing and Cancellation"
      ]
    },
    {
      "cells": [
        "4",
        "Netflix Service"
      ]
    },
    {
      "cells": [
        "5",
        "Passwords and Account Access"
      ]
    },
    {
      "cells": [
        "6",
        "Warranties and Limitations on Liability"
      ]
    },
    {
      "cells": [
        "7",
        "Class Action Waiver"
      ]
    },
    {
      "cells": [
        "8",
        "Miscellaneous"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NetFlixTest.the_user_verifies_the_various_points_in_terms_of_use(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Corporate Information first para text Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Netflix"
    },
    {
      "name": "@CorporateInformation"
    }
  ]
});
formatter.step({
  "name": "the user is in netflix home page",
  "keyword": "Given "
});
formatter.match({
  "location": "NetFlixTest.the_user_is_in_netflix_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Corporate Information link",
  "keyword": "When "
});
formatter.match({
  "location": "NetFlixTest.the_user_clicks_the_Corporate_Information_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies the first para",
  "rows": [
    {
      "cells": [
        "Netflix serves members in many different countries. The Netflix entity that provides you with access to the Netflix service and qualifies as your data controller depends on your country of membership, and will be listed in your membership or payment confirmation email."
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NetFlixTest.the_user_verifies_the_first_para(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Media Centre Press Releases and Blogs button Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Netflix"
    },
    {
      "name": "@MediaCentre"
    }
  ]
});
formatter.step({
  "name": "the user is in netflix home page",
  "keyword": "Given "
});
formatter.match({
  "location": "NetFlixTest.the_user_is_in_netflix_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Media Centre link",
  "keyword": "When "
});
formatter.match({
  "location": "NetFlixTest.the_user_clicks_the_Media_Centre_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies the Press Releases and Blogs button is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "NetFlixTest.the_user_verifies_the_Press_Releases_and_Blogs_button_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/main/java/toolsQA/cucumber/testfeatures/networkspeed.feature");
formatter.feature({
  "name": "NetworkSpeed check",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NetworkSpeed"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Network Speed check using fast.com",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@fast.com"
    }
  ]
});
formatter.step({
  "name": "The user is in  fast.com",
  "keyword": "Given "
});
formatter.step({
  "name": "the user waits to see the network speed",
  "keyword": "When "
});
formatter.step({
  "name": "the user validates the actual network speed with expected \"\u003cExpectedSpeed\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ExpectedSpeed"
      ]
    },
    {
      "cells": [
        "25"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Network Speed check using fast.com",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NetworkSpeed"
    },
    {
      "name": "@fast.com"
    }
  ]
});
formatter.step({
  "name": "The user is in  fast.com",
  "keyword": "Given "
});
formatter.match({
  "location": "NetSpeedStepdefinition.the_user_is_in_fast_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user waits to see the network speed",
  "keyword": "When "
});
formatter.match({
  "location": "NetSpeedStepdefinition.the_user_waits_to_see_the_network_speed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user validates the actual network speed with expected \"25\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NetSpeedStepdefinition.the_user_validates_the_actual_network_speed_with_expected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/main/java/toolsQA/cucumber/testfeatures/toolsQADemo.feature");
formatter.feature({
  "name": "ToolQa Registration feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ToolQa"
    }
  ]
});
formatter.scenario({
  "name": "ToolQa Registration page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ToolQa"
    },
    {
      "name": "@firstname\u0026lastname"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_is_in_Registration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User is entering the firstname and lastname",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_User_is_entering_the_firstname_and_lastname(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User is verifying the entered values in firstname and lastname",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_User_is_verifying_the_entered_values_in_firstname_and_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verifying Marital Status field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MaritalStatus"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user selects the marital status \"\u003cmaritalstaus\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user verifies the selected value \"\u003cmaritalstaus\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "maritalstaus"
      ]
    },
    {
      "cells": [
        "single"
      ]
    },
    {
      "cells": [
        "married"
      ]
    },
    {
      "cells": [
        "divorced"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying Marital Status field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ToolQa"
    },
    {
      "name": "@MaritalStatus"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_is_in_Registration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user selects the marital status \"single\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_user_selects_the_marital_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verifies the selected value \"single\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_verifies_the_selected_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying Marital Status field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ToolQa"
    },
    {
      "name": "@MaritalStatus"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_is_in_Registration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user selects the marital status \"married\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_user_selects_the_marital_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verifies the selected value \"married\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_verifies_the_selected_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying Marital Status field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ToolQa"
    },
    {
      "name": "@MaritalStatus"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_is_in_Registration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user selects the marital status \"divorced\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_user_selects_the_marital_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verifies the selected value \"divorced\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_verifies_the_selected_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verifying Hobby field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Hobby"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user selects the Hobby  \"\u003chobby\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user verifies the selected value in hobby \"\u003chobby\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "hobby"
      ]
    },
    {
      "cells": [
        "dance"
      ]
    },
    {
      "cells": [
        "reading"
      ]
    },
    {
      "cells": [
        "cricket"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying Hobby field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ToolQa"
    },
    {
      "name": "@Hobby"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_is_in_Registration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user selects the Hobby  \"dance\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_user_selects_the_Hobby(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verifies the selected value in hobby \"dance\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_verifies_the_selected_value_in_hobby(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying Hobby field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ToolQa"
    },
    {
      "name": "@Hobby"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_is_in_Registration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user selects the Hobby  \"reading\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_user_selects_the_Hobby(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verifies the selected value in hobby \"reading\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_verifies_the_selected_value_in_hobby(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying Hobby field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ToolQa"
    },
    {
      "name": "@Hobby"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_is_in_Registration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user selects the Hobby  \"cricket\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_user_selects_the_Hobby(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verifies the selected value in hobby \"cricket\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_verifies_the_selected_value_in_hobby(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ToolQa Registration page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ToolQa"
    },
    {
      "name": "@phoneno,username\u0026email"
    }
  ]
});
formatter.step({
  "name": "The User is in Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_is_in_Registration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User is entering the phoneno username and email",
  "rows": [
    {
      "cells": [
        "9999954265",
        "password",
        "a@aol.in"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_User_is_entering_the_phoneno_username_and_email(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User is verifying the entered values in phoneno password and email",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_User_is_verifying_the_entered_values_in_phoneno_password_and_email()"
});
formatter.result({
  "status": "passed"
});
});