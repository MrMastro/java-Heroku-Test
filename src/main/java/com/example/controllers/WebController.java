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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * WEB CONTROLLER RESTITUIRA' PAGINE HTML
*/

//@RestController // -> restituisce json (Rest)
@Controller //-> restituisce pagine web (Normal Controller)
public class WebController {

  @RequestMapping("/provaControllerWeb")
  String newAdress() {
    System.out.println("prova");
    return "index.html";
  }

  @PostMapping("/provaPostWeb")
  String provaPost(){
    System.out.println("prova");
    return "index";
  }
}
