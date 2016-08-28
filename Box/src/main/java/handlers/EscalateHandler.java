package handlers;

import com.MailService;

/**
 * Created by xinszhou on 16/8/28.
 */
public class EscalateHandler {
    public void escalate() {
        System.out.println("Escalated");
        MailService.sendEmail();
    }
}
