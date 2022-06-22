package EmailApp.data.models;

import EmailApp.data.Repositories.EmailAppRep;
import EmailApp.data.Repositories.EmailAppRepImp;

public class EmailAppMain {
    public static void main(String[] args) {
        EmailAppRep emailAppRep= new EmailAppRepImp();
        emailAppRep.createEmail("ola","bowale");
         String dept = emailAppRep.setDepartment();
        System.out.println(dept);
     String rav=emailAppRep.randomPassword(10);
        System.out.println(rav);
    }
}
