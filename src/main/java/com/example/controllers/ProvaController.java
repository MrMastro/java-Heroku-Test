/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.controllers;

import com.example.models.ResponseDefault;
import com.example.services.ResponseDefaultService;
import com.example.servicesImpl.ResponseDefaultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * PROVA CONTROLLER RESTITUIRA' JSON/TEXT (Rest)
*/

//@Controller -> restituisce pagine web (Normal Controller)

@RestController // -> restituisce json (Rest)
public class ProvaController {
//  public class JsonResult { -> Model "integrato"
//    public JsonResult(String field){
//      this.field = field;
//    }
//    public String field;
//  }
  @Autowired
  private ResponseDefaultService responseDefaultService;
  /*
  * Quando si usa Autowired la classe in questione deve avere l'annotazione di quello che è secondo spring
  * Esempio se Autowiredi un Service, dentro quel service ci dovrà essere l'annotazione @Service
  * */

  @RequestMapping("/provaController")
  ResponseDefault newAdress() {
    System.out.println("prova");
    //responseDefaultService = new ResponseDefaultServiceImpl();
    return responseDefaultService.getResponseMessage("Success");
  }

  @PostMapping("/provaPost")
  String provaPost(){
    System.out.println("prova");
    return "Success!";
  }
}
