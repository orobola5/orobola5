package africa.semicolon.trueCaller.controllers;

import africa.semicolon.trueCaller.services.ContactServices;
import africa.semicolon.trueCaller.services.ContactServicesImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    @Autowired
    private  ContactServices contactServices;
    @PostMapping("/contact")
        public String addContact(@RequestBody RequestDto requestDto){
            contactServices.addContact(requestDto.getFirstName(), requestDto.getLastName(), requestDto.getPhoneNumber());
            return "Added Successfully";
        }

        @GetMapping("/contact/{firstName}")
        public String findByFirstName(@PathVariable String firstName){
            return contactServices.findByFirstName(firstName).toString();
        }
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    class RequestDto{
    private String firstName;
    private String lastName;
    private  String phoneNumber;

    }

