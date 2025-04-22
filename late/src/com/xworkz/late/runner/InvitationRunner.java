
package com.xworkz.late.runner;

import com.xworkz.late.internal.epackage.*;
import com.xworkz.late.external.epackage.*;

public class InvitationRunner {
    public static void main(String[] args) {
        Cover cover = new Bedcover();
        Invitation invitation = new Invitation(cover);
        invitation.send();
    }
}
