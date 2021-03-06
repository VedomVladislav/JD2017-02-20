package by.it.korzun.project.java.controller;

import javax.servlet.http.HttpServletRequest;

enum Actions {
    SIGNUP{
        {
            this.command = new CmdSignUp();
        }
    },
    LOGIN{
        {
            this.command = new CmdLogin();
        }
    },
    LOGOUT{
        {
            this.command = new CmdLogout();
        }
    },
    CREATEBRIGADE{
        {
            this.command = new CmdCreateBrigade();
        }
    },
    REMOVEBRIGADE{
        {
            this.command = new CmdRemoveBrigade();
        }
    },
    CREATEFLIGHT{
        {
            this.command = new CmdCreateFlight();
        }
    },
    REMOVEFLIGHT{
        {
            this.command = new CmdRemoveFlight();
        }
    },
    STAFF{
        {
            this.command = new CmdStaff();
        }
    },
    DISPATCHER{
        {
            this.command = new CmdDispatcher();
        }
    },
    ADMIN{
        {
            this.command = new CmdAdmin();
        }
    },
    ERROR{
        {
            this.command = new CmdError();
        }
    };

    public Action command;
    static Action defineFrom(HttpServletRequest request){
        String command = request.getParameter("command");
        Action res;
        try {
            res = Actions.valueOf(command.toUpperCase()).command;
        }catch (IllegalArgumentException e){
            res = Actions.ERROR.command;
        }
        return res;
    }
}
