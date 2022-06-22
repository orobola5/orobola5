package EmailApp.data.models;

import EmailApp.data.Repositories.EmailAppRep;
import EmailApp.data.Repositories.EmailAppRepImp;

public class EmailAppMain {
    public static void main(String[] args) {
        EmailAppRep emailAppRep= new EmailAppRepImp();
        emailAppRep.createEmail("ola","bowale");
//       Email mail=emailAppRep.setDepartment();
//        System.out.println(mail);
     String rav=emailAppRep.randomPassword(10);
        System.out.println(rav);
    }
}
