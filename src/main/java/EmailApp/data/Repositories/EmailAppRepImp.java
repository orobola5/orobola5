package EmailApp.data.Repositories;

import EmailApp.data.models.Email;

public class EmailAppRepImp implements EmailAppRep {

    @Override
    public void createEmail(String firstName, String lastName){
        System.out.println(firstName+" "+lastName);
    }

        @Override
        public Email setDepartment () {
        Email mail = new Email();
             int choice = Integer.parseInt(("""
                    1.for Sales
                    2.for Development
                    3.for Accounting
                    4.for None
                    """));
            switch (choice) {
                case 1 -> System.out.println("sales");
                case 2-> System.out.println("Development");
                case 3-> System.out.println("Accounting");
                case 4 -> System.out.println(" ");
                default -> System.out.println(-1);
            }

            return mail;
        }

        @Override
        public String randomPassword ( int length){
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
            char[] password = new char[length];
            for (int i = 0; i < length; i++) {
                int random = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(random);
            }

            return new String(password);
        }



}