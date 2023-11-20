package de.nordakademie.iaa.librarysystem.action;


/**
 * Die Klasse LogoutAction ermöglicht die Abmeldung,
 * welche durch das Framework Apache Shiro abgedeckt wird.
 * @author Michael Hubrecht, Max Schwichtenberg
 * @version 1.0
 */
public class LogoutAction extends ShiroBaseAction {
    public String execute() {
            if (isAuthenticated()) {
                getShiroUser().logout();
            }
            return SUCCESS;
    }
}