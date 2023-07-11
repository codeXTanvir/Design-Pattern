public class user 
{
    public void login(String username, String password)
    {
       //System.out.printf("Login Service");
    }

    public static void main(String[] args)
    {
        EmailService emailService = new EmailService();
        emailService.senEmail("Momo","HI","Hello");
    }
}

class EmailService
{
    public void senEmail(String to, String subject, String body)
    {
        System.out.printf("Email Service");
    }

}